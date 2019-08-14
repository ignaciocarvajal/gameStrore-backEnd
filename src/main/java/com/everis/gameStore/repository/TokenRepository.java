package com.everis.gameStore.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Token;

/**
 * The Interface TokenRepository.
 */
@Repository
public interface TokenRepository extends JpaRepository<Token, BigInteger> {

}
