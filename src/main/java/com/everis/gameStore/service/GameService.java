package com.everis.gameStore.service;

import java.util.List;

import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;

/**
 * The Interface GameService.
 */
public interface GameService {

    /**
     * Creates the game.
     *
     * @param gamesRequestVO the games request VO
     */
    void createGame(GamesRequestVO gamesRequestVO);

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
     */
    List<GamesResponseVO> getGameById(Long idGames);

    /**
     * Update game.
     *
     * @param gamesRequestVO the games request VO
     */
    void updateGame(GamesRequestVO gamesRequestVO);

    /**
     * Delete game.
     *
     * @param idGames the id games
     */
    void deleteGame(Long idGames);
}