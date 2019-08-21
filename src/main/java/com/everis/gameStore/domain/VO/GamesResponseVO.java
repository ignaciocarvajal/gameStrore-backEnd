package com.everis.gameStore.domain.VO;

import java.sql.Blob;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class GamesResponseVO.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesResponseVO {

    /** The id games. */
    private Long idGames;

    /** The game name. */
    private String gameName;

    /** The img. */
    private Blob img;

    /** The act code. */
    private String actCode;

    /** The value. */
    private Integer value;

    /** The stock. */
    private Integer stock;

    /** The id clients. */
    private Long idClients;
}
