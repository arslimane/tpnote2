package com.example.msregistration;

import com.example.msregistration.entities.Client;
import com.example.msregistration.entities.Reservation;
import com.example.msregistration.repo.Clientrepo;
import com.example.msregistration.repo.Reservationrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.sql.Date;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MsRegistrationApplication implements CommandLineRunner {
    @Autowired
    Reservationrepo reservationrepo;
    @Autowired
    Clientrepo clientrepo;

    public static void main(String[] args) {
        SpringApplication.run(MsRegistrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        clientrepo.save(new Client(null,"aymen",null));
        clientrepo.save(new Client(null,"slimane",null));
        reservationrepo.save(new Reservation(null, Date.valueOf("2000-08-22"), Date.valueOf("2001-08-22"),clientrepo.getReferenceById(1L),1L));
        reservationrepo.save(new Reservation(null, Date.valueOf("2012-08-22"), Date.valueOf("2013-08-22"),clientrepo.getReferenceById(1L),2L));
        reservationrepo.save(new Reservation(null, Date.valueOf("2000-08-22"), Date.valueOf("2001-08-22"),clientrepo.getReferenceById(2L),1L));
        reservationrepo.save(new Reservation(null, Date.valueOf("2012-08-22"), Date.valueOf("2013-08-22"),clientrepo.getReferenceById(2L),2L));



    }
}
