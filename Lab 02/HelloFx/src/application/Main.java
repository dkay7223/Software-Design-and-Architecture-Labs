package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Main extends Application implements EventHandler<ActionEvent> {
	static Button signup;
	static Button login;

	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) throws Exception {
		
			primaryStage.setTitle("Age Calculator");
			GridPane pane = new GridPane();
			
			pane.setPadding(new Insets(10,10,10,10));
			pane.setVgap(15);
			pane.setHgap(7);
			
			Label fullname=new Label(" Full name:");
			pane.setConstraints(fullname, 2, 1);
			
			TextField name=new TextField("Full name");
			pane.setConstraints(name, 3, 1);
			

			Label userName=new Label(" UserName:");
			pane.setConstraints(userName, 2, 3);
			
			TextField Uname=new TextField("Username");
			pane.setConstraints(Uname, 3, 3);
						
			
			Label password=new Label(" Password:");
			pane.setConstraints(password, 2, 5);
			
			PasswordField pass=new PasswordField();
			pane.setConstraints(pass, 3, 5);
			
			Label confirmPassword=new Label(" Confirm Password:");
			pane.setConstraints(confirmPassword, 2, 7);
			
			PasswordField passw=new PasswordField();
			pane.setConstraints(passw, 3, 7);
			
			Label email=new Label(" Email:");
			pane.setConstraints(email, 2, 9);

			TextField mail=new TextField("Email");
			pane.setConstraints(mail, 3, 9);
			
			Label phoneNo=new Label(" PhoneNo:");
			pane.setConstraints(phoneNo, 2, 11);

			TextField phone=new TextField("Phone Number");
			pane.setConstraints(phone, 3, 11);

			signup=new Button("SignUp");
			pane.setConstraints(signup, 3, 13);

			signup.setOnAction(this);
			
			pane.getChildren().addAll(fullname,userName,password,phoneNo,email,confirmPassword,signup);
			pane.getChildren().addAll(Uname,name,mail,pass,passw,phone);
			Scene scene = new Scene(pane, 600, 400, Color.PEACHPUFF);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

	}
	
	@SuppressWarnings("static-access")
	public void start2(Stage secondaryStage) throws Exception {
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
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(signup)) {
			try {
				start2(null);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
