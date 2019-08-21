package com.everis.gameStore.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ExampleRepository1.
 */
@Repository
public interface ClientsRepository extends PagingAndSortingRepository<Clients, Long> {

    /**
     * Find by nickname.
     *
     * @param username the username
     * @return the clients
     */
    @Query("SELECT cl FROM com.everis.gameStore.domain.model.Clients cl WHERE cl.nickname= :nickname")
    Clients findByNickname(@Param("nickname") String username);
    
    
    Clients findByEmail(String email);
}
