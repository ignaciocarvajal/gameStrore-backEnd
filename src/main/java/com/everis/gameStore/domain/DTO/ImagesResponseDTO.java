package com.everis.gameStore.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class UploadFileResponseDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImagesResponseDTO {

    /** The file name. */
    private String fileName;

    /** The file download uri. */
    private String fileDownloadUri;

    /** The file delete uri. */
    private String fileDeleteUri;

    /** The file type. */
    private String fileType;

    /** The size. */
    private Long size;
}
