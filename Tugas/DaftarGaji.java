/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class DaftarGaji {
    public Pegawai[] listPegawai;
    
    DaftarGaji(int jumlah){
        listPegawai = new Pegawai[jumlah];
    };
    public void addPegawai(Pegawai pegawai){
        for(int i = 0; i < listPegawai.length; i++){
            if(listPegawai[i] == null){
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }
    public void printPegawai(){
        int i = 0;
        while(listPegawai[i] != null && i < listPegawai.length){
            System.out.println("\nNIP Pegawai ke-" + (i+1) + ": " + listPegawai[i].nip);
            System.out.println("Nama Pegawai : " + listPegawai[i].getNama());
            System.out.println("Alamat Pegawai : " + listPegawai[i].getAlamat());
            System.out.println("Gaji Pegawai : " + listPegawai[i].getGaji());
            i++;
        }        
    }
}