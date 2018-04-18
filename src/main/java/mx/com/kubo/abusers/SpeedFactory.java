package mx.com.kubo.abusers;

import mx.com.kubo.abusers.impl.AirVehicleDTO;
import mx.com.kubo.abusers.impl.Carrier;
import mx.com.kubo.abusers.impl.Concorde;

public abstract class SpeedFactory 
{
	private static AirVehicle instance;			
	
	public static AirVehicle getInstance(AirVehicleDTO dto)
	{
        switch (dto.getAirplane()) 
        {
            case CONCORDE:
            	instance = Concorde
            	.builder()
            	.dto(AirVehicleDTO
            	.builder()
            	.speed(2198.00d)
            	.airplane(dto.getAirplane())
            	.build())
            	.build();
            break;
            
            case CARRIER:
            	instance = Carrier
            	.builder()
            	.dto(AirVehicleDTO
                .builder()
                .speed(2000)
                .loadFactor(dto.getLoadFactor())
                .airplane(dto.getAirplane())
                .build())
            	.build();                
            break;
            
            default:
            	instance = Concorde
            	.builder()
            	.dto(AirVehicleDTO
            	.builder()
            	.speed(100.00d)
            	.airplane(dto.getAirplane())
            	.build())
            	.build();
        }
        
        return instance;
	}
}
