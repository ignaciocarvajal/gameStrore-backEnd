package com.everis.gameStore.facade.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.ClientListResponseDTO;
import com.everis.gameStore.domain.DTO.ClientsModifyRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.facade.ClientFacade;
import com.everis.gameStore.mapper.ClientMapper;
import com.everis.gameStore.service.ClientService;

/**
 * The Class ClientFacadeImpl.
 */
@Component
public class ClientFacadeImpl implements ClientFacade {

    /** The client service. */
    @Autowired
    ClientService clientService;

    /** The client mapper. */
    @Autowired
    ClientMapper clientMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#createClient(com.everis.gameStore. domain.DTO.ClientsRequestDTO)
     */
    @Override
    public void createClient(ClientsRequestDTO clientsRequestDTO) {
        clientService.createClient(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#getAllClients()
     */
    @Override
    public ClientListResponseDTO getAllClients() {
        clientService.getAllClients();
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#getClientById(java.math.BigInteger)
     */
    @Override
    public List<ClientsResponseDTO> getClientById(BigInteger idClient) {
        clientService.getClientById(idClient);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#updateClient(java.math.BigInteger)
     */
    @Override
    public void updateClient(ClientsModifyRequestDTO clientsModifyRequestDTO) {
        clientService.updateClient(null);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#deleteClient(java.math.BigInteger)
     */
    @Override
    public void deleteClient(BigInteger idClient) {
        clientService.deleteClient(idClient);
    }
}
