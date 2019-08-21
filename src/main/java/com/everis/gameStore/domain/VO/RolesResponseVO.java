package com.everis.gameStore.domain.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class RolesResponseVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RolesResponseVO {

    /** The id roles. */
    private Long idRoles;

    /** The description. */
    private String description;
}
