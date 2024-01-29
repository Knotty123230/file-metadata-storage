package com.filemetadata.filemetadatastorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FileMetadataStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(FileMetadataStorageApplication.class, args);
    }

}
