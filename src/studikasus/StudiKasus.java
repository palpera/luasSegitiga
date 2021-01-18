/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class StudiKasus {
    //Deklarasi
    double a, t, hasil;
    
    //(void) Inputan User
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga  : ");
        t = input.nextDouble();
        System.out.print("Masukkan alas segitiga    : ");
        a = input.nextDouble();
    }    
    //(void) Proses   
    void hitung(){
        hasil = a * t / 2;
    }
    //(non void)
    double hasil(){
        return hasil;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Menghitung Luas Segitiga\n");
        
        StudiKasus Segitiga = new StudiKasus();
        Segitiga.input();
        Segitiga.hitung();
        
        System.out.println("\nLuas : "+Segitiga.hasil());
        
    }
    
}