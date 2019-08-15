package com.everis.gameStore.service;

import java.math.BigInteger;
import java.util.List;

import com.everis.gameStore.domain.DTO.GamesListResponseDTO;
import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;

/**
 * The Interface GameService.
 */
public interface GameService {

	/**
	 * Creates the game.
	 *
	 * @param gamesRequestDTO
	 *            the games request DTO
	 */
	void createGame(GamesRequestDTO gamesRequestDTO);

	/**
	 * Gets the all games.
	 *
	 * @return the all games
	 */
	GamesListResponseDTO getAllGames();

	/**
	 * Gets the game by id.
	 *
	 * @param idGames
	 *            the id games
	 * @return the game by id
	 */
	List<GamesResponseDTO> getGameById(BigInteger idGames);

	/**
	 * Update game.
	 *
	 * @param idGames
	 *            the id games
	 */
	void updateGame(BigInteger idGames);

	/**
	 * Delete game.
	 *
	 * @param idGames
	 *            the id games
	 */
	void deleteGame(BigInteger idGames);
}
