package cgb.jjclub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("cgbUI.fxml"));
        primaryStage.setTitle("JAVA大数据登陆界面");
        primaryStage.setScene(new Scene(root, 600, 469));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
