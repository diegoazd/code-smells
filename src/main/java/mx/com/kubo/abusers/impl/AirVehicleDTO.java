package mx.com.kubo.abusers.impl;

import lombok.Builder;
import lombok.Data;
import mx.com.kubo.abusers.AirPlaneType;
import mx.com.kubo.abusers.DroneType;

@Data
@Builder
public class AirVehicleDTO 
{
    private AirPlaneType airplane;
    
    private DroneType drone;
    
    private int loadFactor;
    
    private double speed;
}
