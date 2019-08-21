package com.everis.gameStore.domain.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesListResponseDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesListResponseDTO {

	/** The list games response DTO. */
	private List<GamesResponseDTO> listGamesResponseDTO;
}
