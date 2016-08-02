package br.com.tdd;

public class Dollar {

    int amount;

    public Dollar() {
    }
    
    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multipler) {
        return new Dollar(amount * multipler);
    }
    
    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}
