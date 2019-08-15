package com.everis.gameStore.facade.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.ClientsListResponseDTO;
import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.facade.ClientFacade;

/**
 * The Class ClientFacadeImpl.
 */
@Component
public class ClientFacadeImpl implements ClientFacade {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.facade.ClientFacade#createClient(com.everis.gameStore.
	 * domain.DTO.ClientsRequestDTO)
	 */
	@Override
	public void createClient(ClientsRequestDTO clientsRequestDTO) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.facade.ClientFacade#getAllClients()
	 */
	@Override
	public ClientsListResponseDTO getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.facade.ClientFacade#getClientById(java.math.BigInteger)
	 */
	@Override
	public List<ClientsResponseDTO> getClientById(BigInteger idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.facade.ClientFacade#updateClient(java.math.BigInteger)
	 */
	@Override
	public void updateClient(BigInteger idClient) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.facade.ClientFacade#deleteClient(java.math.BigInteger)
	 */
	@Override
	public void deleteClient(BigInteger idClient) {
		// TODO Auto-generated method stub

	}

}
