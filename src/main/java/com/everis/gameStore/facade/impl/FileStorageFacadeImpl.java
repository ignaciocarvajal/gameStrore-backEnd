package com.everis.gameStore.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.everis.gameStore.facade.FileStorageFacade;
import com.everis.gameStore.service.FileStorageService;

/**
 * The Class FileStorageFacadeImpl.
 */
@Component
public class FileStorageFacadeImpl implements FileStorageFacade {

    /** The file storage service. */
    @Autowired
    private FileStorageService fileStorageService;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.FileStorageFacade#storeFile(org.springframework.web.multipart.MultipartFile)
     */
    @Override
    public String storeFile(MultipartFile file) {
        return fileStorageService.storeFile(file);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.FileStorageFacade#loadFileAsResource(java.lang.String)
     */
    @Override
    public Resource loadFileAsResource(String fileName) {
        return fileStorageService.loadFileAsResource(fileName);
    }
}
