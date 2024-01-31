package com.filemetadata.filemetadatastorage.repository;

import com.filemetadata.filemetadatastorage.entity.FileMetadataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface File metadata relational repository.
 */
@Repository
public interface FileMetadataRelationalRepository extends JpaRepository<FileMetadataEntity, String> {
}
