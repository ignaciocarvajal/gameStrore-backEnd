package com.everis.gameStore.service;

import java.math.BigInteger;
import java.util.List;

import com.everis.gameStore.domain.VO.ClientsModifyRequestVO;
import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;

/**
 * The Interface ClientService.
 */
public interface ClientService {

    /**
     * Creates the client.
     *
     * @param ClientsRequestVO the clients request VO
     */
    void createClient(ClientsRequestVO ClientsRequestVO);

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
    List<ClientsResponseVO> getClientById(BigInteger idClient);

    /**
     * Update client.
     *
     * @param clientsModifyRequestVO the clients modify request VO
     */
    void updateClient(ClientsModifyRequestVO clientsModifyRequestVO);

    /**
     * Delete client.
     *
     * @param idClient the id client
     */
    void deleteClient(BigInteger idClient);
}
