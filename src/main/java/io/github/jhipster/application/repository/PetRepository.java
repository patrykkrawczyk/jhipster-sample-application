package io.github.jhipster.application.repository;

import io.github.jhipster.application.domain.Pet;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data MongoDB repository for the Pet entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PetRepository extends MongoRepository<Pet, String> {

}
