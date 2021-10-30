package cgb.jjclub;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private Button loginBut;

    @FXML
    private TextField password;

    @FXML
    private TextField user;

    @FXML
    void login(ActionEvent event) throws Exception {
        String userName = user.getText();
        String userpassword = password.getText();
        Account acc = new Account();
        if(acc.map.containsKey(userName) && acc.map.get(userName).equals(userpassword)){
            //option(userName+"\n"+userpassword+"\n登陆成功");
            Stage primaryStage=(Stage)loginBut.getScene().getWindow();
            primaryStage.close();
            WelcomeMain we=new WelcomeMain();
            Stage stage=new Stage();
            we.start(stage);
        }else {
            option(userName+"\n"+userpassword+"\n登陆失败");
        }
    }

    public void option(String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.titleProperty().set("提示窗口");
        alert.headerTextProperty().set(message);
        alert.showAndWait();
    }

}
