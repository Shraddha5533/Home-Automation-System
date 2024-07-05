package com.electronic;

import java.util.ArrayList;

public class House 
{

    private int houseNo;
    private ArrayList<Room> rm;

    public House(int houseNo) {
        this.houseNo = houseNo;
        this.rm = new ArrayList<>();
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public ArrayList<Room> getRm() {
        return rm;
    }

    public void addRoom(String roomName) 
    {
        rm.add(new Room(houseNo, roomName));
    }

    public Room getRoom(String roomName) 
    {
        for (Room room : rm) 
        {
            if (room.getRoomType().equals(roomName)) 
            {
                return room;
            }
        }
        return null; // Room not found
    }

    public void displayStatus() 
    {
        System.out.println("House Status:");
        for (Room room : rm) 
        {
            room.displayStatus();
        }
    }
}
