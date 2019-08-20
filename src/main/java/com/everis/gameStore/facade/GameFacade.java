package com.everis.gameStore.facade;

import java.util.List;

import com.everis.gameStore.domain.DTO.GamesListResponseDTO;
import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;

/**
 * The Interface GameFacade.
 */
public interface GameFacade {

    /**
     * Creates the game.
     *
     * @param gamesRequestDTO the games request DTO
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
     * @param idGames the id games
     * @return the game by id
     */
    List<GamesResponseDTO> getGameById(Long idGames);

    /**
     * Update game.
     *
     * @param gamesRequestVO the games request VO
     */
    void updateGame(GamesRequestDTO gamesRequestVO);

    /**
     * Delete game.
     *
     * @param idGames the id games
     */
    void deleteGame(Long idGames);
}
