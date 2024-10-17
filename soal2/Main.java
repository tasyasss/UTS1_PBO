/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author tasya
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan m1 = new Kendaraan();
        m1.merk = "Honda";
        m1.warnaBody = "Hitam";
        m1.ccMesin = 150;
        
        System.out.println("Memanggil method info dari Class Kendaraan");
        m1.getKendaraan();
        System.out.println();
        
        Motor m2 = new Motor();
        m2.maxBensin = 8.0;
        
        System.out.println("Memanggil method info dari Class Motor");
        m2.getMotor();
        System.out.println();
        
        MotorManual m3 = new MotorManual();
        m3.gear = "Netral";
        m3.headlamp = false;
        
        System.out.println("Memanggil method info dari Class MotorManual");
        m3.getMotorManual();
        System.out.println();

        m3.mesinHidup();    // method Kendaraan
        m3.headlampOn();    // method MotorManual
        m3.klakson();   // method Kendaraan
        m3.gantiGear("1");  // method MotorManual
        m3.headlampOff();   // method MotorManual
        m3.mesinMati();     // method Kendaraan
        m3.isiBensin(5.5);    // method Motor
        m3.isiBensin(3.0);    // method Motor
        System.out.println();
        
        System.out.println("Memanggil method info dari Class MotorManual");
        m3.getMotorManual();
    }
}
