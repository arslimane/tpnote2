package com.example.mshotel.Controllers;

import com.example.mshotel.entities.Chambre;
import com.example.mshotel.entities.Hotel;
import com.example.mshotel.module.Reservation;
import com.example.mshotel.proxy.Reservationp;
import com.example.mshotel.repo.ChambreRepo;
import com.example.mshotel.repo.Hotelrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChambreController {
    @Autowired
    Reservationp reservationp;
    @Autowired
    ChambreRepo chambreRepo;
    @Autowired
    Hotelrepo hotelrepo;
    @GetMapping("/chambre/{id}")
    Chambre getR(@PathVariable("id") Long id){
        Chambre c=chambreRepo.getReferenceById(id);
        ArrayList<Reservation> r=new ArrayList<>( reservationp.getReservationByIdChambre(id,"pr1").getContent());
        for (Reservation e:r
             ) {
            System.out.println(" "+e.getClientName()+" "+e.getDateD());
        }
        System.out.println("c "+c.getId());
        c.listR=new ArrayList<Reservation>();
        c.listR.addAll(r);
        c.setListR(r);
        return c ;
    }
    @GetMapping("/hotel/{id}")
    int getNumberdereservation(@PathVariable("id") Long id){
       Hotel h= hotelrepo.getReferenceById(id);
       Collection<Chambre> listec=  h.getListeChambres();
       int number=0;
        for (Chambre c:listec
             ) {
            number=number+reservationp.getReservationByIdChambre(id,"pr1").getContent().size();
        }
        return number;
    }

}
