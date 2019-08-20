package com.everis.gameStore.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.everis.gameStore.domain.DTO.AuthenticationRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.facade.AuthenticationFacade;
import com.everis.gameStore.service.AuthenticationService;

/**
 * The Class AuthenticationFacadeImpl.
 */
@Component
public class AuthenticationFacadeImpl implements AuthenticationFacade {

    /** The authentication service. */
    @Autowired
    AuthenticationService authenticationServiceImpl;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.everis.gameStore.facade.AuthenticationFacade#login(com.everis.gameStore.domain.DTO.AuthenticationRequestDTO)
     */
    @Override
    public ClientsResponseDTO login(AuthenticationRequestDTO authenticationRequestDTO) {
        authenticationServiceImpl.login(null);
        return null;
    }
}
