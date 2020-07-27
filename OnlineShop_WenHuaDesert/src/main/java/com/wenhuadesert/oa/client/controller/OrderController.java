package com.wenhuadesert.oa.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wenhuadesert.oa.client.service.IOrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {

	@Autowired
	private IOrderService os= null;
}
