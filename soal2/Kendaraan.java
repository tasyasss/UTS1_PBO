/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;

/**
 *
 * @author tasya
 */
class Kendaraan {
    protected static String merk;
    protected static String warnaBody;
    protected static int ccMesin;

    public Kendaraan() {
        // default constr.
    }
    
    public Kendaraan(String merk, String warnaBody, int ccMesin) {
        this.merk = merk;
        this.warnaBody = warnaBody;
        this.ccMesin = ccMesin;
    }
    
    public void mesinHidup() {
        System.out.println("Mesin kendaraan hidup.");
    }

    public void mesinMati() {
        System.out.println("Mesin kendaraan mati.");
    }

    public void klakson() {
        System.out.println("Klakson berbunyi!");
    }
    
    public void getKendaraan() {
        System.out.println("Merk: " + this.merk);
        System.out.println("Warna Body: " + this.warnaBody);
        System.out.println("CC Mesin: " + this.ccMesin);
    }
}
