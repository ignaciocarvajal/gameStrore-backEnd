package com.everis.gameStore.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.everis.gameStore.config.FileStorageProperties;
import com.everis.gameStore.domain.exceptions.FileStorageException;
import com.everis.gameStore.domain.exceptions.MyFileNotFoundException;
import com.everis.gameStore.service.FileStorageService;

/**
 * The Class FileStorageServiceImpl.
 */
@Service
public class FileStorageServiceImpl implements FileStorageService {

    /** The file storage location. */
    private Path fileStorageLocation;

    /**
     * File storage service.
     *
     * @param fileStorageProperties the file storage properties
     */
    @Autowired
    public void FileStorageService(FileStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.",
                    ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.FileStorageService#storeFile(org.springframework.web.multipart.MultipartFile)
     */
    @Override
    public String storeFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.FileStorageService#loadFileAsResource(java.lang.String)
     */
    @Override
    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if (resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("File not found " + fileName, ex);
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.FileStorageService#deleteFile(java.lang.String)
     */
    @Override
    public void deleteFile(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Files.deleteIfExists(Paths.get(filePath.toUri()));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
