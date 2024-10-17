/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author tasya
 */
public class User extends UserProfile{
    public User(int userId, String password, String name, 
            int age, String email) {
        super(userId, password, 
                name, age, email);
    }
    
    public boolean log_in(int inputUser, int inputPass) {
        if (getUserId() == inputUser && getPassword().equals(inputPass)) {
            System.out.println("Berhasil login");
            return true;
        } else {
            System.out.println("Username atau Password salah");
            return false;
        }
    }
    
    public void recovery_password(String email, String inputPass) {
        if (getEmail() == email) {
            setPassword(inputPass);
            System.out.println("Password berhasil diganti");
        } else {
            System.out.println("Masukkan email dengan benar.");
        }
    }
    
    public void log_out() {
        System.out.println("Berhasil logout\n");
    }
}
