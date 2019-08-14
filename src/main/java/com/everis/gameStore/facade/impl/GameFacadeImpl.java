package com.everis.gameStore.facade.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.GamesListResponseDTO;
import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.facade.GameFacade;

/**
 * The Class GameFacadeImpl.
 */
@Component
public class GameFacadeImpl implements GameFacade {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.facade.GameFacade#createGame(com.everis.gameStore.domain
	 * .DTO.GamesRequestDTO)
	 */
	@Override
	public void createGame(GamesRequestDTO gamesRequestDTO) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.facade.GameFacade#getAllGames()
	 */
	@Override
	public GamesListResponseDTO getAllGames() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.facade.GameFacade#getGameById(java.math.BigInteger)
	 */
	@Override
	public List<GamesResponseDTO> getGameById(BigInteger idGames) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.facade.GameFacade#updateGame(java.math.BigInteger)
	 */
	@Override
	public void updateGame(String idGames) {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.facade.GameFacade#deleteGame(java.math.BigInteger)
	 */
	@Override
	public void deleteGame(BigInteger idGames) {
		// TODO Auto-generated method stub
	}
}
