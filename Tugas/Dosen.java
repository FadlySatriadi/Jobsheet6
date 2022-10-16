/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;
    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int sks){
        this.jumlahSKS = sks;
    }
    public int getGaji(){
        return jumlahSKS * super.getGaji();
    }
}