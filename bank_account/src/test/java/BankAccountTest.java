import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount = new BankAccount("Davida", "Jones",
            "14/02/1999", 2563637, 744, "Savings");
    @Test
    public void firstName() {

        String actual = bankAccount.getFirstName();
        String expected = "Davida";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void lastName() {
        String actual = bankAccount.getLastName();
        String expected = "Jones";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void dateOfBirth() {
        String actual = bankAccount.getDateOfBirth();
        String expected = "14/02/1999";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void accountNumber() {
        int actual = bankAccount.getAccountNumber();
        int expected =  2563637;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void balance() {
        int actual = bankAccount.getBalance();
        int expected = 744;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deposit() {
        int actual = bankAccount.deposit(50);
        int expected = 794;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdraw() {
        int actual = bankAccount.withdraw(50);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void interest() {
        int actual = bankAccount.payInterest(20);
        int expected = 90;
    }

}