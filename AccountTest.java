package test;

import static org.junit.Assert.*;

import org.junit.Test;

import App.Account;

public class AccountTest {

	@Test
	public void testFirstName() {
		System.out.println("testing first name");
		Account acc = new Account("jer","kyl",100);
		
		assertEquals("first name name working",acc.getFirstName(),"jer");
	}
	@Test
	public void testSecondName() {
		System.out.println("testing second name");
		Account acc = new Account("jer","Kyle",100);
		
		assertEquals("second name name working",acc.getSecondName(),"Kyle");
	}
	@Test
	public void testAccountnumber() {
		System.out.println("testing  accountNumber");
		Account acc = new Account("jer","Kyle",100);
		
		assertEquals("Account Number Number working",acc.getSecondName(),"100");
	}
}
