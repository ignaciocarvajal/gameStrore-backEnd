package com.everis.gameStore.domain.VO;

import java.math.BigInteger;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsResponseVO {

    /** The id client. */
    private BigInteger id;

    /** The nick name. */
    private String nickname;

    /** The email. */
    private String email;

    /** The password. */
    private String pwd;

    /** The token. */
    private String token;

    /** The list acq game. */
    private String listAcqGame;

    /** The date acq game. */
    private Timestamp dateAcqGame;

    /** The roles. */
    private String roles;
}
