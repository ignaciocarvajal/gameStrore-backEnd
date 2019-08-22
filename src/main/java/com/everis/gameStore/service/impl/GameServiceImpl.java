package com.everis.gameStore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<GamesResponseVO> getAllGames() {
         List<GamesResponseVO> listGamesResponseVO = new ArrayList<>();
         GamesResponseVO gamesResponseVO = new GamesResponseVO();
         List<Games> listGames = (List<Games>) gamesRepository.findAll();
         for(Games games : listGames) {
             gamesResponseVO = gameMapper.GamesToListGamesResponseVO(games);
             listGamesResponseVO.add(gamesResponseVO);
         }
        return listGamesResponseVO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#getGameById(java.math.BigInteger)
     */
    @Override
    public GamesResponseVO getGameById(Long idGames) {
        GamesResponseVO gamesResponseVO = new GamesResponseVO();
        Games game = gamesRepository.findByIdGames(idGames);
        gamesResponseVO = gameMapper.GamesToGamesResponseVO(game);
        return gamesResponseVO;
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
