package com.example.mshotel;

import com.example.mshotel.entities.Chambre;
import com.example.mshotel.entities.Hotel;
import com.example.mshotel.repo.ChambreRepo;
import com.example.mshotel.repo.Hotelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsHotelApplication implements CommandLineRunner {
    @Autowired
    Hotelrepo hotelrepo;
    @Autowired
    ChambreRepo chambreRepo;

    public static void main(String[] args) {
        SpringApplication.run(MsHotelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        hotelrepo.save(new Hotel(null,"aymanehotel",null));
        hotelrepo.save(new Hotel(null,"slimanehotel",null));
        chambreRepo.save(new Chambre(null,1,"double",hotelrepo.getReferenceById(1L),null));
        chambreRepo.save(new Chambre(null,2,"double",hotelrepo.getReferenceById(1L),null));
        chambreRepo.save(new Chambre(null,3,"double",hotelrepo.getReferenceById(1L),null));
        chambreRepo.save(new Chambre(null,4,"double",hotelrepo.getReferenceById(1L),null));
        chambreRepo.save(new Chambre(null,1,"double",hotelrepo.getReferenceById(2L),null));
        chambreRepo.save(new Chambre(null,2,"double",hotelrepo.getReferenceById(2L),null));
        chambreRepo.save(new Chambre(null,3,"double",hotelrepo.getReferenceById(2L),null));
        chambreRepo.save(new Chambre(null,4,"double",hotelrepo.getReferenceById(2L),null));

    }
}
