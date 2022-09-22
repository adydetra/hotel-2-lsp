/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasi.hotel;

import java.util.Scanner;
/**
 *
 * @author Dewa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    // Membuat variable yang dibutuhkan
    static String name;
    static int type, waktu;
    
    // Instant Objek Hotel
    static HitungTarifHotel hotel = new HitungTarifHotel();
    
    // Membuat Method
    static void register(){
        System.out.println("===== Booking Hotel =====");
        Scanner nama = new Scanner(System.in); // Membuat object scanner
        System.out.print("Masukkan Nama: ");
        name = nama.next();// Mengambil input dari inputan user
        hotel.setName(name);
    }
    
    static void pilihKamar(){
        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Deluxe Room Rp. 250000");
        System.out.println("2. Premium Room Rp. 500000");
        System.out.println("3. Superior Room Rp. 750000");
        
        Scanner pilih = new Scanner(System.in);
        System.out.println("\nJenis Kamar Yang Dipilih: ");
        type = pilih.nextInt();
        hotel.SetType(type);
    } 
    
    static void waktu(){
        Scanner lama = new Scanner(System.in);
        System.out.println("\nUntuk Berapa Lama: ");
        waktu = lama.nextInt();
        hotel.setWaktu(waktu);
    }
    
    static void result(){
        System.out.println("===== Pembayaran =====");
        System.out.println("Nama Pelanggan : " + hotel.getName());
        System.out.println("Jenis Kamar : " + hotel.get_kamar());
        System.out.println("Tarif Penginapan : " + hotel.get_harga());
        System.out.println("Total Pembayaran : " + hotel.get_total());
    }
    
    static void pengulangan(){
        Scanner input = new Scanner(System.in);
        char pilih;
        
        System.out.println("\nApakah ingin melanjutkan? y/n");
        pilih = input.next().charAt(0);
        
        switch(pilih){
            case 'y':
                alur();
                break;
            case 'n':
                System.out.println("Program Selesai");
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan Tidak Ada!");
                System.exit(0);
        }
    }
    
    static void alur(){
        register();
        pilihKamar();
        waktu();
        result();
        pengulangan();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Memanggil Method
        alur();
    }
    
}