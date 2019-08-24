package com.everis.gameStore.domain.exceptions;

public class GameNotFoundException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5040179914984900363L;

    /** The id. */
    private Long id_game;

    /**
     * Instantiates a new game not found exception.
     *
     * @param id the id
     */
    public GameNotFoundException(Long id_game) {
        super(String.format("Juego no encontrado por el id : '%s'", id_game));
    }
}
