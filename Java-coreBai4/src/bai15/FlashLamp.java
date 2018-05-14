/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

/**
 *
 * @author chellong
 */
public class FlashLamp {
    private boolean status; 
    private Battery battery;

    public FlashLamp() {
        this.status = false;
        this.battery = null;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getBatteryInfo() {
        return battery.getEnergy();
    }

  
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }
    
    public void turnOn() {
        System.out.println("den sang");
    }
    
    public void turnOff() {
        System.out.println("den khong sang");
    }
}
