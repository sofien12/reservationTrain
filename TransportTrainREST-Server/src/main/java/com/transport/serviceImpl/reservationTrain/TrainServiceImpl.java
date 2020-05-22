package com.transport.serviceImpl.reservationTrain; 

import java.util.List;
import java.util.Optional;

import javax.xml.datatype.DatatypeConfigurationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.domain.reservationTrain.Train;
import com.transport.repository.reservationTrain.TrainRepository;
import com.transport.service.reservationTrain.TrainService;

@Service
public class TrainServiceImpl implements TrainService {

   @Autowired
      private TrainRepository trainRepository ;

   
   @Override
     public void saveOrUpdate(Train train) throws DatatypeConfigurationException{
	   
	   trainRepository.save(train) ;
	   
      }

   @Override
     public void deleteById(Long id){
          trainRepository.deleteById(id);
      }

   @Override
     public Optional<Train> findById(Long id){
          return trainRepository.findById(id);
}

   @Override
      public List<Train> findAll(){
           return trainRepository.findAll();
}

}