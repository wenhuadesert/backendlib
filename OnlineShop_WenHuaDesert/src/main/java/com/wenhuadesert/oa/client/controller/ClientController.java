package com.wenhuadesert.oa.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.client.service.IClientService;

@RestController
@RequestMapping(value="/client")
public class ClientController {

	@Autowired
	private IClientService cs = null;
}
