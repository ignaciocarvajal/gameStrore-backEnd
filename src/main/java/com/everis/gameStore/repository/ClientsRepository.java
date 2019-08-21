package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ExampleRepository1.
 */
@Repository
public interface ClientsRepository extends PagingAndSortingRepository<Clients, Long> {

    /**
     * Find by email.
     *
     * @param email the email
     * @return the clients
     */
    Clients findByEmail(String email);
}
