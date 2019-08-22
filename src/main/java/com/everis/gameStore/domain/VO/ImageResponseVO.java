package com.everis.gameStore.domain.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ImageResponseVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ImageResponseVO {

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
