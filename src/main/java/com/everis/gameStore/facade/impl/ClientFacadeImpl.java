package com.everis.gameStore.facade.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
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
    private ClientService clientService;

    /** The client mapper. */
    @Autowired
    private ClientMapper clientMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#createClient(com.everis.gameStore. domain.DTO.ClientsRequestDTO)
     */
    @Override
    public void createClient(ClientsRequestDTO clientsRequestDTO) {
        ClientsRequestVO clientsRequestVO = clientMapper.mapperClientsRequestDtoToGamesRequestVO(clientsRequestDTO);
        clientService.createClient(clientsRequestVO);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#getAllClients()
     */
    @Override
    public List<ClientsResponseDTO> getAllClients() {
        List<ClientsResponseDTO> listClientsResponseDTO = new ArrayList<>();
        ClientsResponseDTO clientsResponseDTO = new ClientsResponseDTO();
        List<ClientsResponseVO> clientsResponseVO = clientService.getAllClients();
        for (ClientsResponseVO clients : clientsResponseVO) {
            clientsResponseDTO = clientMapper.ClientsResponseVoToListClientsResponseDTO(clients);
            listClientsResponseDTO.add(clientsResponseDTO);
        }
        return listClientsResponseDTO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#getClientById(java.math.BigInteger)
     */
    @Override
    public List<ClientsResponseDTO> getClientById(Long idClient) {
        clientService.getClientById(idClient);
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#updateClient(java.math.BigInteger)
     */
    @Override
    public void updateClient(ClientsRequestDTO clientsRequestDTO) {
        ClientsRequestVO clientsRequestVO = clientMapper.mapperClientsRequestDtoToGamesRequestVO(clientsRequestDTO);
        clientService.updateClient(clientsRequestVO);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.facade.ClientFacade#deleteClient(java.math.BigInteger)
     */
    @Override
    public void deleteClient(Long idClient) {
        clientService.deleteClient(idClient);
    }
}
