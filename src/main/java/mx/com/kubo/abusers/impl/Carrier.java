package mx.com.kubo.abusers.impl;

import lombok.Builder;
import mx.com.kubo.abusers.AirVehicle;

@Builder
public class Carrier implements AirVehicle 
{
	private AirVehicleDTO dto;

	public double getSpeed() 
	{				
		return dto.getSpeed() - dto.getLoadFactor() * 0.5;
	}

	public String getType() 
	{		
		return dto.getAirplane().getName();
	}
}
