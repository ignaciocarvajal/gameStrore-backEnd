package com.everis.gameStore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.VO.RolesResponseVO;
import com.everis.gameStore.domain.exceptions.ClientNotFoundException;
import com.everis.gameStore.domain.model.Clients;
import com.everis.gameStore.domain.model.Roles;
import com.everis.gameStore.mapper.ClientMapper;
import com.everis.gameStore.mapper.UpdateMapper;
import com.everis.gameStore.repository.ClientsRepository;
import com.everis.gameStore.repository.RolesRespository;
import com.everis.gameStore.service.ClientService;

/**
 * The Class ClientServiceImpl.
 */
@Service
public class ClientServiceImpl implements ClientService {

    /** The clients repository. */
    @Autowired
    private ClientsRepository clientsRepository;

    /** The roles respository. */
    @Autowired
    private RolesRespository rolesRespository;

    /** The client mapper. */
    @Autowired
    private ClientMapper clientMapper;

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#createClient(com.everis.gameStore. domain.DTO.ClientsRequestDTO)
     */
    @Override
    public ClientsResponseVO createClient(ClientsRequestVO clientsRequestVO) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
        clientsRequestVO.setPassword(bCryptPasswordEncoder.encode(clientsRequestVO.getPassword()));
        Clients clients = clientMapper.mapperClientsToClientsRequestVO(clientsRequestVO);
        clients = clientsRepository.save(clients);
        return clientMapper.ClientsToClientsResponseVO(clients);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#getAllClients()
     */
    @Override
    public List<ClientsResponseVO> getAllClients() {
        List<ClientsResponseVO> listClientsResponseVO = new ArrayList<>();
        ClientsResponseVO clientsResponseVO = new ClientsResponseVO();
        List<Clients> clients = (List<Clients>) clientsRepository.findAll();
        for (Clients client : clients) {
            clientsResponseVO = clientMapper.ClientsToListClientsResponseVO(client);
            listClientsResponseVO.add(clientsResponseVO);
        }
        return listClientsResponseVO;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#getClientById(java.lang.Long)
     */
    @Override
    public ClientsResponseVO getClientById(Long idClient) throws ClientNotFoundException {
        Clients clients = clientsRepository.findById(idClient).orElseThrow(() -> new ClientNotFoundException(idClient));
        return clientMapper.ClientsToClientsResponseVO(clients);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#updateClient(com.everis.gameStore.domain.VO.ClientsRequestVO)
     */
    @Override
    public ClientsResponseVO updateClient(ClientsRequestVO clientsRequestVO, Long id) throws ClientNotFoundException {
        Clients clients = clientsRepository.findById(id).orElseThrow(() -> new ClientNotFoundException(id));
        clients = UpdateMapper.mapperClientsToClientsRequestVO(clientsRequestVO, clients);
        if (null != clients) {
            clients = clientsRepository.save(clients);
        }
        return clientMapper.ClientsToClientsResponseVO(clients);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#deleteClient(java.math.BigInteger)
     */
    @Override
    public void deleteClient(Long idClient) {
        clientsRepository.deleteById(idClient);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.everis.gameStore.service.ClientService#getAllRoles()
     */
    @Override
    public List<RolesResponseVO> getAllRoles() {
        List<RolesResponseVO> listRolesResponseVO = new ArrayList<>();
        RolesResponseVO rolesResponseVO = new RolesResponseVO();
        List<Roles> listRoles = (List<Roles>) rolesRespository.findAll();
        for (Roles roles : listRoles) {
            rolesResponseVO = clientMapper.RolesResponseVoToRoles(roles);
            listRolesResponseVO.add(rolesResponseVO);
        }
        return listRolesResponseVO;
    }
}
