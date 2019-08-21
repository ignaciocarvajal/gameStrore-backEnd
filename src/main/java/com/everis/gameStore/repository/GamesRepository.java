package com.everis.gameStore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GamesRepository.
 */
@Repository
public interface GamesRepository extends PagingAndSortingRepository<Games, Long> {

    /**
     * Find by id games.
     *
     * @param idGames the id games
     * @return the games
     */
    @Query("SELECT ga FROM com.everis.gameStore.domain.model.Games ga WHERE ga.id = :id")
    Games findByIdGames(@Param("id") Long idGames);
}
