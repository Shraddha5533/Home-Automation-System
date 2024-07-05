package com.electronic;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        House h = new House(0);
        int ch = 0;

        while (ch != 8) {
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("|         |               Home Automation Menu                         |");
            System.out.println("|---------|-------------------------------------------------------------------|");
            System.out.println("|  1.     |           Add Room                                                |");
            System.out.println("|  2.     |           Add Device to Room                                      |");
            System.out.println("|  3.     |           Turn On Device in Room                                  |");
            System.out.println("|  4.     |           Turn Off Device in Room                                 |");
            System.out.println("|  5.     |           Display House Status                                    |");
            System.out.println("|  6.     |           Display Room Status                                     |");
            System.out.println("|  7.     |           List Total Time for Devices                             |");
            System.out.println("|  8.     |           Exit                                                    |");
            System.out.println("+---------|-------------------------------------------------------------------+");
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println("Enter Room Name:-");
                    String roomName = sc.next();
                    h.addRoom(roomName);
                    System.out.println("Room added Successfully");
                }
                break;

                case 2: {
                
                    System.out.print("Enter Room Name: ");
                    String roomName = sc.next();

                    Room room = h.getRoom(roomName);

                    try {
						if (room != null) {
						    System.out.println("Select Device Type:");
						    System.out.println("1. Television");
						    System.out.println("2. Air Conditioner");
						    System.out.println("3. Light");
						    System.out.println("4. Showers");
						    System.out.print("Enter Device Type (1-4): ");
						    int deviceType = sc.nextInt();

						    Device device = null;
						    switch (deviceType) {
						        case 1:
						            device = new Television();
						            break;
						        case 2:
						            device = new AirConditioners();
						            break;
						        case 3:
						            device = new Light();
						            break;
						        case 4:
						            device = new Showers();
						            break;
						        default:
						            System.out.println("Invalid device type.");
						            break;
						    }

						    System.out.println(device);
						    if (device != null) {
						        System.out.print("Enter Device Name: ");
						        String deviceName = sc.next();
						        device.setName(deviceName);

						        // Check if device is not null before adding it to the room
						        if(device != null) 
						        {
						            room.addDevice(device);
						            System.out.println("Device added to room successfully.");
						        }
						    }
						} else 
						{
						   System.out.println("Room not found.");
               }
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                    break;
                
              

                case 3: {
                    System.out.print("Enter Room Name: ");
                    String roomToTurnOn = sc.next();
                    System.out.print("Enter Device Name: ");
                    String deviceToTurnOn = sc.next();
                    Room roomToTurnOnObj = h.getRoom(roomToTurnOn);

                    System.out.println(roomToTurnOn +": Room Name");
                    if (roomToTurnOnObj != null) {
                        roomToTurnOnObj.turnOnDevice(deviceToTurnOn);
                        System.out.println("Device turned on successfully.");
                    } else {
                        System.out.println("Room not found.");
                    }
                }
                break;

                case 4: {
                    System.out.print("Enter Room Name: ");
                    String roomToTurnOff = sc.next();
                    System.out.print("Enter Device Name: ");
                    String deviceToTurnOff = sc.next();
                    Room roomToTurnOffObj = h.getRoom(roomToTurnOff);

                    if (roomToTurnOffObj != null) {
                        roomToTurnOffObj.turnOffDevice(deviceToTurnOff);
                        System.out.println("Device turned off successfully.");
                    } else {
                        System.out.println("Room not found.");
                    }
                }
                break;

                case 5: {
                    h.displayStatus();
                }
                break;

                case 6: {
                    System.out.print("Enter Room Name: ");
                    String roomToDisplayStatus = sc.next();
                    Room roomToDisplayStatusObj = h.getRoom(roomToDisplayStatus);

                    if (roomToDisplayStatusObj != null) {
                        roomToDisplayStatusObj.displayStatus();
                    } else {
                        System.out.println("Room not found.");
                    }
                }
                break;

                case 7: {
                    for (Room room : h.getRm()) {
                        System.out.println("Room Number: " + room.getRoomNo());
                        System.out.println("Room Type: " + room.getRoomType());
                        System.out.println("Devices in Room:");

                        for (Device device : room.getDevice()) {
                            long totalTime = device.getTotalTimeInCurrentState();

                            System.out.println("Device Name: " + device.getName());
                            System.out.println("Device Status: " + (device.deviceStatus() ? "On" : "Off"));
                            System.out.println("Total Time In Current State: " + totalTime + " ms");
                        }
                    }
                }
                break;

                case 8: {
                    System.out.println("Exiting Home Automation App.");
                }
                break;
            }
        }
        sc.close();
    }
}
