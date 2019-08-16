package com.everis.gameStore.facade.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.GamesListResponseDTO;
import com.everis.gameStore.domain.DTO.GamesModifyRequestDTO;
import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.facade.GameFacade;
import com.everis.gameStore.mapper.GameMapper;
import com.everis.gameStore.service.GameService;

/**
 * The Class GameFacadeImpl.
 */
@Component
public class GameFacadeImpl implements GameFacade {

    /** The game service. */
    @Autowired
    GameService gameService;

    /** The game mapper. */
    @Autowired
    GameMapper gameMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#createGame(com.everis.gameStore.domain .DTO.GamesRequestDTO)
     */
    @Override
    public void createGame(GamesRequestDTO gamesRequestDTO) {
        gameService.createGame(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#getAllGames()
     */
    @Override
    public GamesListResponseDTO getAllGames() {
        gameService.getAllGames();
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#getGameById(java.math.BigInteger)
     */
    @Override
    public List<GamesResponseDTO> getGameById(BigInteger idGames) {
        gameService.getGameById(idGames);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#updateGame(com.everis.gameStore.domain.VO.GamesModifyRequestVO)
     */
    @Override
    public void updateGame(GamesModifyRequestDTO gamesModifyRequestDTO) {
        gameService.updateGame(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#deleteGame(java.math.BigInteger)
     */
    @Override
    public void deleteGame(BigInteger idGames) {
        gameService.deleteGame(idGames);
    }
}
