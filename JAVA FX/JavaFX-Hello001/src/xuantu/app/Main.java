package xuantu.app;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Main extends Application{
	@Override
	public void start(Stage prStage) throws Exception{
		//Tao moi nut bam
		Button btn = new Button();
		//
		btn.setText("Xin chao Java");
		//Tao cua so
		StackPane root = new StackPane();
		root.getChildren().add(btn);//--->> Phương thức getChildren dùng để thêm nút điều khiển
		//Màn hình và cảnh hiển thị
		Scene scene = new Scene(root, 400,200);
		prStage.setTitle("Hello Worlđ");
		prStage.setScene(scene);
		prStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

}

