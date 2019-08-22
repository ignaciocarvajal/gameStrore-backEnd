package com.everis.gameStore.facade;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * The Interface FileStorageFacade.
 */
public interface FileStorageFacade {

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

    /**
     * Delete file.
     *
     * @param fileName the file name
     */
    void deleteFile(String fileName);
}
