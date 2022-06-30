package day7_Relationships;

public class Library {
	private String lname;
	private String address;
	private Book book;
	
	void display() {
		System.out.println(this.lname);
		System.out.println(this.address);
		System.out.println(this.book);
	}

}
