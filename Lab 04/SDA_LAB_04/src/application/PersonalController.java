package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PersonalController {
	Stage stage;
	Scene scene;
	Parent root;
	@FXML TextField title;
	@FXML TextField company;
	@FXML TextField surname;
	@FXML TextField firstName;
	@FXML TextField gender;
	@FXML TextField address;
	@FXML TextArea notes;

	// cancel Button
	public void switchToAddress(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("AddressBook.fxml"));
		stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void save(ActionEvent e) {
		saveIt();
	}

	private void saveIt() {
		String title = this.title.getText();
		String firstName = this.firstName.getText();
		String surname = this.surname.getText();
		String company = this.company.getText();
		String gender = this.gender.getText();
		String address = this.address.getText();
		String notes = this.notes.getText();

		User user = new User(title, firstName, surname, company, gender, address);
		user.notes = notes;
		Main.businessUser.add(user);
		DeSerialization s = new DeSerialization();
		s.write(user);
		user.display();

	}
}
