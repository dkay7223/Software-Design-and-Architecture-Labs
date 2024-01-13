package application;
	
import java.io.IOException;
import java.util.LinkedList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("AddressBook.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene); 
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static LinkedList <User> businessUser=new LinkedList<>();
	public static void main(String[] args) throws IOException {
		DeSerialization s=new DeSerialization();
		s.deserialize();
		
		launch(args);
	}
}
