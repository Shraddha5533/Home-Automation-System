package com.electronic;

public interface Device

{
	public String getName();
	
	public boolean deviceOn();
	
	public boolean deviceOff();
	
	
	public boolean deviceStatus();
	
	public boolean turnOn();
	
	public boolean turnOff();
	
	public long getTotalTimeInCurrentState();

	public void setName(String deviceName);
	
	
	
	

}
