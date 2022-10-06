package ders2_oop1_21_9_22;

public class İndividualCustomer extends Customer { //extends etdikde digerinin ozelliyini burada kullanabiliriz
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
