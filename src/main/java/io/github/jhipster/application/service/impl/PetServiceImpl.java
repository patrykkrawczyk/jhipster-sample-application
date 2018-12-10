package io.github.jhipster.application.service.impl;

import io.github.jhipster.application.service.PetService;
import io.github.jhipster.application.domain.Pet;
import io.github.jhipster.application.repository.PetRepository;
import io.github.jhipster.application.service.dto.PetDTO;
import io.github.jhipster.application.service.mapper.PetMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing Pet.
 */
@Service
public class PetServiceImpl implements PetService {

    private final Logger log = LoggerFactory.getLogger(PetServiceImpl.class);

    private final PetRepository petRepository;

    private final PetMapper petMapper;

    public PetServiceImpl(PetRepository petRepository, PetMapper petMapper) {
        this.petRepository = petRepository;
        this.petMapper = petMapper;
    }

    /**
     * Save a pet.
     *
     * @param petDTO the entity to save
     * @return the persisted entity
     */
    @Override
    public PetDTO save(PetDTO petDTO) {
        log.debug("Request to save Pet : {}", petDTO);

        Pet pet = petMapper.toEntity(petDTO);
        pet = petRepository.save(pet);
        return petMapper.toDto(pet);
    }

    /**
     * Get all the pets.
     *
     * @return the list of entities
     */
    @Override
    public List<PetDTO> findAll() {
        log.debug("Request to get all Pets");
        return petRepository.findAll().stream()
            .map(petMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }


    /**
     * Get one pet by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Override
    public Optional<PetDTO> findOne(String id) {
        log.debug("Request to get Pet : {}", id);
        return petRepository.findById(id)
            .map(petMapper::toDto);
    }

    /**
     * Delete the pet by id.
     *
     * @param id the id of the entity
     */
    @Override
    public void delete(String id) {
        log.debug("Request to delete Pet : {}", id);
        petRepository.deleteById(id);
    }
}
