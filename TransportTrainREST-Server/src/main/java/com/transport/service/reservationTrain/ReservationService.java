package com.transport.service.reservationTrain; 

import com.transport.domain.reservationTrain.Reservation;
import java.util.Optional;
import java.util.List;

public interface ReservationService{

      void saveOrUpdate(Reservation reservation);

      void deleteById(Long id ) ;

      Optional<Reservation> findById(Long id);

      List<Reservation> findAll();
      Long count();

}