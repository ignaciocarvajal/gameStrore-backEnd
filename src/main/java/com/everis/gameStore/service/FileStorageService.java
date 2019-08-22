package com.everis.gameStore.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * The Interface FileStorageService.
 */
public interface FileStorageService {

    /**
     * Store file.
     *
     * @param file the file
     * @return the string
     */
    String storeFile(MultipartFile file);

    /**
     * Load file as resource.
     *
     * @param fileName the file name
     * @return the resource
     */
    Resource loadFileAsResource(String fileName);
}
