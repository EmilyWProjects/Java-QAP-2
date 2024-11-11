public class Person {

    private String lastName;
    private String firstName;
    private Address home;

    public Person(String firstName, String lastName, Address home) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
        
    }

    public String toString() {

        return lastName + " " + firstName + ", " + home;

    }
    
}
