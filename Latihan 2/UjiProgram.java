/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class UjiProgram {
    public static void main(String[] args) {
        Line deku = new Line(113, -112, 114, 114);
        Line yagi = new Line (150, -100, 100, 110);
        
        System.out.println("Tinggi badan Deku : "+ deku.getLength());
        System.out.println("Tinggi badan Yagi : "+ yagi.getLength());
        
        if (deku.isGreater(deku, yagi)){
            System.out.println("Tinggi badan Deku lebih tinggi dari Yagi");}
        else if (deku.isLess(deku, yagi)){
            System.out.println("Tinggi badan Deku lebih pendek dari Yagi");}
        else if (deku.isEqual(deku, yagi)){
            System.out.println("Tinggi badan Deku sama panjang dengan Yagi");}
        }
    }
        
   
