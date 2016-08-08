package br.com.tdd;

public class Franc extends Money{

   Franc(int amout){
       this.amount = amount;
   }
   
   Franc times(int multiplier){
       return new Franc(amount * multiplier);
   }
}
