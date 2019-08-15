package com.everis.gameStore.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.DTO.ClientsListResponseDTO;
import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.service.ClientService;

/**
 * The Class ClientServiceImpl.
 */
@Service
public class ClientServiceImpl implements ClientService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.ClientService#createClient(com.everis.gameStore.
	 * domain.DTO.ClientsRequestDTO)
	 */
	@Override
	public void createClient(ClientsRequestDTO clientsRequestDTO) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.service.ClientService#getAllClients()
	 */
	@Override
	public ClientsListResponseDTO getAllClients() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.everis.gameStore.service.ClientService#getClientById(java.math.
	 * BigInteger)
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
	 * com.everis.gameStore.service.ClientService#updateClient(java.math.BigInteger)
	 */
	@Override
	public void updateClient(BigInteger idClient) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.everis.gameStore.service.ClientService#deleteClient(java.math.BigInteger)
	 */
	@Override
	public void deleteClient(BigInteger idClient) {
		// TODO Auto-generated method stub

	}
}
