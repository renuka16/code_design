/*
 * Copyright (C) June 3rd 2021
 * All rights reserved
 * Renuka.
 */

package com.company;

public abstract class Vehicle {
    private String vehicle_name;
    private String start_time;

    public Vehicle(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

  // make all these classes abstract
    public boolean check_availability(){
        return false;
    }

    public void check_next_available_time(){

    }

    public double calculate_price(){
        return 1;
    }

    public void free_the_slot(){

    }




}
