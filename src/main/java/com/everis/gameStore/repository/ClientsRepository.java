package com.everis.gameStore.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.model.Clients;

/**
 * The Interface ExampleRepository1.
 */
@Repository
public interface ClientsRepository extends JpaRepository<Clients, BigInteger> {

    /**
     * Creates the client.
     */
    @Query("INSERT INTO Clients cl (cl.nickname, cl.email, cl.password, cl.token, cl.listAcqGame, cl.dateAcqGame, cl.roles) VALUES (:nickname, :email, :password, :token, :roles)")
    void createClient(@Param("nickname") String nickname, @Param("email") String email,
            @Param("password") String password, @Param("token") String token, @Param("roles") String roles);

    /**
     * Gets the all clients.
     *
     * @return the all clients
     */
    @Query("SELECT new com.everis.gameStore.domain.VO.ClientsResponseVO(cl.id, cl.nickname, cl.email, cl.pwd, cl.token, cl.listAcqGame, cl.dateAcqGame, cl.roles) FROM Clients cl")
    List<ClientsResponseVO> getAllClients();

    /**
     * Gets the client by id.
     * 
     * @param idClient
     *
     * @return the client by id
     */
    @Query("SELECT new com.everis.gameStore.domain.VO.ClientsResponseVO(cl.id, cl.nickname, cl.email, cl.pwd, cl.token, cl.listAcqGame, cl.dateAcqGame, cl.roles) FROM Clients cl WHERE cl.id= :id ")
    List<ClientsResponseVO> getClientById(@Param("id") BigInteger idClient);

    /**
     * Update client.
     * 
     * @param clientsRequestVO
     */
    @Query("UPDATE Clients cl SET cl.nickname= :nickname, cl.pwd= :password, cl.email= :email where cl.id = :id")
    void updateClient(@Param("nickname") String nickname, @Param("password") String password,
            @Param("email") String email, @Param("id") BigInteger id);

    /**
     * Delete client.
     * 
     * @param idClient
     */
    @Query("DELETE FROM Clients cl where cl.id= :id ")
    void deleteClient(@Param("id") BigInteger idClient);

    /**
     * Login.
     */
    @Query("SELECT cl.nickname, cl.pwd, cl.token from Clients cl")
    void login();
}
