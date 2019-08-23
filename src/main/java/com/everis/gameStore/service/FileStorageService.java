package com.everis.gameStore.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import com.everis.gameStore.domain.VO.ImageResponseVO;

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

    /**
     * Delete file.
     *
     * @param fileName the file name
     */
    void deleteFile(String fileName);

    /**
     * Save data.
     *
     * @param imageResponseVO the image response VO
     */
    void saveData(ImageResponseVO imageResponseVO);
}
