package mx.com.kubo.abusers;

public enum AirPlaneType 
{
    CONCORDE("Concorde"), 
    CARRIER("Carrier"), 
    DRONE("Drone");

    private String name;
    
    AirPlaneType(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
}
