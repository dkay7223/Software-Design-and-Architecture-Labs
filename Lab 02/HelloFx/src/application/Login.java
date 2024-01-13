package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Login extends Application implements EventHandler<ActionEvent>{
	Button login;
	Button signup;
	
	@SuppressWarnings("static-access")
	@Override
	public void start(Stage secondaryStage) throws Exception {
		// TODO Auto-generated method stub
		secondaryStage.setTitle("Age Calculator");
		GridPane pane = new GridPane();
		
		pane.setPadding(new Insets(10,10,10,10));
		pane.setVgap(15);
		pane.setHgap(7);
		
		Label username=new Label(" User Name:");
		pane.setConstraints(username, 2, 1);
		
		TextField name=new TextField("User Name");
		pane.setConstraints(name, 3, 1);
		

		Label password=new Label(" Password:");
		pane.setConstraints(password, 2, 3);
		
		PasswordField Uname=new PasswordField();
		pane.setConstraints(Uname, 3, 3);
	
		login=new Button("login");
		pane.setConstraints(login, 3, 13);

		signup=new Button("SignUp");
		pane.setConstraints(signup, 5, 13);

		login.setOnAction(this);
		
		
		pane.getChildren().addAll(username,password);
		pane.getChildren().addAll(Uname,name);
		Scene scene = new Scene(pane, 600, 400, Color.PEACHPUFF);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		secondaryStage.setScene(scene);
		secondaryStage.show();

	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
}
