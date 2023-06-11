package methodlms;

import java.util.InputMismatchException;
import java.util.Scanner;

import getsetlms.Books;
import getsetlms.Membership;

public class MethodsLMS {
	Scanner s = new Scanner(System.in);
	String searchName;
	String searchNum;

	public int id;
	public String name, address;
	public long phoneNo;

	public void addNewMembership() {
		try {
			System.out.println("Enter Id :");
			id = s.nextInt();
			System.out.println("Enter Name :");
			name = s.next();
			System.out.println("Enter Address :");
			address = s.next();
			System.out.println("Enter Contact Number :");
			phoneNo = s.nextLong();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a valid data type.");
			s.nextLine();
			addNewMembership();
		}
	}

	String newName;
	long newPhoneNo;

	public void updateMembershipDetails(Membership upname) {
		if (upname != null) {
			System.out.println("Enter new Name:");
			String newName = s.next();
			upname.setName(newName);

			System.out.println("Enter new Address:");
			String newAddress = s.next();
			upname.setAddress(newAddress);
			try {
				System.out.println("Enter new Contact number:");
				newPhoneNo = s.nextLong();
				upname.setPhoneNo(newPhoneNo);
			} catch (InputMismatchException e) {
				System.out.println("Invalid input! Please enter correct  Contact Number...");
				s.nextLine();
				newPhoneNo = s.nextLong();
				upname.setPhoneNo(newPhoneNo);
			}
			System.out.println("Membership details updated successfully.");
		} else {
			System.out.println("Membership not found.");
		}
	}

	public int bookId;
	public String bookTitle, bookAuthor, bookCategory;

	public void addNewBook() {
		try {
			System.out.println("Enter Book Id :");
			bookId = s.nextInt();
			System.out.println("Enter Book Title :");
			bookTitle = s.next();
			System.out.println("Enter Book Author :");
			bookAuthor = s.next();
			System.out.println("Enter Book Category :");
			bookCategory = s.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a valid data type.");
			s.nextLine();
			addNewBook();
		}
	}

	static String newBookTitle;

	public void updateBook(Books upBookTitle) {
		if (upBookTitle != null) {
			System.out.println("Enter new book Title:");
			String newBookTitle = s.next();
			upBookTitle.setBookTitle(newBookTitle);

			System.out.println("Enter new book Author:");
			String newBookAuthor = s.next();
			upBookTitle.setBookAuthor(newBookAuthor);

			System.out.println("Enter new book Category:");
			String newBookCategory = s.next();
			upBookTitle.setBookCategory(newBookCategory);

			System.out.println("Book details updated successfully.");
		} else {
			System.out.println("Book not found.");
		}
	}
}
