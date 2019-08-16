package com.everis.gameStore.service;

import com.everis.gameStore.domain.VO.AuthenticationRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;

/**
 * The Interface AuthenticationService.
 */
public interface AuthenticationService {

    /**
     * Login.
     *
     * @param authenticationRequestVO the authentication request VO
     * @return the clients response VO
     */
    ClientsResponseVO login(AuthenticationRequestVO authenticationRequestVO);
}
