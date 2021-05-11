package application;
	
import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;


public class Main extends Application {
	
	private static Stage stage;
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			stage = primaryStage;
			primaryStage.setResizable(false);
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
			primaryStage.setTitle("Infirmary Management System Login");
			Scene scene = new Scene(root,800,600);
			primaryStage.getIcons().add( new Image("LogoIcon.png"));
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void changeScene(String fxml) {
		
		try {
			stage.setResizable(false);
			stage.setHeight(637.5999755859375);
			stage.setWidth(814.4000244140625);
			Rectangle2D primScreenBounds = Screen.getPrimary().getVisualBounds();
			stage.setX((primScreenBounds.getWidth() - stage.getWidth()) / 2);
		    stage.setY((primScreenBounds.getHeight() - stage.getHeight()) / 2);
			Parent pane = FXMLLoader.load(getClass().getResource(fxml));
			stage.getScene().setRoot(pane);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void showPatientRecords(String fxml) {
		
		try {
			Parent pane = FXMLLoader.load(getClass().getResource(fxml));
			stage.getScene().setRoot(pane);
			stage.setResizable(true);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
