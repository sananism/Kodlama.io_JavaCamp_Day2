package ders2_oop1_21_9_22;

//PascalCase ~~~~ ilk harf buyuk baslar
public class Product {
	String name;
	// camelCase
	private double unitPrice;
	private double disount;
	private String imageUrl;
	private int unitsInStock;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDisount() {
		return disount;
	}

	public void setDisount(double disount) {
		this.disount = disount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
