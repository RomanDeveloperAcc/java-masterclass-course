package rbd.project;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    private static int count;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Executes before class. Count is " + count++);
    }

    @Before
    public void setUp() {
        account = new BankAccount("Test", "User", 1000, BankAccount.CHECKING);
        System.out.println("Setting up the initial info...");
    }

    @Test
    public void deposit() {
        double balance = account.deposit(200, true);
        assertEquals(balance, 1200, 0);
    }

    @Test
    public void withdraw() {
        fail("Not implemented");
    }

    @Test
    public void getBalance_deposit() {
        double balance = account.deposit(200, true);
        assertEquals(balance, 1200, 0);
    }

    @Test
    public void getBalance_withdraw() {
        double balance = account.withdraw(200, true);
        assertEquals(balance, 800, 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue(account.isChecking());
    }

    @Test
    public void isChecking_false() {
        assertFalse("Not appropriate account type", account.isChecking());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This executes after class. Count equals " + count++);
    }

    @After
    public void teardown() {
        System.out.println("Count equals " + count++);
    }
}