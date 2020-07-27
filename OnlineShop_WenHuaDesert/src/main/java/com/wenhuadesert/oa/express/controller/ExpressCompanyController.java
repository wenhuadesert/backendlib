package com.wenhuadesert.oa.express.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.express.service.IExpressCompanyService;

@RestController
@RequestMapping(value="/expresscompany")
public class ExpressCompanyController {

	@Autowired
	private IExpressCompanyService es = null;
}
