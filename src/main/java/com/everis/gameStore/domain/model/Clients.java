package com.everis.gameStore.domain.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.everis.gameStore.domain.util.Constants;

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
@Table(name = Constants.CLIENTS)
public class Clients implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @JoinTable(name = "client_rol",
            joinColumns = @JoinColumn(
                    name = "id_clientrol",
                    referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(
                    name = "Id_rol",
                    referencedColumnName = "Id"))
    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Roles> roles = new HashSet<>();
}
