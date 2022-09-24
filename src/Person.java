public class Person {
    private String name;
    private String surname;
    private int numberOfTickets;


    public Person(String name, String surname, int numberOfTickets)
    {this.name = name;
        this.surname = surname;
        this.numberOfTickets = numberOfTickets;}

public String getName(){return name;}
    public String getSurname() {return surname;}
    public int getNumberOfTickets() {return numberOfTickets;}

    public void changeNumberOfTickets() {numberOfTickets--;}

}
