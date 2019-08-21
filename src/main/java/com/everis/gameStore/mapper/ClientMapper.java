package com.everis.gameStore.mapper;

import org.mapstruct.Mapper;

import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.domain.DTO.RolesResponseDTO;
import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.VO.RolesResponseVO;
import com.everis.gameStore.domain.model.Clients;
import com.everis.gameStore.domain.model.Roles;

/**
 * The Interface ClientMapper.
 */
@Mapper(componentModel = "spring")
public interface ClientMapper {

    /**
     * Mapper clients request dto to games request VO.
     *
     * @param clientsRequestDTO the clients request DTO
     * @return the clients request VO
     */
    ClientsRequestVO mapperClientsRequestDtoToGamesRequestVO(ClientsRequestDTO clientsRequestDTO);

    /**
     * Clients response vo to clients response DTO.
     *
     * @param clientsResponseVO the clients response VO
     * @return the clients response DTO
     */
    ClientsResponseDTO ClientsResponseVoToClientsResponseDTO(ClientsResponseVO clientsResponseVO);

    /**
     * Clients response vo to list clients response DTO.
     *
     * @param clients the clients
     * @return the clients response DTO
     */
    ClientsResponseDTO ClientsResponseVoToListClientsResponseDTO(ClientsResponseVO clients);

    /**
     * Mapper clients to clients request VO.
     *
     * @param clientsRequestVO the clients request VO
     * @return the clients
     */
    Clients mapperClientsToClientsRequestVO(ClientsRequestVO clientsRequestVO);

    /**
     * Clients to list clients response VO.
     *
     * @param client the client
     * @return the clients response VO
     */
    ClientsResponseVO ClientsToListClientsResponseVO(Clients client);

    /**
     * Clients to clients response VO.
     *
     * @param clients the clients
     * @return the clients response VO
     */
    ClientsResponseVO ClientsToClientsResponseVO(Clients clients);

    /**
     * Roles response vo to list roles response DTO.
     *
     * @param roles the roles
     * @return the roles response DTO
     */
    RolesResponseDTO RolesResponseVoToListRolesResponseDTO(RolesResponseVO roles);

    /**
     * Roles response vo to roles.
     *
     * @param roles the roles
     * @return the roles response VO
     */
    RolesResponseVO RolesResponseVoToRoles(Roles roles);

}
