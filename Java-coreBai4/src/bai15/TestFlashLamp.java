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
public class TestFlashLamp {

    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flash = new FlashLamp();
        flash.setBattery(battery);
        System.out.println("energy: " + flash.getBatteryInfo());
        System.out.println("status: " + flash.isStatus());

        //bat tat den 10 lan
        boolean status = false;
        for (int i = 0; i < 10; i++) {
            status = !status;
            flash.setStatus(status);
            if (flash.isStatus()) {
                flash.turnOn();
                flash.getBattery().decreaseEnergy();
            }else {
                flash.turnOff();
            }
        }

        System.out.println("muc nang luong hien tai: " + flash.getBattery().getEnergy());

    }
}
