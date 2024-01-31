package com.filemetadata.filemetadatastorage.service;

import com.filemetadata.filemetadatastorage.dto.FileMetadataDTO;
import com.filemetadata.filemetadatastorage.entity.FileMetadataEntity;

/**
 * The interface Kafka service.
 */
public interface IKafkaService
{
    /**
     * Save file metadata entity.
     *
     * @param fileMetadataDTO the file metadata dto
     * @return the file metadata entity
     */
    FileMetadataEntity save(FileMetadataDTO fileMetadataDTO);
}
