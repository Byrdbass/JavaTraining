package day7_Relationships;

public class Book {
	private int id;
	private String Bname;
	
	public Book(int id, String bname) {
		super();
		this.id = id;
		Bname = bname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}

}
