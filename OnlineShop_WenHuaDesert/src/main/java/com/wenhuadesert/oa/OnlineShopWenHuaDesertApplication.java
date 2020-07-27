package com.wenhuadesert.oa;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages= {"com.wenhuadesert.oa.**.mapper"})
public class OnlineShopWenHuaDesertApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineShopWenHuaDesertApplication.class, args);
	}

}
