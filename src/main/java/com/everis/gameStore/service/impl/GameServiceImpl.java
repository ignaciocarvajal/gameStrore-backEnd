package com.everis.gameStore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.exceptions.GameNotFoundException;
import com.everis.gameStore.domain.model.Games;
import com.everis.gameStore.mapper.GameMapper;
import com.everis.gameStore.mapper.UpdateMapper;
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
    public GamesResponseVO createGame(GamesRequestVO gamesRequestVO) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        Games games = gameMapper.GamesRequestVoToGames(gamesRequestVO);
        games.setGameName(bCryptPasswordEncoder.encode(gamesRequestVO.getGameName()));
        games = gamesRepository.save(games);
        return gameMapper.GamesToGamesResponseVO(games);
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
        for (Games games : listGames) {
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
    public GamesResponseVO getGameById(Long idGames) throws GameNotFoundException {
        GamesResponseVO gamesResponseVO = new GamesResponseVO();
        Games game = gamesRepository.findById(idGames).orElseThrow(() -> new GameNotFoundException(idGames));
        gamesResponseVO = gameMapper.GamesToGamesResponseVO(game);
        return gamesResponseVO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#updateGame(com.everis.gameStore.domain.VO.GamesRequestVO,
     * java.lang.Long)
     */
    @Override
    public GamesResponseVO updateGame(GamesRequestVO gamesRequestVO, Long id) throws GameNotFoundException {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        Games games = gamesRepository.findById(id).orElseThrow(() -> new GameNotFoundException(id));
        games.setGameName(bCryptPasswordEncoder.encode(gamesRequestVO.getGameName()));
        games = UpdateMapper.mapperGamesToGamesRequestVO(gamesRequestVO, games);
        if (null != games) {
            games = gamesRepository.save(games);
        }
        return gameMapper.GamesToGamesResponseVO(games);
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
