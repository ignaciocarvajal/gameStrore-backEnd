package com.everis.gameStore.controllers;

import org.hibernate.service.spi.ServiceException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.gameStore.domain.DTO.AuthenticationRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class AuthenticationController.
 */
@RestController
public class AuthenticationController {

    /**
     * Login user.
     *
     * @param authenticationRequestDTO the authentication request DTO
     * @return the clients response DTO
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Login users")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/lol", method = RequestMethod.POST, produces = "application/json")
    public ClientsResponseDTO loginUser(@RequestBody AuthenticationRequestDTO authenticationRequestDTO)
            throws ServiceException {
        return null;
    }
}
