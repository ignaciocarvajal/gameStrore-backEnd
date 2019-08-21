package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ClientsRepository.
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

    /**
     * Find by id client.
     *
     * @param idClient the id client
     * @return the clients
     */
    Clients findByIdClient(Long idClient);

    /**
     * Find by password.
     *
     * @param password the password
     * @return the clients
     */
    Clients findByPassword(String password);
}
