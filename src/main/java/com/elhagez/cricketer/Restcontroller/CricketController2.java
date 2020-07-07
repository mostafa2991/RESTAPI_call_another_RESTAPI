/* package com.elhagez.cricketer.Restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.elhagez.cricketer.integration.enitities.Cricketer;


@RestController
@RequestMapping("/persons")
public class CricketController2 {
	private static final String BASE_URL = "http://localhost:8080";
	private static final String PERSONS_URL = BASE_URL + "/cricketer";
	private static final String ID_PATH_URL = PERSONS_URL + "/{id}";

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cricketer>> getPersons() {

		RestTemplate restTemplate = new RestTemplate();
		Cricketer[] personListResponse = restTemplate.getForObject(PERSONS_URL, Cricketer[].class);
		List<Cricketer> persons = Arrays.asList(personListResponse);
		return new ResponseEntity<>(persons, HttpStatus.OK);
	}

	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Cricketer getPersonById(@PathVariable("id") final long id) {

		RestTemplate restTemplate = new RestTemplate();
		Cricketer personListResponse = restTemplate.getForObject(ID_PATH_URL, Cricketer.class, id);

		return personListResponse;
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> addPerson(@RequestBody final Cricketer person) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.postForLocation(PERSONS_URL, person);

		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@PutMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> updatePerson(@RequestBody final Cricketer person) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.put(PERSONS_URL, person);
		return ResponseEntity.status(HttpStatus.OK).build();
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deletePerson(@PathVariable("id") final long id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(ID_PATH_URL, id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}


}*/
