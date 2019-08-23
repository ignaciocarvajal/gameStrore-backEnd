package com.everis.gameStore.domain.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesRequestVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesRequestVO {

	/** The game name. */
	private String gameName;

	/** The image. */
	private List<ImageResponseVO> image;
	
	/** The activation code. */
	private String activationCode;

	/** The value. */
	private Integer value;

	/** The stock. */
	private Integer stock;
}
