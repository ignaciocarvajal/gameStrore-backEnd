package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Roles;

/**
 * The Interface RolesRespository.
 */
@Repository
public interface RolesRespository extends PagingAndSortingRepository<Roles, Long> {

}
