package com.everis.gameStore.facade;

import java.util.List;

import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.domain.DTO.RolesResponseDTO;

/**
 * The Interface ClientFacade.
 */
public interface ClientFacade {

    /**
     * Creates the client.
     *
     * @param clientsRequestDTO the clients request DTO
     */
    void createClient(ClientsRequestDTO clientsRequestDTO);

    /**
     * Gets the all clients.
     *
     * @return the all clients
     */
    List<ClientsResponseDTO> getAllClients();

    /**
     * Gets the client by id.
     *
     * @param idClient the id client
     * @return the client by id
     */
    ClientsResponseDTO getClientById(Long idClient);

    /**
     * Update client.
     *
     * @param ClientsRequestDTO the clients request DTO
     * @param id the id
     */
    void updateClient(ClientsRequestDTO ClientsRequestDTO, Long id);

    /**
     * Delete client.
     *
     * @param idClient the id client
     */
    void deleteClient(Long idClient);

    /**
     * Gets the all roles.
     *
     * @return the all roles
     */
    List<RolesResponseDTO> getAllRoles();
}
