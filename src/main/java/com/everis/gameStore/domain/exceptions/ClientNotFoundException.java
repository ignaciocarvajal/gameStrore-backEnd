package com.everis.gameStore.domain.exceptions;

/**
 * The Class ClientNotFoundException.
 */
public class ClientNotFoundException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5115846525434022746L;

    /** The cliente id. */
    private Long cliente_id;

    /**
     * Instantiates a new client not found exception.
     *
     * @param cliente_id the cliente id
     */
    public ClientNotFoundException(Long cliente_id) {
        super(String.format("Cliente no encontrado por el id : '%s'", cliente_id));
    }
}