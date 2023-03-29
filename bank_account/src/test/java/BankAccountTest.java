import org.example.BankAccount;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void firstName() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        String actual = bankAccount.getLastName();
        String expected = "Jones";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void lastName() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        String actual = bankAccount.getLastName();
        String expected = "Jones";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void dateOfBirth() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        String actual = bankAccount.getDateOfBirth();
        String expected = "14/02/1999";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void accountNumber() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        int actual = bankAccount.getAccountNumber();
        int expected =  2563637;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void balance() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        int actual = bankAccount.getBalance();
        int expected = 744;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        int actual = bankAccount.deposit(50);
        int expected = 794;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdraw() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        int actual = bankAccount.withdraw(50);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void interest() {
        BankAccount bankAccount = new BankAccount("Davida", "Jones",
                "14/02/1999", 2563637, 744, "Savings");
        int actual = bankAccount.payInterest(20);
        int expected = 90;
    }

}