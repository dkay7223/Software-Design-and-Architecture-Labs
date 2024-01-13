import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
	ArrayList<Product> product=new ArrayList<>();
		
		Product p=new Product("Dove","Cosmetics",2000,200,"Unilever","white");
		Product p1=new Product("Rose","Cosmetics",2000,100,"Unilever","green");
		Product p2=new Product("Vital","Cosmetics",2000,300,"Tapal","black");
		Product p3=new Product("Head and shoulders","Cosmetics",2000,500,"Unilever","white");
		
		product.add(p);
		product.add(p1);
		product.add(p3);
		product.add(p2);
	
		
		PersistanceHandler handler;
		int choice = 0;
		System.out.print("Chose storage option (0 for file and 1 for database)- ");

		int a = sc.nextInt();
		switch (choice) {
		case 1:
			handler = new DBHandler();
			break;
		default:
			System.out.print("No other storage is available right now");

		}
		handler = new DBHandler();
		handler.connectDB();
		handler.readRecord();
	}
}