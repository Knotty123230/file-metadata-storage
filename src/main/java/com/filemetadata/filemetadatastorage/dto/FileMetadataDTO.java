package com.filemetadata.filemetadatastorage.dto;

import lombok.*;


/**
 * The type File metadata dto.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FileMetadataDTO {
    private String id;
    private String header;
    private String description;
    private Long size;
    private String name;
    private String httpContentType;
}
