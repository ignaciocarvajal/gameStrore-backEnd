package com.everis.gameStore.domain.VO;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsModifyRequestVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsModifyRequestVO {

    /** The id. */
    private BigInteger id;

    /** The nick name. */
    private String nickName;

    /** The email. */
    private String email;

    /** The password. */
    private String password;
}
