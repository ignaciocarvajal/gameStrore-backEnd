package com.everis.gameStore.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * The Class FileStorageProperties.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    /** The upload dir. */
    private String uploadDir;
}
