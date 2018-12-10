package io.github.jhipster.application.service;

import io.github.jhipster.application.service.dto.PetDTO;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Pet.
 */
public interface PetService {

    /**
     * Save a pet.
     *
     * @param petDTO the entity to save
     * @return the persisted entity
     */
    PetDTO save(PetDTO petDTO);

    /**
     * Get all the pets.
     *
     * @return the list of entities
     */
    List<PetDTO> findAll();


    /**
     * Get the "id" pet.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<PetDTO> findOne(String id);

    /**
     * Delete the "id" pet.
     *
     * @param id the id of the entity
     */
    void delete(String id);
}
