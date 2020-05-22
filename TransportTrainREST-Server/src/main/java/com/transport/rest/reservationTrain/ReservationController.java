package com.transport.rest.reservationTrain; 

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transport.customer.ReservationReponse;
import com.transport.domain.reservationTrain.Reservation;
import com.transport.service.reservationTrain.ReservationService;

@RestController
public class ReservationController {

      @Autowired
       private ReservationService reservationService ;
    @Autowired
    private ModelMapper modelMapper ;
      
      @PostMapping(value ="/reservations" , produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
      public void save(@RequestBody ReservationReponse request) {
    	  
    	  Reservation reservation = modelMapper.map(request, Reservation.class);
    	  reservation.setDateReservation(request.getDateReservation().toGregorianCalendar().toZonedDateTime().toLocalDate());
    	  reservation.setCode(reservationService.count());
    	  reservationService.saveOrUpdate(reservation) ; 
    		 
    	  
    		  
}

      @PutMapping(value ="/reservations")
      public void update(@RequestBody Reservation reservation) {
          reservationService.saveOrUpdate(reservation);
}

      @DeleteMapping(value ="/reservations/{id}")
      public void delete(@PathVariable Long id) {
          reservationService.deleteById(id);
}

      @GetMapping(value ="/reservations/{id}")
      public Optional<Reservation>  findById(@PathVariable Long id) {
          return reservationService.findById(id);
}

      @GetMapping(value ="/reservations")
      public List<Reservation>  findAll() {
         return reservationService.findAll();
}
}