package br.com.tdd;

public class Dollar extends Money{

    public Dollar() {
    }

    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }
}