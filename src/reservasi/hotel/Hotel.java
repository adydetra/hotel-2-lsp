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
public class Hotel {
    
    //Tipe Data
    protected String name;
    protected int type, waktu;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void SetType(int type) {
        this.type = type;
    }

    public int getWaktu(){
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

}