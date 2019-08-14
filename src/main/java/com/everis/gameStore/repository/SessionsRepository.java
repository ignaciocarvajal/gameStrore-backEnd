package com.everis.gameStore.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Sessions;

/**
 * The Interface SessionsRepository.
 */
@Repository
public interface SessionsRepository extends JpaRepository<Sessions, BigInteger> {

}
