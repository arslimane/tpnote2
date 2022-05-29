package com.example.msregistration.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name="pr1",types = Reservation.class)
public interface Reservationproje {
    @Value("#{target.client.name}")
    String getClientName();

    @Value("#{target.dateD}")
    Date getDateD();
}
