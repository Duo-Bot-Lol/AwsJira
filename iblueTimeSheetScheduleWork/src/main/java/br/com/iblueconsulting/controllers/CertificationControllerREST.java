package br.com.iblueconsulting.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.iblueconsulting.model.Certification;
import br.com.iblueconsulting.repository.ICertification;

@RestController
@RequestMapping(value="/manageriblueconsulting")
public class CertificationControllerREST {

	public static final Logger logger = LoggerFactory.getLogger(CertificationControllerREST.class);

	@Autowired
	private ICertification icertification;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<Certification>> list() {
		return new ResponseEntity<List<Certification>>(new ArrayList<Certification>(icertification.findAll()),	HttpStatus.OK);
	}

	@RequestMapping(value = "/findbyid/{id}", method = RequestMethod.GET)
	public ResponseEntity<Certification> buscar(@PathVariable("id") Integer id) {
		Certification certification = icertification.findById(id).get();
		System.out.println(certification);
		if (certification == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Certification>(certification, HttpStatus.OK);
	}

}
