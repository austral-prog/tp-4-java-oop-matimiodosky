package com.template;

public class Elevator {

    private int minFloor;
    private int maxFloor;
    private int maxCapacity;
    private int currentFloor;
    private int passengerCount;



    public Elevator(int minFloor, int maxFloor, int maxCapacity) {
        // Initialize elevator with minFloor, maxFloor and maxCapacity
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxCapacity = maxCapacity;
        this.currentFloor = 0;
        this.passengerCount = 0;
    }

    public void moveToFloor(int floor) {
        // Move elevator to the floor if it is within the minFloor and maxFloor
        if(floor >= minFloor && floor <= maxFloor){
            this.currentFloor = floor;
        }
    }

    public void addPassenger(){
        // Add a passenger to the elevator if the elevator is not full
        if(this.passengerCount < this.maxCapacity){
            this.passengerCount++;
        }
    }

    public void removePassenger(){
        // Remove a passenger from the elevator if the elevator is not empty
        if(this.passengerCount > 0){
            this.passengerCount--;
        }
    }

    public int getCurrentFloor(){
        // Return the current floor of the elevator
        return this.currentFloor;
    }

    public int getPassengerCount(){
        // Return the number of passengers in the elevator
        return this.passengerCount;
    }



}
