package com.everis.gameStore.service;

import java.math.BigInteger;
import java.util.List;

import com.everis.gameStore.domain.DTO.ClientsListResponseDTO;
import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;

/**
 * The Interface ClientService.
 */
public interface ClientService {

	/**
	 * Creates the client.
	 *
	 * @param clientsRequestDTO
	 *            the clients request DTO
	 */
	void createClient(ClientsRequestDTO clientsRequestDTO);

	/**
	 * Gets the all clients.
	 *
	 * @return the all clients
	 */
	ClientsListResponseDTO getAllClients();

	/**
	 * Gets the client by id.
	 *
	 * @param idClient
	 *            the id client
	 * @return the client by id
	 */
	List<ClientsResponseDTO> getClientById(BigInteger idClient);

	/**
	 * Update client.
	 *
	 * @param idClient
	 *            the id client
	 */
	void updateClient(BigInteger idClient);

	/**
	 * Delete client.
	 *
	 * @param idClient
	 *            the id client
	 */
	void deleteClient(BigInteger idClient);
}
