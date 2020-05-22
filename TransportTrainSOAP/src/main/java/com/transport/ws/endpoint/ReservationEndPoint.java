package com.transport.ws.endpoint;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.transport.ws.reservationsoap.GetReservation;
import com.transport.ws.reservationsoap.ReservationReponse;
import com.transport.ws.service.ReservationService;

@Endpoint
public class ReservationEndPoint {

	private static final String namespace = "http://www.transport.com/ws/reservationsoap";

	@Autowired
	private ReservationService reservationService ;
	

	@PayloadRoot(namespace = namespace, localPart = "getReservation")
	@ResponsePayload
	public ReservationReponse getLoanStatus(@RequestPayload GetReservation map) {
		return reservationService.isReserved(map);
	}
	
	
}
