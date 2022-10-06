package ders2_oop1_21_9_22;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Vade orani";

		Product product1 = new Product(); // Product veri tipi
		product1.setName("Delonghi Kahve Makinesi");	
		product1.setDisount(7);
		product1.setUnitPrice(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");	
		product2.setDisount(7);
		product2.setUnitPrice(3);
		product2.setImageUrl("image2.jpg");


		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");	
		product3.setDisount(7);
		product3.setUnitPrice(3);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for(Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		
		İndividualCustomer individualCustomer = new İndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0515142775");
		individualCustomer.setCustomerNumber("858585");
		individualCustomer.setFirstName("Senan");
		individualCustomer.setLastName("Ismayilli");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(8);
		corporateCustomer.setCompanyName("senan.ism");
		corporateCustomer.setPhone("0515142775");
		corporateCustomer.setTaxNumber("8585858585");
		corporateCustomer.setCustomerNumber("1234");
		
		Customer[] customers = {individualCustomer,corporateCustomer};

	}

}
