/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan2;

/**
 *
 * @author ASUS
 */
public class ClassB extends ClassA {
    protected int z;

    public void setZ(int Z){
        this.z = z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai Z: " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: " + (x + y + z));
    }
}