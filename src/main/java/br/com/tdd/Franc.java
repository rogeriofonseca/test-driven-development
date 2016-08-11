package br.com.tdd;

public class Franc extends Money{
    
    private String currency;
    
    public Franc() {
    }

    public Franc(int amount) {
        this.amount = amount;
        currency = "CHF";
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
