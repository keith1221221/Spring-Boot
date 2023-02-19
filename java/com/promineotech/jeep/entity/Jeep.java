package com.promineotech.jeep.entity;

public class Jeep {

	@data
	@Builder
	@noArgsConstructor
	@allArgsConstructor
	
	public class Jeep {
		private Long modelpPK;
		private JeepModel modelId;
		private String trimLevel;
		private int numDoors;
		private int wheelSize;
		private BigDecimal basePrice;
	}
	
}
