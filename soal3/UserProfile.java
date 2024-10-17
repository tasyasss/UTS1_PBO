/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author tasya
 */


public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String email;
    private String doc;
    private String keluhan;
    
    
    public UserProfile(int inputId, String inputPass, String inputName, 
            int inputAge, String inputEmail, String inputDoc) {
        this.userId = inputId;
        this.password = inputPass;
        this.name = inputName;
        this.age = inputAge;
        this.email = inputEmail;
        this.doc = inputDoc;
    }
    
    public UserProfile(int inputId, String inputPass, String inputName, 
            int inputAge, String inputEmail) {
        this.userId = inputId;
        this.password = inputPass;
        this.name = inputName;
        this.age = inputAge;
        this.email = inputEmail;
    }
    
    public String getInfo(){
        String info = "";
        info += "User ID        : " + userId + "\n";
        info += "Password       : " + password + "\n";
        info += "Name           : " + name + "\n";
        info += "Age            : " + age + "\n";
        info += "Email ID       : " + email + "\n";
        info += "Dokumen        : " + doc + "\n";
        return info;
    }
    
    public int getUserId() {
        return this.userId;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String inputPass) {
        this.password = inputPass;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void editProfile(int inputId, String inputPass, String inputName, 
            int inputAge, String inputEmail) {
        this.userId = inputId;
        this.password = inputPass;
        this.name = inputName;
        this.age = inputAge;
        this.email = inputEmail;
        System.out.println("Profil berhasil diupdate.\n");
    }
    
    public void setDoc(String inputDoc) {
        this.doc = inputDoc;
        System.out.println("Dokumen telah terinput: " + doc + "\n");
    }
    
    public String getDoc() {
        return this.doc;
    }
    
    public void show_documents() {
        System.out.println("Menampilkan dokumen: \n" + doc + "\n");
    }
    
    public void keluhan(String inputKeluhan){
        System.out.println("Keluhan Anda diterima.\n");
    }
}
