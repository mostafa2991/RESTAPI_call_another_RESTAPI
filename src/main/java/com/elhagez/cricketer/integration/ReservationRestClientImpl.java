 /* package com.elhagez.cricketer.integration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.elhagez.cricketer.integration.dto.Cricketer;

@Component
public class ReservationRestClientImpl implements CricketerRestClient {

	private static final String Reservation_Rest_URL = "http://localhost:8080/cricketer/reservations/";

	@Override
	public Cricketer findById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		Cricketer cricketer =restTemplate.getForObject(Reservation_Rest_URL+id,Cricketer.class);
		return cricketer;
	}

	@Override
	public List<Cricketer> findAll() {
		RestTemplate restTemplate = new RestTemplate();
		Cricketer[] cricketer =restTemplate.getForObject(Reservation_Rest_URL,Cricketer[].class);
		List<Cricketer> arrayList = new ArrayList<Cricketer>(Arrays.asList(cricketer));
		return arrayList;
	}

	@Override
	public void add(Cricketer cricketer) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(Reservation_Rest_URL, cricketer);
	}

	@Override
	public Cricketer updateById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		Cricketer cricketer =restTemplate.postForObject(Reservation_Rest_URL,id,Cricketer.class);
		return cricketer;
	}

	@Override
	public void deleteById(int id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(Reservation_Rest_URL,id);		
	}

}*/
