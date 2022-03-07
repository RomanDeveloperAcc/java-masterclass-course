package rbd.project;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BankAccountTestParametrized {
    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        account = new BankAccount("Test", "User", 1000, BankAccount.CHECKING);
        System.out.println("Setting up the initial info...");
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][] {
                { 100, true, 1100 },
                { 200, true, 1200 },
                { 325.14, true, 1325.14 },
                { 325.14, true, 1325.14 },
        });
    }

    @Test
    public void deposit() {
        double balance = account.deposit(amount, branch);
        assertEquals(balance, expected, 0.01);
    }
}