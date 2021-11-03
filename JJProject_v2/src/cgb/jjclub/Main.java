package cgb.jjclub;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    //窗口分辨率
    static final int w = 600, h = 469;
    

    //事件主窗口，继承自Application,必须重写一个start方法
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("cgbUI.fxml"));
        primaryStage.setTitle("JAVA大数据登陆界面");
        primaryStage.setScene(new Scene(root, w, h));
        primaryStage.show();
    }

    //创建其他的窗口，在controller中调用此方法并传入新的fxml文件路径
    public static void OtherUI(Stage primaryStage, String dir) throws Exception {
        Parent root = FXMLLoader.load(Main.class.getResource(dir));
        primaryStage.setTitle("JAVA大数据登陆成功");
        primaryStage.setScene(new Scene(root, w, h));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
