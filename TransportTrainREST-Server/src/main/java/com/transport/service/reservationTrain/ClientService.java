package com.transport.service.reservationTrain; 

import com.transport.domain.reservationTrain.Client;
import java.util.Optional;
import java.util.List;

public interface ClientService{

      void saveOrUpdate(Client client);

      void deleteById(Long id ) ;

      Optional<Client> findById(Long id);

      List<Client> findAll();

}