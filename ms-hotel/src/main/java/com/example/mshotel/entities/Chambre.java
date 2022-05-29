package com.example.mshotel.entities;

import com.example.mshotel.module.Reservation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = "hotel")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
   int  number ;
   String type;

   @ManyToOne
    Hotel hotel;

   @Transient
  public List<Reservation> listR;

}
