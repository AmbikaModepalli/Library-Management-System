package mainlms;

import java.util.Scanner;
import java.util.TreeSet;

import comparatorlms.BookComparator;
import comparatorlms.MembershipComparator;
import getsetlms.Books;
import getsetlms.Membership;
import methodlms.MethodsLMS;

public class LibraryManagementSystem extends MethodsLMS {

	public static void main(String[] args) {
		TreeSet<Membership> set = new TreeSet<Membership>(new MembershipComparator());
		TreeSet<Books> set2 = new TreeSet<Books>(new BookComparator());

		set.add(new Membership(11, "Ambika", "Hyderabad", 9090909090L));
		set.add(new Membership(22, "Ram", "Warangal", 9191919191L));

		set2.add(new Books(1, "bt1", "ba1", "bc1"));
		set2.add(new Books(2, "bt2", "ba2", "bc2"));

		MethodsLMS m = new MethodsLMS();

		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Library Management System");
			System.out.println("------------------------");
			System.out.println("1. Add New Membership");
			System.out.println("2. View Membership Details");
			System.out.println("3. Update Membership Details");
			System.out.println("4. Close Membership");
			System.out.println("5. Add New Book");
			System.out.println("6. View Book Details");
			System.out.println("7. Update Book");
			System.out.println("8. Delete Book Details");
			System.out.println("0. Exit");
			System.out.println();
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			Membership upname = null;
			Membership delname = null;
			String searchName;
			Books upBookTitle = null;
			Books delBookTitle = null;
			try {
				switch (choice) {
				case 1:
					m.addNewMembership();
					set.add(new Membership(m.id, m.name, m.address, m.phoneNo));
					System.out.println("New Member added...");
					break;
				case 2:
					for (Membership vc : set) {
						System.out.println(vc);
					}
					break;
				case 3:
					System.out.println("Enter Name to be updated:");
					searchName = sc.next();

					for (Membership uc : set) {
						if (uc.getName().equals(searchName)) {
							upname = uc;
							break;
						}
					}
					m.updateMembershipDetails(upname);
					break;
				case 4:
					System.out.println("Enter Name to be searched :");
					searchName = sc.next();
					for (Membership dc : set) {
						if (dc.getName().equals(searchName))
							delname = dc;
					}
					set.remove(delname);
					System.out.println("Membership Deleted...");
					break;
				case 5:
					m.addNewBook();
					set2.add(new Books(m.bookId, m.bookTitle, m.bookAuthor, m.bookCategory));
					System.out.println("New Book Added......");
					break;
				case 6:
					for (Books b : set2) {
						System.out.println(b);
					}
					break;
				case 7:
					System.out.println("Enter book Title to be updated:");
					String searchBookTitle = sc.next();

					for (Books ub : set2) {
						if (ub.getBookTitle().equals(searchBookTitle)) {
							upBookTitle = ub;
							break;
						}
					}
					m.updateBook(upBookTitle);
					break;
				case 8:
					System.out.println("Enter Book Title  to be deleted :");
					searchBookTitle = sc.next();
					for (Books dc : set2) {
						if (dc.getBookTitle().equals(searchBookTitle))
							delBookTitle = dc;
					}
					set2.remove(delBookTitle);
					System.out.println("Book Deleted...");
					break;
				case 0:
					System.out.println("Exiting the program...");
					break;
				default:
					System.out.println("Invalid choice, please enter your choice between 0 to 8 again!!!!");
					break;
				}
			} catch (NullPointerException npe) {
				System.out.println("The Data you have entered is not found!!!... Please enter correct Data");
			}
			System.out.println();
		} while (choice != 0);
		sc.close();
	}
}