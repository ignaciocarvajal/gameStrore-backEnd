package com.everis.gameStore.domain.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class AuthenticationRequestVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthenticationRequestVO {

    /** The nick name. */
    private String nickName;

    /** The password. */
    private String password;

    /** The token. */
    private String token;
}