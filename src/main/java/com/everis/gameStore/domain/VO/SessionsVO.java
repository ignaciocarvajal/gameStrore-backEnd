package com.everis.gameStore.domain.VO;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class SessionsVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SessionsVO {

	/** The id sessions. */
	private BigInteger idSessions;

	/** The id clients. */
	private BigInteger idClients;

	/** The id tokens. */
	private BigInteger idTokens;
}
