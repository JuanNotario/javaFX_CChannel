package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class controlador {
	
	private AnchorPane mypane;
	
	@FXML
	public void handleClose() {
		System.exit(0);
	}
	
	@FXML
	public void abrirPanel() {
		
		Stage stage = new Stage();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("panel2.fxml"));
		try {
			mypane = (AnchorPane) loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		stage.setTitle("Esto es un tiburobn");
		stage.setScene(new Scene(mypane));
		stage.show();
			
		}
		
		
	}


