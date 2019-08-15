package com.everis.gameStore.domain.DTO;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class TokenDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenDTO {

	/** The id token. */
	private BigInteger idToken;

	/** The id client. */
	private BigInteger idClient;

	/** The token. */
	private String token;

	/** The expiration date. */
	private Timestamp expirationDate;
}
