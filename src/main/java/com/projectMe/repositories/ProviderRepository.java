package com.projectMe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectMe.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}
