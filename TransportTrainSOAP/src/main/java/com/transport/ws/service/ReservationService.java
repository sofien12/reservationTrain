package com.transport.ws.service;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.transport.ws.reservationsoap.GetReservation;
import com.transport.ws.reservationsoap.IntervalleTemps;
import com.transport.ws.reservationsoap.ReservationReponse;
import com.transport.ws.reservationsoap.Train;

@Service
public class ReservationService {

	
	public ReservationReponse isReserved(GetReservation map) {

		ReservationReponse resR = new ReservationReponse();
		List<Train> trains = getTrains();
		String []tempsReservation = temps(map.getTempsReservation());
		System.out.println(tempsReservation[0]+":" + tempsReservation[1]);
		if(trains.size() >0) {
			for(Train tarin :trains) {
				if(tarin.getVilleArrivee().toLowerCase().equals(map.getTrain().getVilleArrivee().toLowerCase())) {
					if(tarin.getIntervalleTemps().getDateDepart().getDay() > map.getDateReservation().getDay()
					&& tarin.getIntervalleTemps().getDateDepart().getMonth() >= map.getDateReservation().getMonth()
					&& tarin.getIntervalleTemps().getDateDepart().getYear() >= map.getDateReservation().getYear() ) {
						
						return getReservationReponse( resR , map, tarin) ;
					}
						else if(tarin.getIntervalleTemps().getDateDepart().getDay() == map.getDateReservation().getDay()
					&& tarin.getIntervalleTemps().getDateDepart().getMonth() == map.getDateReservation().getMonth()
					&& tarin.getIntervalleTemps().getDateDepart().getYear() == map.getDateReservation().getYear()){
							String []tempstrain = temps(tarin.getIntervalleTemps().getTempsDepart());
							System.out.println(tempstrain[0]+":" + tempstrain[1]);
							if(Integer.parseInt(tempstrain[0]) >= Integer.parseInt(tempsReservation[0])
								&& Integer.parseInt(tempstrain[1]) >= Integer.parseInt(tempsReservation[1])) {
								return getReservationReponse( resR , map, tarin) ;
							}
						
					
					}
					
				}
			}
		}
		
		return resR ;
	}

	public List<Train> getTrains(){

		List<Train> trains = new ArrayList<Train>();
		try {
			
			String reponse = GenericHTTPRest.getTrains("http://localhost:8081/trains") ;
			JSONArray ListTrainJson = new JSONArray(reponse) ;
			for(int i =0 ; i<ListTrainJson.length() ;i++) {
				Train train = new Train() ;
				
				train.setId(ListTrainJson.getJSONObject(i).getLong("id"));
				train.setVilleArrivee(ListTrainJson.getJSONObject(i).getString("villeArrivee"));
				train.setVilleDepart(ListTrainJson.getJSONObject(i).getString("villeDepart"));
				
				JSONObject intervalleTempsJson = (JSONObject) ListTrainJson.getJSONObject(i).get("intervalleTemps") ;
				IntervalleTemps intervalleTemps = new IntervalleTemps() ;
				intervalleTemps.setId(intervalleTempsJson.getLong("id"));
				XMLGregorianCalendar DateArrivee = 
						  DatatypeFactory.newInstance().newXMLGregorianCalendar(intervalleTempsJson.getString("dateArrivee"));
				intervalleTemps.setDateArrivee(DateArrivee);
				XMLGregorianCalendar DateDepart = 
						  DatatypeFactory.newInstance().newXMLGregorianCalendar(intervalleTempsJson.getString("dateDepart"));
				intervalleTemps.setDateDepart(DateDepart) ;
				intervalleTemps.setTempsDepart(intervalleTempsJson.getString("tempsDepart"));
				train.setIntervalleTemps(intervalleTemps);
				trains.add(train);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return trains ;
	}

	public String[] temps(String temps) {
		return temps.split(":");
	}
	public ReservationReponse getReservationReponse(ReservationReponse resR ,GetReservation map,Train tarin){
		resR.setClient(map.getClient());
		resR.setTrain(tarin);
		resR.setDateReservation(map.getDateReservation());
		resR.setTempsReservation(map.getTempsReservation());
		resR.setIsReserve(true);
		try {
			GenericHTTPRest.postReservation("http://localhost:8081/reservations", resR);
			return resR ;
		} catch (IOException e) {
			resR.setIsReserve(false);
			return resR;
		}
	}

}
