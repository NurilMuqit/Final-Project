import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button Button;
    @FXML
    private PasswordField PassLogin;
    @FXML
    private TextField UserLogin;
    @FXML
    private Label WrongLabel;

    public void ButtonLogin(ActionEvent event)throws IOException{
        checkLogin();
    }

    private void checkLogin()throws IOException{
        Main scene = new Main();
        if (UserLogin.getText().toString().equals("Ramenkuy") && PassLogin.getText().toString().equals("6969")) {
            WrongLabel.setText("いただきます");

            scene.changeScene("Ramen.fxml");
        }
        else if(UserLogin.getText().isEmpty() && PassLogin.getText().isEmpty()){
            WrongLabel.setText("Masukkan username dan password anda");
        }
        else{
            WrongLabel.setText("Username dan password anda tidak cocok");
        }
        
    }
    
}