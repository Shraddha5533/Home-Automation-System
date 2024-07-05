package com.electronic;

public class AirConditioners implements Device
{
	String name;
	String status;
	
	public AirConditioners() 
	{
		// TODO Auto-generated constructor stub
		this.status = "Off";
	}

	

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getName() {
		
		if(name!=null)
	        return name;
			else
				return null;
	}
	public void setName(String Nm)
	{
		this.name=Nm;
	}
	
	
	public boolean turnOn() 
	{
		if (this.status.equals("Off"))
        {
            this.status = "On";
            return true;
        }
        return false; // Already on
    }

    
    public boolean turnOff() 
    {
    	if (this.status.equals("On"))
        {
            this.status = "Off";
            return true;
        }
        return false; // Already off
    }
	public boolean deviceOn() 
	{
		
		if(this.status.equals("On"))
		{
			return false;
		}
		else
		{
		   this.status="On";
		   return true;
		
		}
	}

	
	public boolean deviceOff() 
	{ 
		if(this.status.equals("Off"))
		{
			return false;
		}
		else
		{
			this.status="Off";
			return true;
		}
		
		
	}

	
	public boolean deviceStatus() 
	{
		if(this.status.equals("On"))
		{
			return true;
		}
		else
		{
		
		return false;
		}
		
	}
	
	public long getTotalTimeInCurrentState() 
    {
        return getTotalTimeInCurrentState();
    }

	
	
	 
	
	
	

}
