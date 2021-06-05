/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class TestRect {
    public static void main(String[]args){
        Rect baru1 = new Rect (1, 1, 4, 4);
        Rect baru2 = new Rect (2, 3, 5, 6);
        
        System.out.println("<2,3> is inside the union");
        System.out.println(baru1+"union"+baru2+" ="+baru1.union(baru2));
        System.out.println(baru1+"intersection"+baru2+" ="+baru1.intersection(baru2));
        
        
         
    }
}
