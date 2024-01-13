package application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DeSerialization {

	public void deserialize() throws IOException {
		File studentfile = new File("Personalfile.txt");
		if (studentfile.createNewFile()) {
			System.out.println("file is created: " + studentfile.getName());
		} else {
			System.out.println("file already exists");
		}
	}
	public void write(User user) {
		try {
			FileWriter file=new FileWriter("Personalfile.txt", true);
		
			file.write(user.title);
			file.write(',');
			 file.write(user.firstName);
				file.write(',');
				file.write(user.surname);
				file.write(',');
				file.write(user.company);
				file.write(',');
				file.write(user.gender);
				file.write(',');
				file.write(user.address);
				
				file.append('\n');
				file.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
