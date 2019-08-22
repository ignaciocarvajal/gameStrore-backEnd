package com.everis.gameStore.domain.DTO;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

import com.everis.gameStore.domain.model.Games;
import com.everis.gameStore.domain.model.Roles;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientsRequestDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientsRequestDTO {

    /** The nick name. */
    private String nickname;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The roles. */
    private Set<Roles> roles;
    
    /** The list acquired game. */
    private List<Games> listAcquiredGames;

    /** The date acquired game. */
    private Timestamp dateAcquiredGame;
}
