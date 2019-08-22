package com.everis.gameStore.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.everis.gameStore.domain.DTO.ImagesResponseDTO;
import com.everis.gameStore.domain.VO.ImageResponseVO;
import com.everis.gameStore.facade.FileStorageFacade;
import com.everis.gameStore.mapper.FileMapper;
import com.everis.gameStore.service.FileStorageService;

/**
 * The Class FileStorageFacadeImpl.
 */
@Component
public class FileStorageFacadeImpl implements FileStorageFacade {

    /** The file storage service. */
    @Autowired
    private FileStorageService fileStorageService;

    /** The file mapper. */
    @Autowired
    private FileMapper fileMapper;

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

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.FileStorageFacade#deleteFile(java.lang.String)
     */
    @Override
    public void deleteFile(String fileName) {
        fileStorageService.deleteFile(fileName);
    }

    @Override
    public void saveData(MultipartFile file, String fileName, String fileDownloadUri, String fileDeleteUri,
            String contentType, long size) {
        ImagesResponseDTO imagesResponseDTO = new ImagesResponseDTO();
        imagesResponseDTO.setFileName(fileName);
        imagesResponseDTO.setFileDownloadUri(fileDownloadUri);
        imagesResponseDTO.setFileDeleteUri(fileDeleteUri);
        imagesResponseDTO.setFileType(file.getContentType());
        imagesResponseDTO.setSize(file.getSize());

        ImageResponseVO imageResponseVO = fileMapper.ImagesResponseDtoToImageResponseVO(imagesResponseDTO);
        fileStorageService.saveData(imageResponseVO);
    }
}
