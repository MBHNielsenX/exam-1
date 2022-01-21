import java.util.ArrayList;

public class Customer {
    private String firstname;
    private String lastname;
    private int balance;

    public Customer(String firstname, String lastname, int balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void checkBalance () {
        if (getBalance() < 0) {
            System.out.println(getFirstname() + " " + getLastname() + "'s balance is negative");
        }
        if (getBalance() == 0) {
            System.out.println(getFirstname() + " " + getLastname() + "'s balance is zero");
        }
        if (getBalance() > 0) {
            System.out.println(getFirstname() + " " + getLastname() + "'s balance is positive");
        }
    }

}
