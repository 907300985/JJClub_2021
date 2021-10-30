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
        Account acc = new Account();
        if(userName.equals(acc.nd) && userpassword.equals(acc.ndPas)){
            option(userName+"\n"+userpassword+"\n登陆成功");
        }else {
            option(userName+"\n"+userpassword+"\n输入错误");
        }
    }

    public void option(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示");
        alert.headerTextProperty().set(message);
        alert.showAndWait();
    }

}
