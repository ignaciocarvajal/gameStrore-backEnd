package com.everis.gameStore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.gameStore.domain.VO.AuthenticationRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.repository.ClientsRepository;
import com.everis.gameStore.service.AuthenticationService;

/**
 * The Class AuthenticationServiceImpl.
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    /** The clients repository. */
    @Autowired
    ClientsRepository clientsRepository;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.everis.gameStore.service.AuthenticationService#login(com.everis.gameStore.domain.VO.AuthenticationRequestVO)
     */
    @Override
    public ClientsResponseVO login(AuthenticationRequestVO authenticationRequestVO) {
//        clientsRepository.login();
        return null;
    }
}
