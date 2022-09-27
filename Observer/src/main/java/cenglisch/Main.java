package cenglisch;

public class Main {
    public void main(String[] args){
        Customer customer = new Customer("Nerd 1");

        Subject subject1 = new NewGamingPC("ASUS");
        Subject subject2 = new NewXBOX("XBOX ONE");
        Subject subject3 = new NewPS("PS5");

        customer.aufWunschliste(subject1);
        customer.aufWunschliste(subject2);
        customer.aufWunschliste(subject3);

        Customer customer2 = new Customer("Nerd 2");
        customer2.aufWunschliste(subject2);`
    }
}
