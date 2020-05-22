package com.transport.serviceImpl.reservationTrain; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.domain.reservationTrain.Reservation;
import com.transport.repository.reservationTrain.ReservationRepository;
import com.transport.service.reservationTrain.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService {

   @Autowired
      private ReservationRepository reservationRepository ;
  
   
   @Override
     public void saveOrUpdate(Reservation reservation){
	   reservationRepository.save(reservation) ;
   }

   @Override
     public void deleteById(Long id){
          reservationRepository.deleteById(id);
      }

   @Override
     public Optional<Reservation> findById(Long id){
          return reservationRepository.findById(id);
}

   @Override
      public List<Reservation> findAll(){
           return reservationRepository.findAll();
}

@Override
public Long count() {
	// TODO Auto-generated method stub
	return reservationRepository.count();
}

}