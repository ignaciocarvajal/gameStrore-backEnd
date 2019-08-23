package com.everis.gameStore.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.everis.gameStore.domain.util.Constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class Images.
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = Constants.IMAGES)
public class Images implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id image. */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage;

    /** The file name. */
    @Column(name = "file_name")
    private String fileName;

    /** The file download uri. */
    @Column(name = "download_uri")
    private String fileDownloadUri;

    /** The file delete uri. */
    @Column(name = "delete_uri")
    private String fileDeleteUri;

    /** The file type. */
    @Column(name = "file_type")
    private String fileType;

    /** The size. */
    @Column(name = "size")
    private Long size;
}
