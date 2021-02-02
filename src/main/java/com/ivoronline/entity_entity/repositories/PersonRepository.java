package com.ivoronline.entity_entity.repositories;

import com.ivoronline.entity_entity.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
