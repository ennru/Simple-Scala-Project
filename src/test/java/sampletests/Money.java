package sampletests;

public class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        fAmount= amount;
        fCurrency= currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }
    
    public Money add(Money m) {
        return new Money(amount()+m.amount(), currency());
    }

    @Override
    public boolean equals(Object other) {
	if (this == other) return true;
	if (other instanceof Money) {
	    Money that = (Money) other;
	    return this.fAmount == that.fAmount && 
		this.fCurrency == that.fCurrency;
	}
	return false;
    }

}
