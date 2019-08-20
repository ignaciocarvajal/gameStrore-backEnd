package com.everis.gameStore.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.everis.gameStore.facade.AuthenticationFacade;

/**
 * The Class AuthenticationController.
 */
@RestController
public class AuthenticationController {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    /** The authentication facade. */
    @Autowired
    AuthenticationFacade authenticationFacadeImpl;

    /**
     * Login user.
     *
     * @param authenticationRequestDTO the authentication request DTO
     * @return the clients response DTO
     * @throws ServiceException the service exception
     */
//    @ApiOperation(value = "Login users")
//    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
//            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
//            @ApiResponse(code = 404, message = "Not Found"),
//            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
//    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
//    public ResponseEntity<ClientsResponseDTO> loginUser(@RequestBody AuthenticationRequestDTO authenticationRequestDTO)
//            throws ServiceException {
//        try {
//            return new ResponseEntity<ClientsResponseDTO>(authenticationFacadeImpl.login(authenticationRequestDTO),
//                    HttpStatus.OK);
//        } catch (Exception ex) {
//            LOGGER.error(ex.getMessage(), ex);
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
