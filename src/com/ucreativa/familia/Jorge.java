package com.ucreativa.familia;

public class Jorge {

     private int edad;
     private String hobby;

     public Jorge(String saludar, int edad, String hobby){
         this.edad= 58;
         System.out.print(saludar + edad + hobby);
     }
     public int  getAge(){

         return this.edad;

     }
    public void SetAge(){
        this.edad=this.edad++;
    }
}
