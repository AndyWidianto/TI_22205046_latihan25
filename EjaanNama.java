/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo.ejaannama;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class EjaanNama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nama anda :");
        String nama = sc.next();
        System.out.println("Ejaan nama \""+nama+"\" adalah:");
        for(int i=0;i<nama.length();i++){
        char x = nama.charAt(i);
            System.out.println("Huruf ke "+(i)+" :"+x);
        }
    }
    }
