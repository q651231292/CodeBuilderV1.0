package codebuilder;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

	public static Stage stage;

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		replaceScene("Index.fxml");
		stage.getIcons().add(new Image("/img/chuizi.png"));
		stage.setTitle("codebuilder");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private static void replaceScene(String sceneFxml) {
		try {
			URL url = App.class.getResource("/fxml/" + sceneFxml);
			Parent root = FXMLLoader.load(url);
			Scene scene = new Scene(root);
			stage.setScene(scene);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 场景替换器
	 *
	 * @param sceneFxml
	 */
	public static void SceneReplacer(String sceneFxml) {
		new Thread(() -> {

			Platform.runLater(() -> {
				App.replaceScene("Loading.fxml");

			});
			App.sleep(1);
			Platform.runLater(() -> {
				App.replaceScene(sceneFxml);

			});
		}).start();
	}

	/**
	 * 模拟加载文件的延迟效果
	 *
	 * @param millis
	 *            延迟时间
	 */
	public static void sleep(long timeout) {
		try {
			System.out.println("begin sleep");
			TimeUnit.SECONDS.sleep(timeout);
			System.out.println("end sleep ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
