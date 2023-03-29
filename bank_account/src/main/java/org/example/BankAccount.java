package org.example;

public class BankAccount {
    //   Variables for each property

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int accountNumber;
    private int balance;
    private String accountType;


//    Constructor

    public BankAccount (String inputFirstName, String inputLastName,
                        String inputDateOfBirth, int inputAccount,
                        int inputBalance, String inputAccountType) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = inputAccount;
        this.balance = inputBalance;
        this.accountType = inputAccountType;

    }

    //    Getters and Setters
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }
    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getAccountType() {
        return this.accountType;
    }


    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }

//    Making depositing

    public int deposit(int depositNum) {
        return balance + depositNum;
    }

    //    Withdrawing
    public int withdraw(int withdrawNum) {
        return balance - withdrawNum;
    }

//    Paying Interest

    public int payInterest(int interestNum) {
        return balance * (balance - (interestNum/100));
    }

}