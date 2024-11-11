public class CreditCardDemo {

    public static void main(String[] args){
        //Values
        final Money limit = new Money (2000, 0);
        final Money amount1 = new Money(300, 0);
        final Money amount2 = new Money(20, 0);
        final Money amount3 = new Money(30, 0);
        final Money amount4 = new Money(1000, 0);
    
        //Declare card and holder
        Person owner = new Person("Petunia", "Flowers", new Address("1st Street", "Townsville", "NL", "A7A 7R7"));
        CreditCard visa = new CreditCard(owner, limit);
    
        //Tests
        System.out.println(visa.getPersonals());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit limit: " + visa.getCreditLimit());
        System.out.println();

        System.out.println("Charged: " + amount1);
        visa.charge(amount1);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Charged: " + amount2);
        visa.charge(amount2);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Charged: " + amount3);
        visa.payment(amount3);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("Charged: " + amount4);
        visa.charge(amount4);
        System.out.println("Balance: " + visa.getBalance());
    }
    
}
