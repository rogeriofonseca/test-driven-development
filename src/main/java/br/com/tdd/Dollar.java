package br.com.tdd;

public class Dollar extends Money{

    public Dollar() {
    }

    public Dollar(int amount, String currency) {
        super(amount,currency);
    }

    Money times(int multiplier){
        return new Dollar(amount * multiplier, currency);
    }
}