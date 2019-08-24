package com.everis.gameStore.facade;

import java.util.List;

import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.exceptions.GameNotFoundException;

/**
 * The Interface GameFacade.
 */
public interface GameFacade {

    /**
     * Creates the game.
     *
     * @param gamesRequestDTO the games request DTO
     */
    GamesResponseDTO createGame(GamesRequestDTO gamesRequestDTO);

    /**
     * Gets the all games.
     *
     * @return the all games
     */
    List<GamesResponseDTO> getAllGames();

    /**
     * Gets the game by id.
     *
     * @param idGames the id games
     * @return the game by id
     * @throws GameNotFoundException 
     */
    GamesResponseDTO getGameById(Long idGames) throws GameNotFoundException;

    /**
     * Update game.
     *
     * @param gamesRequestVO the games request VO
     * @throws GameNotFoundException 
     */
    GamesResponseDTO updateGame(GamesRequestDTO gamesRequestVO, Long id) throws GameNotFoundException;

    /**
     * Delete game.
     *
     * @param idGames the id games
     */
    void deleteGame(Long idGames);
}
