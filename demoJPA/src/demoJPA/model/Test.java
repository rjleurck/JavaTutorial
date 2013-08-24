package demoJPA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Test {
	
	public Test(String aString, int myInt) {
		super();
		this.aString = aString;
		this.myInt = myInt;
	}
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	private String aString;
	private int myInt;
	public String getaString() {
		return aString;
	}
	public void setaString(String aString) {
		this.aString = aString;
	}
	public int getMyInt() {
		return myInt;
	}
	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

}
