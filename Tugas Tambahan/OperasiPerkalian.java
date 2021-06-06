/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
class OperasiPerkalian extends OperasiBilanganAbs{ 
    @Override
    protected void set_A(double a){
    this.a = a; }
    @Override
    protected void set_B(double b){
    this.b = b; }
    @Override
    protected void set_C(){
    this.c = c; }
        
    @Override
    protected double get_A(){
        return this.a;}
    @Override
    protected  double get_B(){
        return this.b;}
    @Override
    protected  double get_C(){
        return this.c;}
    
    @Override
    protected  void tampil(){}
      
    public double hasil(){
          double hasil = (double)(this.a * this.b);
          return hasil;
      }
    }
