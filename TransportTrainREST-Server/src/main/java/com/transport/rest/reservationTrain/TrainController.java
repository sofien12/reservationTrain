package com.transport.rest.reservationTrain; 

import com.transport.domain.reservationTrain.Train;
import com.transport.service.reservationTrain.TrainService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.Optional;

import javax.xml.datatype.DatatypeConfigurationException;

import java.util.List;

@RestController
public class TrainController {

      @Autowired
       private TrainService trainService ;

      @PostMapping(value ="/trains")
      public void save(@RequestBody Train train) throws DatatypeConfigurationException {
          trainService.saveOrUpdate(train);
}

      @PutMapping(value ="/trains")
      public void update(@RequestBody Train train) throws DatatypeConfigurationException{
          trainService.saveOrUpdate(train);
}

      @DeleteMapping(value ="/trains/{id}")
      public void delete(@PathVariable Long id) {
          trainService.deleteById(id);
}

      @GetMapping(value ="/trains/{id}")
      public Optional<Train>  findById(@PathVariable Long id) {
          return trainService.findById(id);
}

      @GetMapping(value ="/trains")
      public List<Train>  findAll() {
         return trainService.findAll();
}
}