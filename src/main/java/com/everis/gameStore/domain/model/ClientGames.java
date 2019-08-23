package com.everis.gameStore.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everis.gameStore.domain.util.Constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class ClientGames.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Constants.CLIENT_GAMES)
public class ClientGames implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id client games. */
    @Id
    @Column(name = "id")
    private Long idClientGames;

    /** The id client. */
    @Column(name = "id_client")
    private Long idClient;

    /** The id game. */
    @Column(name = "id_game")
    private Long idGame;
}
