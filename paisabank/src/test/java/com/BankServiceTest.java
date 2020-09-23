package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BankServiceTest {
	Bankservice bs = new Bankservice();

	@Test
	public void testnousers() {
		Assertions.assertEquals("Welcome User ! Paisa Bank has total of 2 customer", bs.nousers());
	}

	@Test
	public void testuser() {
		Assertions.assertEquals("Welcome Jain, Your user Id is = 1003", bs.user("Jain"));
	}

	@Test
	public void testuserid() {
		Assertions.assertEquals("Welcome Gautam, Your user Id is = 1001", bs.userid(1001));
	}

	@Test
	public void testuseridFail() {
		Assertions.assertEquals("User Not Found", bs.userid(100123));
	}

	@Test
	public void testupdname() {
		Assertions.assertEquals("Welcome Gautam, Your user Id is =1001. You have changed your name Gautam to Sunil",
				bs.updname(1001, "Sunil"));
	}

	@Test
	public void testupdgender() {
		Assertions.assertEquals("Welcome Gautam, Your user Id is =1001. You have changed your gender to Male",
				bs.updgender(1001, "Male"));
	}

}
