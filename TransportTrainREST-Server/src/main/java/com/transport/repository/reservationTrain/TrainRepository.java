package com.transport.repository.reservationTrain; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.transport.domain.reservationTrain.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train,Long>{

}