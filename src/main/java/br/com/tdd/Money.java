package br.com.tdd;

public class Money {
    
    protected int amount;
    protected String currency;

    public Money(){
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    String currency(){
        return currency;
    }

    Money times(int multipler){
        return new Money(amount * multipler, currency);
    }
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
   }

    static Money dollar(int amount){
        return new Money(amount, "USD");
    }
    
    static Money franc(int amount){
        return new Money(amount, "CHF");
    }
    
    public String toString(){
        return amount + " "+currency;
    }
}
