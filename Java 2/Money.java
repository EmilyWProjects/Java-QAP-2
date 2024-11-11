public class Money {
    
    private int dollars;
    private int cents;


    public Money(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(Money other){
        this.dollars = other.dollars; 
        this.cents = other.cents;
    }

    public void add(Money amount){
        this.cents += amount.cents;
        this.dollars += amount.dollars + (this.cents / 100);
        this.cents = this.cents % 100;
    }


    public void subtract(Money amount){
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = amount.dollars * 100 + amount.cents;
        int difference = totalCents1 - totalCents2;
        this.dollars = difference / 100;
        this.cents = difference % 100;
    }


    public int compareTo(Money other){
        int thisTotalCents = this.dollars * 100 + this.cents;
        int otherTotalCents = other.dollars * 100 + other.cents;
        return thisTotalCents - otherTotalCents;
    }


    public boolean equals(Money other){
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString(){
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }
    

}
