package com.everis.gameStore.domain.VO;

import java.sql.Blob;

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

	/** The img. */
	private Blob img;

	/** The value. */
	private Integer value;

	/** The stock. */
	private Integer stock;
}
