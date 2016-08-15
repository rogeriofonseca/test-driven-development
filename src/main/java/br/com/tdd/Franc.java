package br.com.tdd;

public class Franc extends Money{
    
    public Franc() {
    }

    public Franc(int amount, String currency) {
        super(amount,currency);
    }

    Money times(int multiplier){
        return Money.franc(amount * multiplier);
    }
}
