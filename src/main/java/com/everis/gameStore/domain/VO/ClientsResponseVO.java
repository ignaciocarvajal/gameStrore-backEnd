package com.everis.gameStore.domain.VO;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsVO.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClientsResponseVO {

    /** The id client. */
    private Long idClient;

    /** The nick name. */
    private String nickname;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The list acquired game. */
    private String listAcquiredGame;

    /** The date acquired game. */
    private Timestamp dateAcquiredGame;

    /** The client roles. */
    private String clientRoles;
}
