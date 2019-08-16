package com.everis.gameStore.repository;

import java.math.BigInteger;
import java.sql.Blob;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.DTO.GamesResponseDTO;
import com.everis.gameStore.domain.VO.GamesResponseVO;
import com.everis.gameStore.domain.model.Games;

/**
 * The Interface GamesRepository.
 */
@Repository
public interface GamesRepository extends JpaRepository<Games, BigInteger> {

    /**
     * Creates the game.
     *
     * @param gameName the game name
     * @param value the value
     * @param stock the stock
     * @param img the img
     */
    @Query("INSERT INTO Games ga (ga.gameName, ga.image, ga.value, ga.stock) VALUES (:gamename, :photo, :value, :stock)")
    void createGame(@Param("gamename") String gameName, @Param("value") Integer value, @Param("stock") Integer stock,
            @Param("photo") Blob img);

    /**
     * Gets the all games.
     *
     * @return the all games
     */
    @Query("SELECT new com.everis.gameStore.domain.DTO.GamesResponseDTO(ga.id, ga.gameName, ga.image, ga.activationCode, ga.value, ga.stock) FROM Games ga")
    List<GamesResponseDTO> getAllGames();

    /**
     * Gets the game by id.
     * 
     * @param idGames
     *
     * @return the game by id
     */
    @Query("SELECT new com.everis.gameStore.domain.DTO.GamesResponseDTO(ga.id, ga.gameName, ga.image, ga.activationCode, ga.value, ga.stock) FROM Games ga WHERE ga.id= :id")
    List<GamesResponseVO> getGameById(@Param("id") BigInteger idGames);

    /**
     * Update game.
     *
     * @param idGames the id games
     * @param gameName the game name
     * @param img the img
     * @param value the value
     * @param stock the stock
     */
    @Query("UPDATE Games ga set ga.gameName= :gamename, ga.image= :image, ga.value= :value, ga.stock= :stock where ga.id= :id")
    void updateGame(@Param("id") BigInteger idGames, @Param("gamename") String gameName, @Param("image") Blob img,
            @Param("value") Integer value, @Param("stock") Integer stock);

    /**
     * Delete game.
     * 
     * @param idGames
     */
    @Query("DELETE FROM Games ga where ga.id= :id")
    void deleteGame(@Param("id") BigInteger idGames);
}
