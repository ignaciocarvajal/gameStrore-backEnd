package com.everis.gameStore.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.DTO.GamesListResponseDTO;
import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.service.GameService;

/**
 * The Class GameServiceImpl.
 */
@Service
public class GameServiceImpl implements GameService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.GameService#createGame(com.everis.gameStore.
	 * domain.DTO.GamesRequestDTO)
	 */
	@Override
	public void createGame(GamesRequestDTO gamesRequestDTO) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.service.GameService#getAllGames()
	 */
	@Override
	public GamesListResponseDTO getAllGames() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.GameService#getGameById(java.math.BigInteger)
	 */
	@Override
	public List<GamesResponseDTO> getGameById(BigInteger idGames) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.GameService#updateGame(java.math.BigInteger)
	 */
	@Override
	public void updateGame(BigInteger idGames) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.GameService#deleteGame(java.math.BigInteger)
	 */
	@Override
	public void deleteGame(BigInteger idGames) {
		// TODO Auto-generated method stub

	}
}
