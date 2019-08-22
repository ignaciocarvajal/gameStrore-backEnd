package com.everis.gameStore.mapper;

import org.mapstruct.Mapper;

import com.everis.gameStore.domain.DTO.ImagesResponseDTO;
import com.everis.gameStore.domain.VO.ImageResponseVO;
import com.everis.gameStore.domain.model.Images;

/**
 * The Interface FileMapper.
 */
@Mapper(componentModel = "spring")
public interface FileMapper {

    /**
     * Images response dto to image response VO.
     *
     * @param imagesResponseDTO the images response DTO
     * @return the image response VO
     */
    ImageResponseVO ImagesResponseDtoToImageResponseVO(ImagesResponseDTO imagesResponseDTO);

    /**
     * Image response vo to images.
     *
     * @param imageResponseVO the image response VO
     * @return the images
     */
    Images ImageResponseVoToImages(ImageResponseVO imageResponseVO);
}
