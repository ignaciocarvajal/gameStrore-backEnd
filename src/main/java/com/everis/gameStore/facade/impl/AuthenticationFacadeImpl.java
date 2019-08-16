package com.everis.gameStore.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.everis.gameStore.domain.DTO.AuthenticationRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.facade.AuthenticationFacade;
import com.everis.gameStore.service.AuthenticationService;

/**
 * The Class AuthenticationFacadeImpl.
 */
public class AuthenticationFacadeImpl implements AuthenticationFacade {

    /** The authentication service. */
    @Autowired
    AuthenticationService authenticationService;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.everis.gameStore.facade.AuthenticationFacade#login(com.everis.gameStore.domain.DTO.AuthenticationRequestDTO)
     */
    @Override
    public ClientsResponseDTO login(AuthenticationRequestDTO authenticationRequestDTO) {
        authenticationService.login(null);
        return null;
    }
}
