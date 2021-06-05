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
        Line deku = new Line(3, -2, 4, 4);
        Line yagi = new Line (8, 3, -4, 8);
        
        System.out.println("Panjang penggaris Deku :"+ deku.getLength());
        System.out.println("Panjang penggaris Yagi :"+ yagi.getLength());
        
        if (deku.isGreater(deku, yagi)){
            System.out.println("Penggaris Deku lebih panjang dari Yagi");}
        else if (deku.isLess(deku, yagi)){
            System.out.println("Penggaris Deku lebih pendek dari Yagi");}
        else if (deku.isEqual(deku, yagi)){
            System.out.println("Penggaris Deku sama panjang dengan Yagi");}
        }
    }
        
   
