package application;

import java.net.URL;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class MyController implements Initializable{
	@FXML
	private Button button1;
	
	@FXML
	private Button button2;
	
	
	@FXML
	private TextField txt1;

	
	@FXML
	private Text txt2;
	
	public void initialize(URL location, ResourceBundle resources) {
		 
	       // TODO (don't really need to do anything here).
	      
	}
	// When user click on button1
	// this method will be called.
	public void action1(ActionEvent event) {
		int a = Integer.parseInt(txt1.getText());
		String b = Integer.toOctalString(a);
		txt2.setText(b);
	}
	public void action2(ActionEvent event) {
		int a = Integer.parseInt(txt1.getText());
		String b = Integer.toHexString(a);
		txt2.setText(b);
	}
}
