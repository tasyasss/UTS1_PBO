/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author tasya
 */
class Motor extends Kendaraan {
    protected static double bensin = 0;
    protected static double maxBensin = 0.0;
    
    public Motor() {
        super();
    }
    
    public Motor(double bensin, double maxBensin) {
        super(merk, warnaBody, ccMesin);
        this.bensin = bensin;
        this.maxBensin = maxBensin;
    }

    public void isiBensin(double isiBensin) {
        if (bensin + isiBensin <= maxBensin) {
            bensin += isiBensin;
            System.out.println("Isi bensin " + isiBensin + " liter. Terisi!");
        } else {
            System.out.println("Tidak bisa mengisi bensin " + isiBensin + " liter. Melebihi kapasitas!");
        }
    }
    
    public void getMotor() {
        getKendaraan();
        System.out.println("Bensin Terisi: " + this.bensin + " liter");
        System.out.println("Max Bensin: " + this.maxBensin + " liter");
    }
}
