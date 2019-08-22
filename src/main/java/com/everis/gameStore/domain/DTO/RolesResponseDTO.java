package com.everis.gameStore.domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class RolesResponseDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesResponseDTO {

    /** The id roles. */
    private Long idRoles;

    /** The description. */
    private String description;
}
