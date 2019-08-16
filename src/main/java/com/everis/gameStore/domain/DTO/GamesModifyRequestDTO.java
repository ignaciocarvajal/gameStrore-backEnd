package com.everis.gameStore.domain.DTO;

import java.math.BigInteger;
import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesModifyRequestDTO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesModifyRequestDTO {

    /** The id games. */
    private BigInteger idGames;

    /** The game name. */
    private String gameName;

    /** The img. */
    private Blob img;

    /** The value. */
    private Integer value;

    /** The stock. */
    private Integer stock;
}
