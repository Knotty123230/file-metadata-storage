package com.filemetadata.filemetadatastorage.service;

import com.filemetadata.filemetadatastorage.dto.FileMetadataDTO;
import com.filemetadata.filemetadatastorage.entity.FileMetadataEntity;
import com.filemetadata.filemetadatastorage.repository.FileMetadataRelationalRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static com.filemetadata.filemetadatastorage.constants.KafkaConstants.KAFKA_CONSUMER_GROUP_ID;
import static com.filemetadata.filemetadatastorage.constants.KafkaConstants.TOPIC_CREATE_ORDER;

/**
 * The type Kafka service.
 */
@Service
@Slf4j
public class KafkaService implements IKafkaService{
    private final FileMetadataRelationalRepository fileMetadataElasticSearchRepository;

    /**
     * Instantiates a new Kafka service.
     *
     * @param fileMetadataElasticSearchRepository the file metadata elastic search repository
     */
    public KafkaService(FileMetadataRelationalRepository fileMetadataElasticSearchRepository) {
        this.fileMetadataElasticSearchRepository = fileMetadataElasticSearchRepository;
    }

    @KafkaListener(topics = TOPIC_CREATE_ORDER, groupId = KAFKA_CONSUMER_GROUP_ID, properties = {"spring.json.value.default.type=com.filemetadata.filemetadatastorage.dto.FileMetadataDTO"})
    @Override
    public FileMetadataEntity save(FileMetadataDTO fileMetadataDTO) {
        FileMetadataEntity fileMetadataEntity = FileMetadataEntity.builder()
                .id(fileMetadataDTO.getId())
                .description(fileMetadataDTO.getDescription())
                .httpContentType(fileMetadataDTO.getHttpContentType())
                .header(fileMetadataDTO.getHeader())
                .size(fileMetadataDTO.getSize())
                .name(fileMetadataDTO.getName())
                .build();
        log.info("consuming file metadata {}", fileMetadataDTO);
        return fileMetadataElasticSearchRepository.save(fileMetadataEntity);
    }
}
