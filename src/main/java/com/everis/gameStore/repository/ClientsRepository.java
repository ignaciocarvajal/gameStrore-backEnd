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
     * Gets the all clients.
     *
     * @return the all clients
     */
    // @Query("SELECT new com.everis.gameStore.domain.VO.ClientsResponseVO(cl.id, cl.nickname, cl.email, cl.pwd,
    // cl.token, cl.listAcqGame, cl.dateAcqGame, cl.roles) FROM Clients cl")
    // List<ClientsResponseVO> getAllClients();

    /**
     * Gets the client by id.
     * 
     * @param idClient
     *
     * @return the client by id
     */
    // @Query("SELECT new com.everis.gameStore.domain.VO.ClientsResponseVO(cl.id, cl.nickname, cl.email, cl.pwd,
    // cl.token, cl.listAcqGame, cl.dateAcqGame, cl.roles) FROM Clients cl WHERE cl.id= :id ")
    // List<ClientsResponseVO> getClientById(@Param("id") Long idClient);

    /**
     * Login.
     */
    // @Query("SELECT cl.nickname, cl.pwd, cl.token from Clients cl")
    // void login();
}
