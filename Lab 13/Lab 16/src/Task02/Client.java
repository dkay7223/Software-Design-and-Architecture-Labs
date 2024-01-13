package Task02;

import java.io.IOException;
import java.util.Scanner;

public class Client {
	 public static void main(String[] args) throws IOException {
	  System.out.println("Enter your selection:");
	  try (Scanner in = new Scanner(System.in)) {
		String selection = null;
		  selection = in.next();
		  GarmentType gamentType = GarmentFactory.createGarments(selection);
		  System.out.println(gamentType.print());
	}
	 }
	}