package com.everis.gameStore.domain.DTO;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientListResponseDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientListResponseDTO {

    /** The list clients response DTO. */
    private List<ClientsResponseDTO> listClientsResponseDTO;
}
