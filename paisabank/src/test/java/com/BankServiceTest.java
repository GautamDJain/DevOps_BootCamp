package com;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.CoreMatchers.containsString;
import com.Accountservice;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BankServiceTest {
	Accountservice as = new Accountservice();
	@Test
	public void testMessage() {
		assertTrue(as.balance(1001).contains("Gautam"));
		//Assertions.assertEquals(as.balance(1001), containsString("2000"));
	}
	
}
