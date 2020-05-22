package com.transport.repository.reservationTrain; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.transport.domain.reservationTrain.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{

	
}