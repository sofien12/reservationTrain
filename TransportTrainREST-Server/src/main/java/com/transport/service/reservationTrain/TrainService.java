package com.transport.service.reservationTrain; 

import com.transport.domain.reservationTrain.Train;
import java.util.Optional;

import javax.xml.datatype.DatatypeConfigurationException;

import java.util.List;

public interface TrainService{

      void saveOrUpdate(Train train) throws DatatypeConfigurationException;

      void deleteById(Long id ) ;

      Optional<Train> findById(Long id);

      List<Train> findAll();

}