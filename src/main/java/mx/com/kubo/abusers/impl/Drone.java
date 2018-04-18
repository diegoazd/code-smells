package mx.com.kubo.abusers.impl;

import mx.com.kubo.abusers.AirVehicle;
import mx.com.kubo.abusers.DroneType;

import static mx.com.kubo.abusers.AirPlaneType.DRONE;

public class Drone implements AirVehicle 
{       
    private AirVehicleDTO dto;

    public Drone(DroneType type) 
    {        
        dto = AirVehicleDTO
        .builder()
        .airplane(DRONE)
        .build();
        
        dto.setDrone(type);
    }

    @Override
    public double getSpeed() 
    {
    	return dto.getDrone().getSpeed();        
    }

    @Override
    @Deprecated
    public String getType() 
    {
        return dto.getAirplane().getName();
    }

    public int getDroneType() 
    {
        return dto.getDrone().getType();
    }
}
