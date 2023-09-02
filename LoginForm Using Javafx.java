package GUIInjava.JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class LoginForm extends Application {



    @Override
    public void start(Stage stage) throws Exception { 
        
        
        //creating grid pane and setting it's position
        GridPane grid =new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(20);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        
        //adding text ,text field and labels
        Text text=new Text("WELCOME TO LOGIN");
        text.setFill(Color.BLACK);
        text.setFont(Font.font("Muller Next",FontWeight.SEMI_BOLD,FontPosture.REGULAR, 35));
        grid.add(text,0,0,2,1);


        //creating label
        Label username=new Label("User Name : ");
        username.setFont(Font.font(STYLESHEET_CASPIAN,FontWeight.BOLD, null, 15));
        grid.add(username, 0,1);

        //adding text field
        TextField userTextField=new TextField();
        grid.add(userTextField,1,1);


        //label for password
        Label password=new Label("Password : ");
        password.setFont(Font.font(STYLESHEET_CASPIAN,FontWeight.BOLD, null, 15));
        grid.add(password, 0, 2);
        
        
        //adding textfield for the password
        TextField passTextField=new TextField();
        grid.add(passTextField, 1, 2);
        
        
        //adding forgot button
        Button forgButton=new Button("Forgot password?");
        grid.add(forgButton,1,3);
        
        //adding signin button
        Button sigButton=new Button("Sign in");
        HBox hbtBox=new HBox(10);
        hbtBox.setAlignment(Pos.BOTTOM_RIGHT);
        hbtBox.getChildren().addAll(sigButton,forgButton);
        grid.add(hbtBox, 1, 3);
        
        
        
        
        //action to perform
        Text actiontarget=new Text();
        grid.add(actiontarget,1 , 4);
        
        
        
        //setting action to the signin button
        sigButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("you have pressed sign in");
            }
            
        });
        
        
        
        //setting action to the forgot password button
        forgButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.RED);
                actiontarget.setText("forgot pasword is pressed");
            }
            
        });
        
    
        
        
       

        Scene scene=new Scene(grid,800,500);
        stage.setScene(scene);
        scene.getStylesheets().add(LoginForm.class.getResource("LoginForm.css").toExternalForm());
        stage.setTitle("Login form");
        stage.show();
        stage.setResizable(false);
    }




    public static void main(String[] args) {
        launch(args);
        
    }

}
