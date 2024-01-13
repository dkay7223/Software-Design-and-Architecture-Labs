package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.*;

public class AddressBookController {
	private Stage stage;
	private Scene scene;
	private Parent root;

	// Add personal contact
	public void switchToPersonal(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Personal.fxml"));
		scene = new Scene(root);
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}

	// Add business contact
	public void switchToBusiness(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Business.fxml"));
		scene = new Scene(root);
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
}
