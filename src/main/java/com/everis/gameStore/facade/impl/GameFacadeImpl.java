package com.everis.gameStore.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.exceptions.GameNotFoundException;
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
    private GameService gameService;

    /** The game mapper. */
    @Autowired
    private GameMapper gameMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#createGame(com.everis.gameStore.domain .DTO.GamesRequestDTO)
     */
    @Override
    public GamesResponseDTO createGame(GamesRequestDTO gamesRequestDTO) {
        GamesRequestVO gamesRequestVO = gameMapper.GamesRequestDtoToGamesRequestVO(gamesRequestDTO);
        GamesResponseVO gamesResponseVO = gameService.createGame(gamesRequestVO);
        return gameMapper.GamesResponseVoToGamesResponseDTO(gamesResponseVO);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#getAllGames()
     */
    @Override
    public List<GamesResponseDTO> getAllGames() {
        List<GamesResponseDTO> listGamesResponseDTO = new ArrayList<>();
        GamesResponseDTO gamesListResponseDTO = new GamesResponseDTO();

        List<GamesResponseVO> listGamesResponseVO = gameService.getAllGames();
        for (GamesResponseVO games : listGamesResponseVO) {
            gamesListResponseDTO = gameMapper.GamesResponseVoToGamesResponseDTO(games);
            listGamesResponseDTO.add(gamesListResponseDTO);
        }
        return listGamesResponseDTO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#getGameById(java.math.BigInteger)
     */
    @Override
    public GamesResponseDTO getGameById(Long idGames) throws GameNotFoundException {
        GamesResponseDTO gamesResponseDTO = new GamesResponseDTO();
        GamesResponseVO gamesResponseVO = gameService.getGameById(idGames);
        gamesResponseDTO = gameMapper.GamesResponseVoToGamesResponseDTO(gamesResponseVO);
        return gamesResponseDTO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#updateGame(com.everis.gameStore.domain.DTO.GamesRequestDTO,
     * java.lang.Long)
     */
    @Override
    public GamesResponseDTO updateGame(GamesRequestDTO gamesRequestDTO, Long id) throws GameNotFoundException {
        GamesRequestVO gamesRequestVO = gameMapper.GamesRequestDtoToGamesRequestVO(gamesRequestDTO);
        GamesResponseVO gamesResponseVO = gameService.updateGame(gamesRequestVO, id);
        return gameMapper.GamesResponseVoToGamesResponseDTO(gamesResponseVO);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.GameFacade#deleteGame(java.math.BigInteger)
     */
    @Override
    public void deleteGame(Long idGames) {
        gameService.deleteGame(idGames);
    }
}
