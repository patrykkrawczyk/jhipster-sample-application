package io.github.jhipster.application.service.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Pet entity.
 */
public class PetDTO implements Serializable {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PetDTO petDTO = (PetDTO) o;
        if (petDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), petDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PetDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
