package com.example.mshotel.repo;


import com.example.mshotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Hotelrepo extends JpaRepository<Hotel,Long> {
}
