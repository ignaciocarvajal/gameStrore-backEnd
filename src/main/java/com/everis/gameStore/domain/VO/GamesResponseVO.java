package com.everis.gameStore.domain.VO;

import java.util.List;

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

    /** The image. */
    private List<ImageResponseVO> image;

    /** The activation code. */
    private String activationCode;

    /** The value. */
    private Integer value;

    /** The stock. */
    private Integer stock;
}
