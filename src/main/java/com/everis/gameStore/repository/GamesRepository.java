package com.everis.gameStore.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GamesRepository.
 */
@Repository
public interface GamesRepository extends JpaRepository<Games, BigInteger> {

}
