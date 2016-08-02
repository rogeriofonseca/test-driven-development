package br.com.tdd;

public class Dollar {

    int amount;

    public Dollar() {
    }
    
    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multipler) {
        amount *= multipler;
    }
}
