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
 * The Class ClientRoles.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Constants.CLIENT_ROLES)
public class ClientRoles implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id client rol. */
    @Id
    @Column(name = "id")
    private Long idClientRol;

    /** The id client. */
    @Column(name = "id_clientrol")
    private Long idClient;

    /** The id rol. */
    @Column(name = "id_rol")
    private Long idRol;
}
