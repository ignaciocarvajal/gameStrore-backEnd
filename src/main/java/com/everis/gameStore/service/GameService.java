package com.everis.gameStore.service;

import java.math.BigInteger;
import java.util.List;

import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesModifyRequestVO;
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
    List<GamesResponseVO> getGameById(BigInteger idGames);

    /**
     * Update game.
     *
     * @param gamesModifyRequestVO the games modify request VO
     */
    void updateGame(GamesModifyRequestVO gamesModifyRequestVO);

    /**
     * Delete game.
     *
     * @param idGames the id games
     */
    void deleteGame(BigInteger idGames);
}
