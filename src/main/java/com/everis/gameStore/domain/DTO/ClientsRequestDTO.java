package com.everis.gameStore.domain.DTO;

import java.util.Set;

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
    private String nickName;

    /** The email. */
    private String email;

    /** The password. */
    private String password;

    /** The roles. */
    private Set<Roles> roles;
}
