package br.com.tdd;

public class Dollar extends Money{

    public Dollar() {
    }
    
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipler) {
        return new Dollar(amount * multipler);
    }
}
