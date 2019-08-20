package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GamesRepository.
 */
@Repository
public interface GamesRepository extends PagingAndSortingRepository<Games, Long> {
    
}
