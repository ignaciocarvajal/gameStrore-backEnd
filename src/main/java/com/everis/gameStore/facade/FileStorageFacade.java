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

    /**
     * Save data.
     *
     * @param file the file
     * @param fileName the file name
     * @param fileDownloadUri the file download uri
     * @param fileDeleteUri the file delete uri
     * @param contentType the content type
     * @param size the size
     */
    void saveData(MultipartFile file, String fileName, String fileDownloadUri, String fileDeleteUri, String contentType,
            long size);
}
