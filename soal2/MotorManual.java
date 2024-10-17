/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author tasya
 */
class MotorManual extends Motor {
    String gear;
    boolean headlamp;

    public MotorManual() {
        super();
    }
    
    public MotorManual(String gear, boolean headlamp) {
        super(bensin, maxBensin);
        this.gear = gear;
        this.headlamp = headlamp;
    }
    
    public void gantiGear(String gear) {
        this.gear = gear;
        System.out.println("Gear diganti ke: " + gear);
    }

    public boolean headlampOn() {
        if (headlamp == false) {
            System.out.println("Menyalakan headlamp");
            headlamp = true;  // Menyalakan headlamp
        } else {
            System.out.println("Headlamp sudah menyala");
        }
        return headlamp;
    }
    
    public boolean headlampOff() {
        if (headlamp == true) {
            System.out.println("Mematikan headlamp");
            headlamp = false; 
        } else {
            System.out.println("Headlamp tidak menyala");
        }
        return headlamp;  
    }
    
    public void getMotorManual() {
        getMotor();
        System.out.println("Gear saat ini: " + this.gear);
        System.out.println("Headlamp menyala: " + (this.headlamp ? "Ya" : "Tidak"));
    }
}
