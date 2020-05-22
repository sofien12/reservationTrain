package com.transport.repository.reservationTrain; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.transport.domain.reservationTrain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long>{

}