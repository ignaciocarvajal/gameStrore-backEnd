package com.everis.gameStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ClientsRepository.
 */
@Repository
public interface ClientsRepository extends CrudRepository<Clients, Long> {

    /**
     * Find by email.
     *
     * @param email the email
     * @return the clients
     */
    Clients findByEmail(String email);
}
