package mx.com.kubo.abusers;

public enum DroneType
{
    MULTI_ROTOR(1, 60.00d), 
    FIXED_WING(2, 150.00d), 
    SINGLE_ROTOR(3, 100.00d);

    private int type;
    
    private double speed;

    DroneType(int type, double speed) 
    {
        this.type = type;
        this.speed = speed;
    }

    public int getType() 
    {
        return type;
    }
    
    public double getSpeed()
    {
    	return speed;
    }
}
