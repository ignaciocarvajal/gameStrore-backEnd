package com.everis.gameStore.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class SessionsDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SessionsDTO {

    /** The id sessions. */
    private Long idSessions;

    /** The id clients. */
    private Long idClients;

    /** The id tokens. */
    private Long idTokens;
}
