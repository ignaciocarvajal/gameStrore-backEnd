package com.everis.gameStore.mapper;

import org.mapstruct.Mapper;

import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GameMapper.
 */
@Mapper(componentModel = "spring")
public interface GameMapper {

    /**
     * Games request dto to games request VO.
     *
     * @param gamesRequestDTO the games request DTO
     * @return the games request VO
     */
    GamesRequestVO GamesRequestDtoToGamesRequestVO(GamesRequestDTO gamesRequestDTO);

    /**
     * Games request vo to games.
     *
     * @param gamesRequestVO the games request VO
     * @return the games
     */
    Games GamesRequestVoToGames(GamesRequestVO gamesRequestVO);

    /**
     * Games to list games response VO.
     *
     * @param games the games
     * @return the games response VO
     */
    GamesResponseVO GamesToListGamesResponseVO(Games games);

    /**
     * Games to games response VO.
     *
     * @param game the game
     * @return the games response VO
     */
    GamesResponseVO GamesToGamesResponseVO(Games game);

    /**
     * Games response vo to games response DTO.
     *
     * @param games the games
     * @return the games response DTO
     */
    GamesResponseDTO GamesResponseVoToGamesResponseDTO(GamesResponseVO games);
}
