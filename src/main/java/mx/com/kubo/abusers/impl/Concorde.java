package mx.com.kubo.abusers.impl;

import lombok.Builder;
import mx.com.kubo.abusers.AirVehicle;

@Builder
public class Concorde implements AirVehicle
{
	private AirVehicleDTO dto;

	public double getSpeed() 
	{		
		return dto.getSpeed();
	}

	public String getType() 
	{		
		return dto.getAirplane().getName();
	}
}
