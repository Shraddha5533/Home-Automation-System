package com.electronic;

public class Showers implements Device
{
	String name;
	String status;
	
	public Showers() 
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
     
	
       public String getName() 
     {
		
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
		long totalTimeInCurrentState = 0;
		if(this.status.equals("On"))
		{
        
        totalTimeInCurrentState= totalTimeInCurrentState+System.currentTimeMillis();
        
		}
		return false;
		
    }
	
	
	public boolean turnOff()
	{
		long totalTimeInCurrentState = 0;
		if(this.status.equals("Off"))
		{
			totalTimeInCurrentState=totalTimeInCurrentState-System.currentTimeMillis();
		}
		return false;
		
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
