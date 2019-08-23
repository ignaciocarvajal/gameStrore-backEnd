package com.everis.gameStore.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.everis.gameStore.domain.model.Images;

/**
 * The Interface ImagesRepository.
 */
@Repository
public interface ImagesRepository extends PagingAndSortingRepository<Images, Long> {

}
