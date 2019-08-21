package com.everis.gameStore.domain.VO;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class TokenVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TokenVO {

    /** The id token. */
    private Long idToken;

    /** The token. */
    private String token;

    /** The exp date. */
    private Timestamp expDate;
}
