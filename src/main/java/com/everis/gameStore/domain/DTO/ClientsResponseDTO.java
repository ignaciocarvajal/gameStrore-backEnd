package com.everis.gameStore.domain.DTO;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsResponseDTO {

	/** The id client. */
	private BigInteger idClient;

	/** The authentication request DTO. */
	private AuthenticationRequestDTO authenticationRequestDTO;

	/** The list acq game. */
	private String listAcquiredGame;

	/** The date acq game. */
	private Timestamp dateAcquiredGame;
}
