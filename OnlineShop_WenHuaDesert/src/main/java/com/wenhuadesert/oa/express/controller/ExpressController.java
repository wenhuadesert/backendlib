package com.wenhuadesert.oa.express.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.express.service.IExpressService;

@RestController
@RequestMapping(value="/express")
public class ExpressController {

	@Autowired
	private IExpressService es = null;
}
