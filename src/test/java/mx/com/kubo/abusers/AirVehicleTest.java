package mx.com.kubo.abusers;

import mx.com.kubo.abusers.impl.AirPlane;
import mx.com.kubo.abusers.impl.Drone;
import org.junit.Test;

import static org.junit.Assert.*;
import static mx.com.kubo.abusers.AirPlaneType.*;
import static mx.com.kubo.abusers.DroneType.*;

public class AirVehicleTest 
{
    AirVehicle airVehicle;

    @Test
    public void shouldReturnConcorde() 
    {
        airVehicle = new AirPlane(CONCORDE);    	
        assertTrue(2198.00d ==   airVehicle.getSpeed());
        assertEquals("Concorde", airVehicle.getType());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExpcetionWhenInstanceCarrierWithOneParameterConstructor() 
    {
       new AirPlane(CARRIER);    	
    }

    @Test
    public void shouldReturnCarrier() 
    {
        airVehicle = new AirPlane(CARRIER, 250);    	
        assertTrue(1875.00d == airVehicle.getSpeed());
        assertEquals("Carrier", airVehicle.getType());
    }

    @Test
    public void shouldReturnDrone() 
    {
        airVehicle = new AirPlane(DRONE);
        assertTrue(100.00d == airVehicle.getSpeed());
        assertEquals("Drone", airVehicle.getType());
    }

    @Test
    public void shouldReturnDroneSingleRotor() 
    {
        airVehicle = new Drone(SINGLE_ROTOR);
        assertTrue(100.00d == airVehicle.getSpeed());
        assertEquals("Drone", airVehicle.getType());
        assertTrue(3 == ((Drone)airVehicle).getDroneType());        
    }

    @Test
    public void shouldReturnDroneFixedWing() 
    {
        airVehicle = new Drone(FIXED_WING);
        assertTrue(150.00d == airVehicle.getSpeed());
        assertEquals("Drone", airVehicle.getType());
        assertTrue(2 == ((Drone)airVehicle).getDroneType());
    }

    @Test
    public void shouldReturnDroneMultiRotor() 
    {
        airVehicle = new Drone(MULTI_ROTOR);
        assertTrue(60.00d == airVehicle.getSpeed());
        assertEquals("Drone", airVehicle.getType());
        assertTrue(1 == ((Drone)airVehicle).getDroneType());
    }
}