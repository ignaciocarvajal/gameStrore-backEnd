package com.everis.gameStore.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ExampleRepository1.
 */
@Repository
public interface ClientsRepository extends JpaRepository<Clients, BigInteger> {

}
