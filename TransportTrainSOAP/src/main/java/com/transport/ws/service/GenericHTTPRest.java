package com.transport.ws.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

import com.transport.ws.reservationsoap.ReservationReponse;

public class GenericHTTPRest {
	private static URL url ;
	private static  HttpURLConnection connexion ;
	
	public static void postReservation(String URL ,ReservationReponse res) throws IOException {
		JSONObject json =new JSONObject(res);
		
			url= new URL(URL);
		  connexion=(HttpURLConnection) url.openConnection();
          connexion.setUseCaches(false);
          //connexion.setDoInput(true); //pour Get
        connexion.setRequestProperty("Content-Type" ,"application/json");
          connexion.setDoOutput(true);//Post
          connexion.setRequestMethod("POST");
          OutputStreamWriter wr =new OutputStreamWriter(connexion.getOutputStream());
          wr.write(json.toString());
          wr.close();
         connexion.getInputStream();

	}
	
	public static  String getTrains(String URL ) throws Exception {
		
			url= new URL(URL);
		  connexion=(HttpURLConnection) url.openConnection();
		  connexion.setRequestMethod("GET");
		  
		int responseCode = connexion.getResponseCode();
		
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(connexion.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			System.out.println(response.toString());
			return response.toString();
		} else {
			return "GET request not worked" ;
		}
		
		
	}
}
