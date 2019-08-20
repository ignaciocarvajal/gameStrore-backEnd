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
 * The Class Token.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "token")
public class Token implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @Column(name = "id")
    private Long id;

    /** The id client. */
    @Column(name = "idclient")
    private Long idClient;

    /** The token. */
    @Column(name = "token")
    private String token;

    /** The expiration date. */
    @Column(name = "expiration_date")
    private Timestamp expirationDate;
}
