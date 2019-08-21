/*
 * 
 */
package com.everis.gameStore.service;

import java.util.List;

import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;

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
    List<ClientsResponseVO> getClientById(Long idClient);

    /**
     * Update client.
     *
     * @param ClientsRequestVO the clients request VO
     */
    void updateClient(ClientsRequestVO ClientsRequestVO);

    /**
     * Delete client.
     *
     * @param idClient the id client
     */
    void deleteClient(Long idClient);
}
