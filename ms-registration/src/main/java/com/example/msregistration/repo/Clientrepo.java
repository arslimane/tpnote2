package com.example.msregistration.repo;

import com.example.msregistration.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Clientrepo extends JpaRepository<Client,Long> {
}
