package com.everis.gameStore.controllers;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.facade.ClientFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class ClientController.
 */
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RestController
@RequestMapping("/clients")
public class ClientController {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    /** The client facade. */
    @Autowired
    ClientFacade clientFacade;

    /**
     * Creates the client.
     *
     * @param clientsRequestDTO the clients request DTO
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Create client")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/createClient", method = RequestMethod.POST, produces = "application/json")
    public void createClient(@RequestBody(required = true) ClientsRequestDTO clientsRequestDTO)
            throws ServiceException {
        try {
            clientFacade.createClient(clientsRequestDTO);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    /**
     * Gets the all clients.
     *
     * @return the all clients
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Get all clients")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/getAllClients", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ClientsResponseDTO>> getAllClients() throws ServiceException {
        try {
            return new ResponseEntity<List<ClientsResponseDTO>>(clientFacade.getAllClients(), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets the client by id.
     *
     * @param idClient the id client
     * @return the client by id
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Get client by id")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/getClientById(idClient)", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<ClientsResponseDTO>> getClientById(@RequestParam Long idClient)
            throws ServiceException {
        try {
            return new ResponseEntity<List<ClientsResponseDTO>>(clientFacade.getClientById(idClient), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Update client.
     *
     * @param clientsModifyRequestDTO the clients modify request DTO
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Update client")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/updateClient", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Void> updateClient(@RequestBody ClientsRequestDTO clientsModifyRequestDTO)
            throws ServiceException {
        try {
            clientFacade.updateClient(clientsModifyRequestDTO);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Delete client.
     *
     * @param idClient the id client
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Delete client")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @RequestMapping(value = "/deleteClient", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Void> deleteClient(@RequestBody Long idClient) throws ServiceException {
        try {
            clientFacade.deleteClient(idClient);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
