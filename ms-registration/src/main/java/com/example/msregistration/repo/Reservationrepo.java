package com.example.msregistration.repo;


import com.example.msregistration.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface Reservationrepo extends JpaRepository<Reservation,Long> {
    List<Reservation>findReservationsByIdChambre(Long id);
}
