package br.com.tdd;

public abstract class Money {
    
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

    abstract Money times(int multipler);
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
   }

    static Money dollar(int amount){
        return new Dollar(amount, "USD");
    }
    
    static Money franc(int amount){
        return new Franc(amount, "CHF");
    }
}
