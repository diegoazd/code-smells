package mx.com.kubo.abusers.impl;

import mx.com.kubo.abusers.SpeedFactory;
import mx.com.kubo.abusers.AirPlaneType;
import mx.com.kubo.abusers.AirVehicle;
import static mx.com.kubo.abusers.AirPlaneType.CARRIER;

public class AirPlane implements AirVehicle 
{ 	
	private AirVehicleDTO dto;   
    
    public AirPlane(AirPlaneType type) 
    {
        if(type == CARRIER) 
        {
            throw new RuntimeException("Invalid argument");
        }
        
        dto = AirVehicleDTO
        .builder()
        .airplane(type)
        .build();        
    }

    public AirPlane(AirPlaneType type, int loadFactor) 
   {        
        dto = AirVehicleDTO
        .builder()
        .airplane(type)
        .loadFactor(loadFactor)
        .build();
    }  
        
    public String getType() 
    {
        return dto.getAirplane().getName();
    }

    public double getSpeed() 
    {    	
    	return SpeedFactory.getInstance(dto).getSpeed();      
    }
}
