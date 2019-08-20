package com.everis.gameStore.domain.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Client.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clients")
public class Clients implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @Column(name = "id")
    private Long idClient;

    /** The nickname. */
    @Column(name = "nickname")
    private String nickname;

    /** The email. */
    @Column(name = "email")
    private String email;

    /** The password. */
    @Column(name = "password")
    private String password;

    /** The list acquired game. */
    @Column(name = "list_acq_games")
    private String listAcquiredGame;

    /** The date acquired game. */
    @Column(name = "date_acq_games")
    private Timestamp dateAcquiredGame;
    
    @Column(name="client_roles")
    private String clientRoles;
}
