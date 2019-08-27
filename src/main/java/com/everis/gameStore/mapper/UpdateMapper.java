package com.everis.gameStore.mapper;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.GamesRequestVO;
import com.everis.gameStore.domain.model.Clients;
import com.everis.gameStore.domain.model.Games;
import com.everis.gameStore.domain.model.Images;
import com.everis.gameStore.domain.model.Roles;

/**
 * The Class UpdateMapper.
 */
public class UpdateMapper {

    /**
     * Mapper clients to clients request VO.
     *
     * @param clientsRequestVO the clients request VO
     * @param clients the clients
     * @return the clients
     */
    public static Clients mapperClientsToClientsRequestVO(ClientsRequestVO clientsRequestVO, Clients clients) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);

        if (clientsRequestVO == null) {
            return null;
        }

        if (clients == null) {
            return null;
        }

        clients.setNickname(
                null != clientsRequestVO.getNickname() ? clientsRequestVO.getNickname() : clients.getNickname());
        clients.setEmail(null != clientsRequestVO.getEmail() ? clientsRequestVO.getEmail() : clients.getEmail());
        clients.setPassword(
                null != clientsRequestVO.getPassword() ? bCryptPasswordEncoder.encode(clientsRequestVO.getPassword())
                        : clients.getPassword());

        if (null != clientsRequestVO.getListAcquiredGames() && clientsRequestVO.getListAcquiredGames().size() > 0) {
            clients.getListAcquiredGames().add(clientsRequestVO.getListAcquiredGames().get(0));
        }

        clients.setDateAcquiredGame(
                null != clientsRequestVO.getDateAcquiredGame() ? clientsRequestVO.getDateAcquiredGame()
                        : new Timestamp(new Date().getTime()));

        Set<Roles> set = clientsRequestVO.getRoles();
        if (set != null) {
            clients.setRoles(new HashSet<Roles>(set));
        }

        return clients;
    }

    /**
     * Mapper games to games request VO.
     *
     * @param gamesRequestVO the games request VO
     * @param games the games
     * @return the games
     */
    public static Games mapperGamesToGamesRequestVO(GamesRequestVO gamesRequestVO, Games games) {
        if (gamesRequestVO == null) {
            return null;
        }

        if (games == null) {
            return null;
        }

        games.setGameName(null != gamesRequestVO ? gamesRequestVO.getGameName() : games.getGameName());
        List<Images> list = (null != gamesRequestVO.getImage() ? gamesRequestVO.getImage() : games.getImage());
        if (list != null) {
            games.setImage(new ArrayList<Images>(list));
        }
        games.setActivationCode(gamesRequestVO.getActivationCode());
        games.setValue(null != gamesRequestVO.getValue() ? gamesRequestVO.getValue() : games.getValue());
        games.setStock(null != gamesRequestVO.getStock() ? gamesRequestVO.getStock() : games.getStock());

        return games;
    }
}
