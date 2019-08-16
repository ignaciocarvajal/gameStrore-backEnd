package com.everis.gameStore.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.VO.ClientsModifyRequestVO;
import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.repository.ClientsRepository;
import com.everis.gameStore.service.ClientService;

/**
 * The Class ClientServiceImpl.
 */
@Service
public class ClientServiceImpl implements ClientService {

    /** The clients repository. */
    @Autowired
    ClientsRepository clientsRepository;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#createClient(com.everis.gameStore. domain.DTO.ClientsRequestDTO)
     */
    @Override
    public void createClient(ClientsRequestVO clientsRequestVO) {
        String roles = "";
        clientsRepository.createClient(clientsRequestVO.getNickName(), clientsRequestVO.getEmail(),
                clientsRequestVO.getPassword(), clientsRequestVO.getToken(), roles);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#getAllClients()
     */
    @Override
    public List<ClientsResponseVO> getAllClients() {
        return clientsRepository.getAllClients();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#getClientById(java.math. BigInteger)
     */
    @Override
    public List<ClientsResponseVO> getClientById(BigInteger idClient) {
        List<ClientsResponseVO> listClientsResponseVO = clientsRepository.getClientById(idClient);
        return listClientsResponseVO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#updateClient(java.math.BigInteger)
     */
    @Override
    public void updateClient(ClientsModifyRequestVO clientsModifyRequestVO) {
        clientsRepository.updateClient(clientsModifyRequestVO.getNickName(), clientsModifyRequestVO.getPassword(),
                clientsModifyRequestVO.getEmail(), clientsModifyRequestVO.getId());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#deleteClient(java.math.BigInteger)
     */
    @Override
    public void deleteClient(BigInteger idClient) {
        clientsRepository.deleteClient(idClient);
    }
}
