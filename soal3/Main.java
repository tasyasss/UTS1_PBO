/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal3;

/**
 *
 * @author tasya
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            UserProfile[] dataUser = {
                new UserProfile(12301, "user111", "Natha", 20, "custnatha@gmail.com", "ktp.jpeg"),
                new UserProfile(12302, "user222", "Kina", 22, "custkina@gmail.com")
            };
            
            Admin[] dataAdmin = {
                new Admin(111, "admin111", "Bray", 20, "adminbray@gmail.com"),
                new Admin(222, "admin222", "Uzan", 22, "adminuzan@gmail.com")
            };
            
            boolean inMenu = true;
            int menu;
            do {
                System.out.println("------ Beranda Menu ------");
                System.out.println("1. Login Customer");
                System.out.println("2. Login Admin");
                System.out.println("3. Recovery Password");
                System.out.println("4. Exit Menu");
                System.out.print("Pilih menu: ");
                menu = sc.nextInt(); sc.nextLine();
                System.out.println();
                
                switch (menu) {
                    case 1:         // milik cust
                        boolean loginCust = false;
                        System.out.println("------ Login Customer ------");
                        System.out.print("Masukkan UserId: ");
                        int custId = sc.nextInt(); sc.nextLine();
                        System.out.print("Masukkan Password: ");
                        String custPass = sc.nextLine();
                        
                        boolean loginBerhasil = false;
                        
                        for (UserProfile user : dataUser) {
                            if (custId == user.getUserId() && custPass.equals(user.getPassword())) {
                                System.out.println("Login berhasil, Selamat datang " + user.getName() + "\n");
                                loginBerhasil = true;
                                
                                boolean inCustomerMenu = true;
                                int menuCust;
                                do {
                                    System.out.println("------ Menu Customer ------");
                                    System.out.println("1. Lihat Profil");
                                    System.out.println("2. Edit Profil");
                                    System.out.println("3. Input Dokumen");
                                    System.out.println("4. Kirim Keluhan");
                                    System.out.println("5. Kembali ke Beranda");
                                    System.out.print("Pilih Menu : ");
                                    menuCust = sc.nextInt(); sc.nextLine();
                                    System.out.println();

                                    switch (menuCust) {
                                        case 1:
                                            System.out.println("------ Profil Anda ------");
                                            System.out.println(user.getInfo());
                                            break;
                                        case 2:
                                            System.out.println("------ Edit Profil Anda ------");
                                            int inputId; String inputPass; String inputName; int inputAge; String inputEmail; String inputDoc;
                                            
                                            System.out.print("UserID: " );
                                            inputId = sc.nextInt(); sc.nextLine();
                                            System.out.print("Pass  : " );
                                            inputPass = sc.nextLine();
                                            System.out.print("Name  : " );
                                            inputName = sc.nextLine();
                                            System.out.print("Age   : " );
                                            inputAge = sc.nextInt(); sc.nextLine();
                                            System.out.print("Email : " );
                                            inputEmail = sc.nextLine();
                                            user.editProfile(inputId, inputPass, inputName, inputAge, inputEmail);
                                            break;
                                        case 3:
                                            System.out.println("------ Edit Dokumen ------");
                                            System.out.print("Dokumen Baru: ");
                                            inputDoc = sc.nextLine(); 
                                            user.setDoc(inputDoc);
                                            break;
                                        case 4:
                                            System.out.println("------ Kirim Keluhan ------");
                                            System.out.print("Keluhan: ");
                                            String keluhan = sc.nextLine();
                                            user.keluhan(keluhan);
                                        break;
                                        case 5:
                                            inCustomerMenu = false; 
                                            break;
                                        default:
                                            System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
                                        }
                                    } while (inCustomerMenu); 
                              }
                        }
                        
                        if (!loginBerhasil) {
                            System.out.println("UserId atau Password salah.\n");
                            break;
                        }
                        break;
                        
                    case 2:         // milik admin
                        boolean loginAdmin = false;
                        System.out.println("------ Login Admin ------");
                        System.out.print("Masukkan UserId: ");
                        int adminId = sc.nextInt(); sc.nextLine();
                        System.out.print("Masukkan Password: ");
                        String adminPass = sc.nextLine();
                        
                        boolean loginSukses = false;
                        
                        for (Admin admin : dataAdmin) {
                            if (adminId == admin.getUserId() && adminPass.equals(admin.getPassword())) {
                                System.out.println("Login berhasil, Selamat datang " + admin.getName() + "\n");
                                loginSukses = true;
                                
                                boolean inAdminMenu = true;
                                int menuAdmin;
                                do {
                                    System.out.println("------ Menu Admin ------");
                                    System.out.println("1. Tambah Data Kendaraan");
                                    System.out.println("2. Edit Data Kendaraan");
                                    System.out.println("3. Tangani Komplain");
                                    System.out.println("4. Verifikasi User");
                                    System.out.println("5. Kembali ke Beranda");
                                    System.out.print("Pilih Menu : ");
                                    menuAdmin = sc.nextInt(); sc.nextLine();
                                    System.out.println();

                                    switch (menuAdmin) {
                                        case 1:
                                            System.out.println("------ Tambah Data Kendaraan ------");
                                            int inputIdKendaraan; String inputMerk; String inputTipe;
                                            
                                            System.out.print("ID Kendaraan: ");
                                            inputIdKendaraan = sc.nextInt(); sc.nextLine();
                                            System.out.print("Merk        : ");
                                            inputMerk = sc.nextLine();
                                            System.out.print("Tipe        : ");
                                            inputTipe = sc.nextLine();
                                            
                                            admin.addVehicle(inputIdKendaraan, inputMerk, inputTipe);
                                            break;
                                        case 2:
                                            System.out.println("------ Edit Data Kendaraan ------");
                                             int editIdKendaraan; String editMerk; String editTipe;

                                            System.out.print("ID Kendaraan: ");
                                            editIdKendaraan = sc.nextInt(); sc.nextLine();
                                            System.out.print("Merk Baru   : ");
                                            editMerk = sc.nextLine();
                                            System.out.print("Tipe Baru   : ");
                                            editTipe = sc.nextLine();
                                            
                                            admin.updateVehicleDetails(editIdKendaraan, editMerk, editTipe);
                                            break;
                                        case 3:
                                            System.out.println("------ Tangani Komplain ------");
                                            admin.retrieveComplaint();
                                            break;
                                        case 4:
                                            System.out.println("------ Verifikasi User ------");
                                            
                                            System.out.print("Input UserId: ");
                                            int inputId = sc.nextInt(); sc.nextLine();                                           
                                            boolean userDitemukan = false;

                                            for (UserProfile user : dataUser) {
                                                if (user.getUserId() == inputId) {
                                                    admin.verifyUser(user);
                                                    userDitemukan = true;
                                                    break;
                                                }
                                            }

                                            if (!userDitemukan) {
                                                System.out.println("User dengan ID tersebut tidak ditemukan.");
                                            }
                                            break;
                                        case 5:
                                            inAdminMenu = false; 
                                            admin.log_out();
                                            break;
                                        default:
                                            System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
                                        }
                                    } while (inAdminMenu); 
                              }
                        }
                        
                        if (!loginSukses) {
                            System.out.println("UserId atau Password salah.\n");
                            break;
                        }
                        break;
                    case 3:
                        System.out.println("------ Recovery Password ------");
                        System.out.print("Email: ");
                        String recoveryEmail = sc.nextLine(); 
                            boolean foundUser = false;

                            for (UserProfile user : dataUser) {
                                if (user.getEmail().equalsIgnoreCase(recoveryEmail)) {
                                    System.out.print("Masukkan Password Baru: ");
                                    String newPassword = sc.nextLine();
                                    user.setPassword(newPassword);
                                    System.out.println("Password berhasil diganti untuk customer " + user.getName() + "\n");
                                    foundUser = true;
                                    break;
                                }
                            }

                            if (!foundUser) {
                                for (Admin admin : dataAdmin) {
                                    if (admin.getEmail().equalsIgnoreCase(recoveryEmail)) {
                                        System.out.print("Masukkan Password Baru: ");
                                        String newPassword = sc.nextLine();
                                        admin.setPassword(newPassword);
                                        System.out.println("Password berhasil diganti untuk admin " + admin.getName() + "\n");
                                        foundUser = true;
                                        break;
                                    }
                                }
                            }

                            if (!foundUser) {
                                System.out.println("Email tidak ditemukan. Silakan coba lagi.\n");
                            }
                            break;
                    case 4:
                        inMenu = false; 
                        break;
                     default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");               
                }
        } while (inMenu);
    }
}
