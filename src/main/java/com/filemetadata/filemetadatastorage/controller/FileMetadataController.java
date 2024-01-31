package com.filemetadata.filemetadatastorage.controller;

import com.filemetadata.filemetadatastorage.entity.FileMetadataEntity;
import com.filemetadata.filemetadatastorage.repository.FileMetadataRelationalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type File metadata controller.
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FileMetadataController {
    private final FileMetadataRelationalRepository fileMetadataRelationalRepository;

    /**
     * Get file metadata entity file metadata entity.
     *
     * @param id the id
     * @return the file metadata entity
     */
    @GetMapping("/{id}")
    public FileMetadataEntity getFileMetadataEntity(@PathVariable String id){
        return fileMetadataRelationalRepository.findById(id).orElseThrow();
    }
}
