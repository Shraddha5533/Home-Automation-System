package com.electronic;

import java.util.ArrayList;

public class Room 
{
	int roomNo;
	String roomType;
	ArrayList<Device>devices;
	
	public Room() 
	{
		// TODO Auto-generated constructor stub
	}

	public Room(int roomNo,String roomType)
	{
		super();
		this.roomNo=roomNo;
		this.roomType = roomType;
		this.devices = new ArrayList<Device>();
		
	}

	public void setRoomNo(int roomNo)
	{
		this.roomNo=roomNo;
	}
	
	public int getRoomNo()
	{
		return roomNo;
	}
	public String getRoomType()
	
	{
		return roomType;
	}

	public void setRoomType(String roomType) 
	{
		this.roomType = roomType;
	}

	public ArrayList<Device> getDevice() 
	{
		return devices;
	}

	public void setDevice(Device device) 
	{
		this.devices.add(device);
	}
	
	public void addDevice(Device device) 
	{
        //ArrayList<Device> devices = new ArrayList<Device>();
		devices.add(device);
    }

    public void turnOnDevice(String deviceName) 
    {
       // Device[] devices = null;   //data type device []  devices variable name
		for (Device device : devices) 
		{
            if (device.getName().equals(deviceName)) 
            {
                device.turnOn();
                return;
            }
        }
        System.out.println("Device not found: " + deviceName);
    }

    public void turnOffDevice(String deviceName) 
    {
        //Device[] devices = null;
		for (Device device : devices) 
		{
            if (device.getName().equals(deviceName)) 
            {
                device.turnOff();
                return;
            }
        }
        System.out.println("Device not found: " + deviceName);
    }
    
    public static Room[] values(ArrayList<Room> roomList)
    {
        Room[] rooms = new Room[roomList.size()];
        for (int i = 0; i < roomList.size(); i++) 
        {
            rooms[i] = roomList.get(i);
        }
        return rooms;
    }

    public void displayStatus() 
    {
        System.out.println("Room Number: " + roomNo);
        System.out.println("Room Type: " + roomType);
        System.out.println("Devices in Room:");
        
		for (Device device : devices) 
		{
            System.out.println("Device Name: " + device.getName());
            System.out.println("Device Status: " + (device.deviceOn() ? "On" : "Off"));
            System.out.println("Total Time In Current State: " + device.getTotalTimeInCurrentState() + " ms"  );//mili sec
        }
    }

    
	
}
