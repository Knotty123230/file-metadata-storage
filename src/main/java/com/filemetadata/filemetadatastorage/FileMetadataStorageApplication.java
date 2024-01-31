package com.filemetadata.filemetadatastorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The type File metadata storage application.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FileMetadataStorageApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(FileMetadataStorageApplication.class, args);
    }

}
