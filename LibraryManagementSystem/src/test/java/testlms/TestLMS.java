package testlms;

import static org.junit.Assert.*;
import methodlms.MethodsLMS;
import getsetlms.Membership;
import getsetlms.Books;

import org.junit.Test;

public class TestLMS {

	@Test
	public void testAddNewMembership() {
		MethodsLMS methods = new MethodsLMS();
		methods.addNewMembership();
		assertNotNull(methods.id);
		assertNotNull(methods.name);
		assertNotNull(methods.address);
		assertTrue(methods.phoneNo > 0);
	}

//    @Test
//    public void testUpdateMembershipDetails1() {
//        MethodsLMS methods = new MethodsLMS();
//        Membership membership = new Membership(11, "Ambika", "Hyderabad", 9090909090L);
//        methods.updateMembershipDetails(membership);
//        assertNotNull(membership.getName());
//        assertNotNull(membership.getAddress());
//        assertTrue(membership.getPhoneNo() > 0);
//    }
	@Test
	public void testUpdateMembershipDetails2() {
		MethodsLMS methods = new MethodsLMS();
		Membership membership = new Membership(11, "Ambika", "Hyderabad", 9090909090L);
		methods.updateMembershipDetails(membership);
		assertEquals(membership.getName(), "Siri");
		assertEquals(membership.getAddress(), "Chennai");
		assertEquals(membership.getPhoneNo(), 9393939393L);
	}

	@Test
	public void testAddNewBook() {
		MethodsLMS methods = new MethodsLMS();
		methods.addNewBook();
		assertNotNull(methods.bookTitle);
		assertNotNull(methods.bookAuthor);
		assertNotNull(methods.bookCategory);
	}

//    @Test
//    public void testUpdateBook1() {
//        MethodsLMS methods = new MethodsLMS();
//        Books book = new Books(1, "bt1", "ba1", "bc1");
//        methods.updateBook(book);
//        assertNotNull(book.getBookTitle());
//        assertNotNull(book.getBookAuthor());
//        assertNotNull(book.getBookCategory());
//    }

	@Test
	public void testUpdateBook2() {
		MethodsLMS methods = new MethodsLMS();
		Books book = new Books(1, "bt1", "ba1", "bc1");
		methods.updateBook(book);
		assertEquals(book.getBookTitle(), "bt5");
		assertEquals(book.getBookAuthor(), "ba5");
		assertEquals(book.getBookCategory(), "bc5");
	}
}
