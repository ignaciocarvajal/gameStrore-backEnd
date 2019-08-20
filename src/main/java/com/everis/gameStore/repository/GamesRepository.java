package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GamesRepository.
 */
@Repository
public interface GamesRepository extends PagingAndSortingRepository<Games, Long> {

    /**
     * Gets the all games.
     *
     * @return the all games
     */
//    @Query("SELECT new com.everis.gameStore.domain.DTO.GamesResponseDTO(ga.id, ga.gameName, ga.image, ga.activationCode, ga.value, ga.stock) FROM Games ga")
//    List<GamesResponseDTO> getAllGames();

    /**
     * Gets the game by id.
     * 
     * @param idGames
     *
     * @return the game by id
     */
//    @Query("SELECT new com.everis.gameStore.domain.DTO.GamesResponseDTO(ga.id, ga.gameName, ga.image, ga.activationCode, ga.value, ga.stock) FROM Games ga WHERE ga.id= :id")
//    List<GamesResponseVO> getGameById(@Param("id") Long idGames);
}
