/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author tasya
 */
public class Admin extends User{
    public Admin(int userId, String password, String name, 
            int age, String email) {
        super(userId, password, name, age, email);
        this.profile = new UserProfile(userId, password, name, age, email);
    }
    
    UserProfile profile;
    Customer cust;
    
    private int kendaraanId;
    private String merk;
    private String tipe;
    
    public void setKendaraanId(int inputId){
        this.kendaraanId = inputId;
    }
    
    public int getKendaraanId() {
        return this.kendaraanId;
    }
    
    public void setMerk(String inputMerk){
        this.merk = inputMerk;
    }
    
    public String getMerk() {
        return this.merk;
    }
    
    public void setTipe(String inputTipe){
        this.tipe = inputTipe;
    }
    
    public String getTipe() {
        return this.tipe;
    }
    
    public void updateVehicleDetails(int inputId, String inputMerk, String inputTipe) {
        this.setKendaraanId(inputId);
        this.setMerk(inputMerk);
        this.setTipe(inputTipe);
        System.out.println("Data Kendaraan diperbarui\n");
    }
            
    public void addVehicle(int inputId, String inputMerk, String inputTipe) {
        this.setKendaraanId(inputId);
        this.setMerk(inputMerk);
        this.setTipe(inputTipe);
        System.out.println("Data Kendaraan berhasil ditambahkan\n");
    }
    
    public void retrieveComplaint() {
        System.out.println("Komplain customer berhasil ditangani\n");
    }
    
    public void verifyUser(UserProfile user) {
        if (user != null) {
            System.out.println("User dengan ID " + user.getUserId() + " berhasil diverifikasi.\n");
        } else {
            System.out.println("User tidak ditemukan.\n");
        }
    }
}
