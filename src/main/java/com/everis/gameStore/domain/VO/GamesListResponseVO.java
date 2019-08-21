package com.everis.gameStore.domain.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesListResponseVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesListResponseVO {

	/** The list games response VO. */
	private List<GamesResponseVO> listGamesResponse;
}
