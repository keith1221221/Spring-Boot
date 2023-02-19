package com.promineotech.jeep.controller;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicJeepSalesController implements JeepSalesController {

	@Override
	public List<Jeep> fetchJeeps(String model, String trim) {
		
		return null;
	}

}
