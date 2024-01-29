package com.filemetadata.filemetadatastorage.service;

import com.filemetadata.filemetadatastorage.dto.FileMetadataDTO;
import com.filemetadata.filemetadatastorage.entity.FileMetadataEntity;

public interface IKafkaService
{
    FileMetadataEntity save(FileMetadataDTO fileMetadataDTO);
}
