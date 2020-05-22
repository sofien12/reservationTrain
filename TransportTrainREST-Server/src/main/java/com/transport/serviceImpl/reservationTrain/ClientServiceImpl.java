package com.transport.serviceImpl.reservationTrain; 

import com.transport.domain.reservationTrain.Client;
import com.transport.service.reservationTrain.ClientService;
import com.transport.repository.reservationTrain.ClientRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ClientServiceImpl implements ClientService {

   @Autowired
      private ClientRepository clientRepository ;

   @Override
     public void saveOrUpdate(Client client){
          clientRepository.save(client);
      }

   @Override
     public void deleteById(Long id){
          clientRepository.deleteById(id);
      }

   @Override
     public Optional<Client> findById(Long id){
          return clientRepository.findById(id);
}

   @Override
      public List<Client> findAll(){
           return clientRepository.findAll();
}

}