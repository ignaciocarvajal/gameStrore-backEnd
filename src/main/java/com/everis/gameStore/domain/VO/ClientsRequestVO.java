package com.everis.gameStore.domain.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsRequestVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsRequestVO {

    /** The nick name. */
    private String nickName;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The token. */
    private String token;
}
