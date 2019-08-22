/*
 * 
 */
package com.everis.gameStore.service;

import java.util.List;

import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.VO.RolesResponseVO;

/**
 * The Interface ClientService.
 */
public interface ClientService {

    /**
     * Creates the client.
     *
     * @param clientsRequestVO the clients request VO
     */
    void createClient(ClientsRequestVO clientsRequestVO);

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
     */
    ClientsResponseVO getClientById(Long idClient);

    /**
     * Update client.
     *
     * @param ClientsRequestVO the clients request VO
     */
    void updateClient(ClientsRequestVO ClientsRequestVO, Long id);

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
