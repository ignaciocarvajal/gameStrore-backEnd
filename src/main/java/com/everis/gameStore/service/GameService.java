package com.everis.gameStore.service;

import java.util.List;

import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.exceptions.GameNotFoundException;

/**
 * The Interface GameService.
 */
public interface GameService {

    /**
     * Creates the game.
     *
     * @param gamesRequestVO the games request VO
     */
    GamesResponseVO createGame(GamesRequestVO gamesRequestVO);

    /**
     * Gets the all games.
     *
     * @return the all games
     */
    List<GamesResponseVO> getAllGames();

    /**
     * Gets the game by id.
     *
     * @param idGames the id games
     * @return the game by id
     * @throws GameNotFoundException 
     */
    GamesResponseVO getGameById(Long idGames) throws GameNotFoundException;

    /**
     * Update game.
     *
     * @param gamesRequestVO the games request VO
     * @param id the id
     * @throws GameNotFoundException 
     */
    GamesResponseVO updateGame(GamesRequestVO gamesRequestVO, Long id) throws GameNotFoundException;

    /**
     * Delete game.
     *
     * @param idGames the id games
     */
    void deleteGame(Long idGames);
}
