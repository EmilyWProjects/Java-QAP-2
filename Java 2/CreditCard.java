public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit) {

        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0,0);

    }

    public Money getBalance() {

        return balance;
        
    }

    public Money getCreditLimit() {

        return creditLimit;

    }

    public String getPersonals() {

        return owner.toString();

    }

    public void charge(Money amount){
        Money credit = new Money(getBalance());
        credit.add(amount);
        if (credit.compareTo(getCreditLimit()) == 1) {
            System.out.println("Exceeds credit limit");
        } else {
            balance.add(amount);
        }
    }

    public void payment(Money amount){
        balance.subtract(amount);
    }

}
