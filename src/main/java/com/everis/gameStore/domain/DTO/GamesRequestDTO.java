package com.everis.gameStore.domain.DTO;

import java.util.List;

import com.everis.gameStore.domain.model.Images;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesRequestDTO {

	/** The game name. */
	private String gameName;

	/** The image. */
	private List<Images> image;
	
	/** The activation code. */
	private String activationCode;

	/** The value. */
	private Integer value;

	/** The stock. */
	private Integer stock;
}
