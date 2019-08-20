package com.everis.gameStore.domain.VO;

import java.sql.Timestamp;

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

    /** The id client. */
    private Long idClient;

    /** The nick name. */
    private String nickname;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The token. */
    private String token;

    /** The list acquired game. */
    private String listAcquiredGame;

    /** The date acquired game. */
    private Timestamp dateAcquiredGame;

    /** The roles. */
    private String clientRoles;
}
