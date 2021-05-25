package com.ucreativa.familia;

public class Jorge {

     private int edad;
     private String hobby;

     public Jorge(String sSaludar){
         this.edad= 58;
         System.out.print(sSaludar);
     }
     public int  getAge(){

         return this.edad;

     }
    public void SetAge(){
        this.edad=this.edad++;
    }
}
