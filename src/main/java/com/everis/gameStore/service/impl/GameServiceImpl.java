package com.everis.gameStore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.model.Games;
import com.everis.gameStore.mapper.GameMapper;
import com.everis.gameStore.repository.GamesRepository;
import com.everis.gameStore.service.GameService;

/**
 * The Class GameServiceImpl.
 */
@Service
public class GameServiceImpl implements GameService {

    /** The games repository. */
    @Autowired
    private GamesRepository gamesRepository;

    /** The game mapper. */
    @Autowired
    private GameMapper gameMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#createGame(com.everis.gameStore.domain.VO.GamesRequestVO)
     */
    @Override
    public void createGame(GamesRequestVO gamesRequestVO) {
        Games games = gameMapper.GamesRequestVoToGames(gamesRequestVO);
        gamesRepository.save(games);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#getAllGames()
     */
    @Override
    public List<GamesResponseDTO> getAllGames() {
        // List<GamesResponseDTO> listGamesResponseDTO = gamesRepository.getAllGames();
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#getGameById(java.math.BigInteger)
     */
    @Override
    public List<GamesResponseVO> getGameById(Long idGames) {
        // List<GamesResponseVO> listGamesResponseVO = gamesRepository.getGameById(idGames);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#updateGame(com.everis.gameStore.domain.VO.GamesRequestVO)
     */
    @Override
    public void updateGame(GamesRequestVO gamesRequestVO) {
        Games games = gameMapper.GamesRequestVoToGames(gamesRequestVO);
        gamesRepository.save(games);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#deleteGame(java.lang.Long)
     */
    @Override
    public void deleteGame(Long idGames) {
        gamesRepository.deleteById(idGames);
    }
}
