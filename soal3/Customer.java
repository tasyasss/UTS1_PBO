/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author tasya
 */
public class Customer extends User {
    public Customer(int userId, String password, String name, 
            int age, String email) {
        super(userId, password, 
                name, age, email);
    }
    
    private boolean verifStatus = false;
    
    public boolean getVerifStatus() {
        return verifStatus;
    }
    
    public void applyVerification(String docs) {
        if (docs.endsWith(".jpg") || docs.endsWith(".png") || docs.endsWith(".png")) {
            System.out.println("Berhasil di verifikasi\n");
        } else {
            System.out.println("Gagal di verifikasi\n");
        }
    }   
}
