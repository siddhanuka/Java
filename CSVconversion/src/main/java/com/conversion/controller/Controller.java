package com.conversion.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conversion.service.AddService;

@RestController
public class Controller {

	@Autowired
	private AddService adservice;
	
	@RequestMapping(value="/parse")
	public void parsefile() throws IOException{
		adservice.parsefile();
	}
}
