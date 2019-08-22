package com.everis.gameStore.domain.model;

import java.io.Serializable;
import java.util.List;

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
 * The Class Games.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = Constants.GAMES)
public class Games implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id. */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGames;

    /** The game name. */
    @Column(name = "game_name")
    private String gameName;

    /** The image. */
    @JoinTable(name = "games_images",
            joinColumns = @JoinColumn(
                    name = "id_game",
                    referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_images",
                    referencedColumnName = "Id"))
    @ManyToMany(fetch = FetchType.LAZY)
    private List<Images> image;

    /** The activation code. */
    @Column(name = "activation_code")
    private String activationCode;

    /** The value. */
    @Column(name = "value")
    private Integer value;

    /** The stock. */
    @Column(name = "stock")
    private Integer stock;
}
