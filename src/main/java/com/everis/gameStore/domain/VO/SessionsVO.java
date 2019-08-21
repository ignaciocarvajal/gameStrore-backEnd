package com.everis.gameStore.domain.VO;

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
    private Long idSessions;

    /** The id clients. */
    private Long idClients;

    /** The id tokens. */
    private Long idTokens;
}
