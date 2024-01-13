
public class Product {

	// name category manufacturing_year price status company size color
	String name;
	String category;
	int mfgYear;
	int price;
	String status;
	String company;
	String size;
	String color;

	public Product(String name, String category, int mfgYear, int price, String company, String color) {
		super();
		this.name = name;
		this.category = category;
		this.mfgYear = mfgYear;
		this.price = price;
		this.company = company;
		this.color = color;

	}

	enum Size {
		S, M, L, XL
	}

	enum Status {
		Available, active, unavailable
	}

}
