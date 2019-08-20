package com.everis.gameStore.mapper;

import org.mapstruct.Mapper;

import com.everis.gameStore.domain.DTO.ClientsRequestDTO;
import com.everis.gameStore.domain.DTO.ClientsResponseDTO;
import com.everis.gameStore.domain.VO.ClientsRequestVO;
import com.everis.gameStore.domain.VO.ClientsResponseVO;
import com.everis.gameStore.domain.model.Clients;

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
     * Mapper clients to clients request VO.
     *
     * @param clientsRequestVO the clients request VO
     * @return the clients
     */
    Clients mapperClientsToClientsRequestVO(ClientsRequestVO clientsRequestVO);

    /**
     * To target.
     *
     * @param clientsRequestDTO the clients request DTO
     * @return the clients
     */
    Clients toTarget(ClientsRequestDTO clientsRequestDTO);

    /**
     * Clients response vo to list clients response DTO.
     *
     * @param clientsResponseVO the clients response VO
     * @return the list
     */
    ClientsResponseDTO ClientsResponseVoToListClientsResponseDTO(ClientsResponseVO clientsResponseVO);

    /**
     * Clients to list clients response VO.
     *
     * @param clients the clients
     * @return the clients response VO
     */
    ClientsResponseVO ClientsToListClientsResponseVO(Clients clients);
}
