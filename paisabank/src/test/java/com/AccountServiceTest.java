package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class AccountServiceTest {
	Accountservice bs = new Accountservice();

	@Test
	public void testbalance() {
		Assertions.assertEquals("You have balance of 2000.0 Rs", bs.balance(1001));
	}

	@Test
	public void testdeposite() {
		Assertions.assertEquals("You have total balance of 8700.0 Rs", bs.deposite(1001, 6700));
	}

	@Test
	public void testwithdraw() {
		Assertions.assertEquals("You have total balance of 1500.0 Rs", bs.withdraw(1001, 500));
	}

	@Test
	public void testwithdrawFail() {
		Assertions.assertEquals("Insuffient Balance to withdraw !! You have total balance of 2000.0 Rs",
				bs.withdraw(1001, 34000));
	}

	@Test
	public void testintrest() {
		Assertions.assertEquals("You will get total intrest of 204.0 Rs", bs.intrest(1003, 34000));
	}

	@Test
	public void testinfo() {
		Assertions.assertEquals("Welcome Jain, You have total balance of 6000.0 Rs and Your account number is 1813",
				bs.info(1003));
	}

}
