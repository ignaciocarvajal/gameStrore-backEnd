package com.everis.gameStore.domain.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class ExampleException.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The code. */
	private String code;

	/** The message. */
	private String message;
}
