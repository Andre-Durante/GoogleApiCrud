package com.location.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationCrudRepository extends MongoRepository<LocationCrudData, String> {
}