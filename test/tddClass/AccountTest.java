package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    @DisplayName("Deposit money, balance increases test")
    public void depositMoneyBalanceIncreasesTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getBalance());


        }

    //todo create test for negative deposited
    @Test
    public void withdrawWorkTest(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(5000);
        jennyAccount.withdraw(2000);
        //check
//        short expected;
        assertEquals( 3000, jennyAccount.getWithdraw());


    }
}
