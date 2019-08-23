/*
 * 
 */
package com.everis.gameStore.service;

import java.util.List;

import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.VO.RolesResponseVO;
import com.everis.gameStore.domain.exceptions.ClientNotFoundException;

/**
 * The Interface ClientService.
 */
public interface ClientService {

    /**
     * Creates the client.
     *
     * @param clientsRequestVO the clients request VO
     */
    ClientsResponseVO createClient(ClientsRequestVO clientsRequestVO);

    /**
     * Gets the all clients.
     *
     * @return the all clients
     */
    List<ClientsResponseVO> getAllClients();

    /**
     * Gets the client by id.
     *
     * @param idClient the id client
     * @return the client by id
     * @throws ClientNotFoundException 
     */
    ClientsResponseVO getClientById(Long idClient) throws ClientNotFoundException;

    /**
     * Update client.
     *
     * @param ClientsRequestVO the clients request VO
     * @throws ClientNotFoundException 
     */
    ClientsResponseVO updateClient(ClientsRequestVO ClientsRequestVO, Long id) throws ClientNotFoundException;

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
    List<RolesResponseVO> getAllRoles();
}
