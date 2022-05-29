package com.example.mshotel.repo;

import com.example.mshotel.entities.Chambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ChambreRepo extends JpaRepository<Chambre,Long> {
}
