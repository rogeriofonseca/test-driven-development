package br.com.tdd;

public class Dollar extends Money{

    public Dollar() {
    }

    public Dollar(int amount) {
        super(amount);
    }

    Money times(int multiplier){
        return new Dollar(amount * multiplier);
    }
}
