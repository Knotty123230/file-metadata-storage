package com.streaming.videostreaming.exception;
public class StorageException extends RuntimeException {

    public StorageException(Exception ex) {
        super(ex);
    }
}
