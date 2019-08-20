package com.everis.gameStore.domain.VO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientListResponseVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientListResponseVO {

    /** The list clients response VO. */
    private List<ClientsResponseVO> listClientsResponseVO;
}
