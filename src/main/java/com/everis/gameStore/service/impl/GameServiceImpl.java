package com.everis.gameStore.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesModifyRequestVO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.repository.GamesRepository;
import com.everis.gameStore.service.GameService;

/**
 * The Class GameServiceImpl.
 */
@Service
public class GameServiceImpl implements GameService {

    /** The games repository. */
    @Autowired
    GamesRepository gamesRepository;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#createGame(com.everis.gameStore.domain.VO.GamesRequestVO)
     */
    @Override
    public void createGame(GamesRequestVO gamesRequestVO) {
        gamesRepository.createGame(gamesRequestVO.getGameName(), gamesRequestVO.getValue(), gamesRequestVO.getStock(),
                gamesRequestVO.getImg());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#getAllGames()
     */
    @Override
    public List<GamesResponseDTO> getAllGames() {
        List<GamesResponseDTO> listGamesResponseDTO = gamesRepository.getAllGames();
        return listGamesResponseDTO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#getGameById(java.math.BigInteger)
     */
    @Override
    public List<GamesResponseVO> getGameById(BigInteger idGames) {
        List<GamesResponseVO> listGamesResponseVO = gamesRepository.getGameById(idGames);
        return listGamesResponseVO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#updateGame(java.math.BigInteger)
     */
    @Override
    public void updateGame(GamesModifyRequestVO gamesModifyRequestVO) {
        gamesRepository.updateGame(gamesModifyRequestVO.getIdGames(), gamesModifyRequestVO.getGameName(),
                gamesModifyRequestVO.getImg(), gamesModifyRequestVO.getValue(), gamesModifyRequestVO.getStock());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.GameService#deleteGame(java.math.BigInteger)
     */
    @Override
    public void deleteGame(BigInteger idGames) {
        gamesRepository.deleteGame(idGames);
    }
}
