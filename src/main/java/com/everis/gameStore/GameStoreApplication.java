package com.everis.gameStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.everis.gameStore.config.FileStorageProperties;

/**
 * The Class GameStoreApplication.
 */
@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class GameStoreApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(GameStoreApplication.class, args);
    }
}
