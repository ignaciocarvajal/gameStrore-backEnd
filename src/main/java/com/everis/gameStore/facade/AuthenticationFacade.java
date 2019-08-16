package com.everis.gameStore.facade;

import com.everis.gameStore.domain.DTO.AuthenticationRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;

/**
 * The Interface AuthenticationFacade.
 */
public interface AuthenticationFacade {

    /**
     * Login.
     *
     * @param authenticationRequestDTO the authentication request DTO
     * @return the clients response DTO
     */
    ClientsResponseDTO login(AuthenticationRequestDTO authenticationRequestDTO);
}
