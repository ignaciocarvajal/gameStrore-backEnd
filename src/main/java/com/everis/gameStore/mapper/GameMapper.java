package com.everis.gameStore.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.everis.gameStore.domain.DTO.GamesRequestDTO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GameMapper.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
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
}
