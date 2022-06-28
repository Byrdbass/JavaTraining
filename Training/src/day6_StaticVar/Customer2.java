package day6_StaticVar;

public class Customer2 {
	private String custno;
	private String cname;
	private static int counter=1;
	
	Customer2(String cname){
		this.cname=cname;
		if (counter<10) {
			this.custno="C00" + ++counter;
		}
		else
		{
			this.custno="C0" + ++counter;
		}
		
		
	}

	public String getCustno() {
		return custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	
	void display() {
		System.out.println(this.custno);
		System.out.println(this.cname);
		
	}

}
