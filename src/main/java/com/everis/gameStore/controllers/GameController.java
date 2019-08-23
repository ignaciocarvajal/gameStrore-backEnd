package com.everis.gameStore.controllers;

import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.facade.GameFacade;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * The Class GameController.
 */
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RestController
@RequestMapping("/games")
public class GameController {

    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(GameController.class);

    /** The game facade. */
    @Autowired
    private GameFacade gameFacade;

    /**
     * Creates the game.
     *
     * @param gamesRequestDTO the games request DTO
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Create game")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @PostMapping(value = "/create")
    public void createGame(@RequestBody(required = true) GamesRequestDTO gamesRequestDTO) throws ServiceException {
        try {
            gameFacade.createGame(gamesRequestDTO);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

    /**
     * Gets the all games.
     *
     * @return the all games
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Get all games")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @GetMapping(value = "/")
    public ResponseEntity<List<GamesResponseDTO>> getAllGames() throws ServiceException {
        try {
            return new ResponseEntity<List<GamesResponseDTO>>(gameFacade.getAllGames(), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Gets the game by id.
     *
     * @param idGames the id games
     * @return the game by id
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Get game by id")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @GetMapping(value = "/{id}")
    public ResponseEntity<GamesResponseDTO> getGameById(@PathVariable(value = "id") Long id)
            throws ServiceException {
        try {
            return new ResponseEntity<GamesResponseDTO>(gameFacade.getGameById(id), HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Update game.
     *
     * @param gamesModifyRequestDTO the games modify request DTO
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Update game")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @PutMapping(value = "/update/{id}")
    public ResponseEntity<Void> updateGame(@RequestBody GamesRequestDTO gamesRequestDTO,
            @PathVariable(value = "id") Long id)
            throws ServiceException {
        try {
            gameFacade.updateGame(gamesRequestDTO, id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * Delete game.
     *
     * @param gamesModifyRequestDTO the games modify request DTO
     * @return the response entity
     * @throws ServiceException the service exception
     */
    @ApiOperation(value = "Delete game")
    @ApiResponses({ @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 400, message = "Bad Request", response = String.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Throwable.class),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Internal Server Error", response = ServiceException.class) })
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable(value = "id") Long id)
            throws ServiceException {
        try {
            gameFacade.deleteGame(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
