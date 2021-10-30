package cgb.jjclub;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button loginBut;

    @FXML
    private TextField password;

    @FXML
    private TextField user;

    @FXML
    void login(ActionEvent event) {
        String userName = user.getText();
        String userpassword = password.getText();
        option(userName+"\n"+userpassword);
    }

    public void option(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(message);
        alert.showAndWait();
    }

}
