package com.everis.gameStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Sessions;

/**
 * The Interface SessionsRepository.
 */
@Repository
public interface SessionsRepository extends JpaRepository<Sessions, Long> {

}
