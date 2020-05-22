package com.transport.rest.reservationTrain; 

import com.transport.domain.reservationTrain.Client;
import com.transport.service.reservationTrain.ClientService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;
import java.util.List;

@RestController
public class ClientController {

      @Autowired
       private ClientService clientService ;

      @PostMapping(value ="/clients")
      public void save(@RequestBody Client client) {
          clientService.saveOrUpdate(client);
}

      @PutMapping(value ="/clients")
      public void update(@RequestBody Client client) {
          clientService.saveOrUpdate(client);
}

      @DeleteMapping(value ="/clients/{id}")
      public void delete(@PathVariable Long id) {
          clientService.deleteById(id);
}

      @GetMapping(value ="/clients/{id}")
      public Optional<Client>  findById(@PathVariable Long id) {
          return clientService.findById(id);
}

      @GetMapping(value ="/clients")
      public List<Client>  findAll() {
         return clientService.findAll();
}
}