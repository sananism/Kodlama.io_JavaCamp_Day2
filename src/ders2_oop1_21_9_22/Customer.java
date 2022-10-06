package ders2_oop1_21_9_22;

public class Customer {
	private int id;
	private String customerNumber;
	private String phone; // Üzerinde matematiksel işlem yapmadığımız verileri String olarak tutmak daha
							// iyidir

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
