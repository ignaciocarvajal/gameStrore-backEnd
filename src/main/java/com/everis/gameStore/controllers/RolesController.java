package com.everis.gameStore.controllers;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.gameStore.domain.DTO.RolesResponseDTO;
import com.everis.gameStore.facade.ClientFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class RolesController.
 */
@CrossOrigin(methods = { RequestMethod.GET })
@RestController
public class RolesController {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    /** The client facade. */
    @Autowired
    private ClientFacade clientFacade;
    
    /**
     * Gets the all roles.
     *
     * @return the all roles
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Get all clients")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/getAllRoles", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<RolesResponseDTO>> getAllRoles() throws ServiceException {
        try {
            return new ResponseEntity<List<RolesResponseDTO>>(clientFacade.getAllRoles(), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
