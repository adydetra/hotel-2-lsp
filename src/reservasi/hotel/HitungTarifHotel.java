/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasi.hotel;

/**
 *
 * @author Dewa
 */
public class HitungTarifHotel extends Hotel {

    //Tipe Data
    private int tarif;
    private String kamar;

    //Pengkondisian menggunakan if else untuk menentukan harga yang dipilih
    public int get_harga(){
        if(type == 1){
            tarif = 250000;
        } else if (type == 2) {
            tarif = 500000;
        } else if (type == 3) {
            tarif = 750000;
        } else {

        }

        //Int Tarif
        return tarif;
    }
    
    //Pengkondisian menggunakan if else untuk menentukan jenis paket yang dipilih
    public String get_kamar(){
        if(type == 1){
            kamar = "Deluxe";
        } else if (type == 2) {
            kamar = "Premium";
        } else if (type == 3) {
            kamar = "Superior";
        } else{

        }
        
        //Stirng Kamar
        return kamar;
    }
    
    //Penjumlahan tarif * waktu
    public int get_total(){
        return tarif*waktu;
    }

}