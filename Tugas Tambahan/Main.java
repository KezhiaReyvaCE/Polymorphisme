/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Main {
     public static void main(String[]args){
         OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
         jumlah.set_A(10.5);
         jumlah.set_B(4.5);
         System.out.println("Hasil penjumlahan: "+jumlah.hasil());
         
         OperasiPengurangan kurang = new OperasiPengurangan();
         kurang.set_A(10.5);
         kurang.set_B(4.5);
         System.out.println("Hasil pengurangan: "+kurang.hasil());
         
         OperasiPerkalian kali = new OperasiPerkalian();
         kali.set_A(10.5);
         kali.set_B(4.5);
         System.out.println("Hasil perkalian: "+kali.hasil());
         
         OperasiPembagian bagi = new OperasiPembagian();
         bagi.set_A(10.5);
         bagi.set_B(4.5);
         System.out.println("Hasil pembagian: "+bagi.hasil());
         
         
     }
}
