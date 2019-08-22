package com.everis.gameStore.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.everis.gameStore.domain.DTO.UploadFileResponseDTO;
import com.everis.gameStore.facade.FileStorageFacade;

/**
 * The Class FileController.
 */
@RestController
public class FileController {

    /** The Constant logger. */
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    /** The file storage facade. */
    @Autowired
    private FileStorageFacade fileStorageFacade;
    
    /**
     * Upload file.
     *
     * @param file the file
     * @return the upload file response
     */
    @PostMapping("/uploadFile")
    public UploadFileResponseDTO uploadFile(@RequestParam("file") MultipartFile file) {
        String fileName = fileStorageFacade.storeFile(file);

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .path(fileName)
                .toUriString();

        return new UploadFileResponseDTO(fileName, fileDownloadUri,
                file.getContentType(), file.getSize());
    }

    /**
     * Upload multiple files.
     *
     * @param files the files
     * @return the list
     */
    @PostMapping("/uploadMultipleFiles")
    public List<UploadFileResponseDTO> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
        return Arrays.asList(files)
                .stream()
                .map(file -> uploadFile(file))
                .collect(Collectors.toList());
    }

    /**
     * Download file.
     *
     * @param fileName the file name
     * @param request the request
     * @return the response entity
     */
    @GetMapping("/downloadFile/{fileName:.+}")
    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
        Resource resource = fileStorageFacade.loadFileAsResource(fileName);

        String contentType = null;
        try {
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
        } catch (IOException ex) {
            logger.info("Could not determine file type.");
        }

        if (contentType == null) {
            contentType = "application/octet-stream";
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
