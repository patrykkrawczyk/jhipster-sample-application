package io.github.jhipster.application.service.mapper;

import io.github.jhipster.application.domain.*;
import io.github.jhipster.application.service.dto.PetDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Pet and its DTO PetDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PetMapper extends EntityMapper<PetDTO, Pet> {



    default Pet fromId(String id) {
        if (id == null) {
            return null;
        }
        Pet pet = new Pet();
        pet.setId(id);
        return pet;
    }
}
