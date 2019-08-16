package com.everis.gameStore.domain.DTO;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsModifyDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsModifyRequestDTO {

    /** The id. */
    private BigInteger id;

    /** The nick name. */
    private String nickName;

    /** The email. */
    private String email;

    /** The password. */
    private String password;
}
