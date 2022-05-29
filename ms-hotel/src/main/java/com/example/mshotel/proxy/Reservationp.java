package com.example.mshotel.proxy;

import com.example.mshotel.module.Reservation;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(name="ms-reservation")
@LoadBalancerClient(name="ms-reservation")

public interface Reservationp {
    @GetMapping("/reservations/search/findReservationsByIdChambre")
    CollectionModel<Reservation> getReservationByIdChambre(@RequestParam("id") Long id, @RequestParam("projection") String projection);
}
