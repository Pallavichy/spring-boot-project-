package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.SalesMan;
import com.example.demo.model.Salesman_details;

@RestController
@RequestMapping("/demo")
public class Controller {
	@Autowired
    private SalesMan man;
	@PostMapping(value="/save")
	public Salesman_details saveSalesman_details(@RequestBody Salesman_details salesman_details) {
		System.out.println(salesman_details.getSalesmanId());
		System.out.println(salesman_details.getSalesmanName());
		System.out.println(salesman_details.getSalesmanAdd());
		System.out.println(salesman_details.getBookName());
		System.out.println(salesman_details.getBookSub());
		System.out.println(salesman_details.getBookClass());

		
		Salesman_details insertedSalesman = man.save(salesman_details);
        return insertedSalesman;
	}
}
