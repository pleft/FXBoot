package com.pleft;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FxBootApplication extends Application{

	private static final String[] BANNER = { "",
			"  .   ____          _            __ _ _",
			" /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\",
			"( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\",
			" \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )",
			"  '  |____| .__|_| |_|_| |_\\__, | / / / /",
			" =========|_|==============|___/=/_/_/_/" };

	public static void main(String[] args) {
		SpringApplication.run(FxBootApplication.class, args);
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		String bannerString = getSpringBannerString();
		StackPane root = new StackPane();
		final TextArea textArea = new TextArea(bannerString);
		textArea.setFont(Font.font("Monospaced"));
		textArea.setEditable(false);
		root.getChildren().add(textArea);
		Scene scene = new Scene(root, 320, 240);
		primaryStage.setTitle("FXBoot");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private String getSpringBannerString() {
		StringBuilder bannerStringBuilder = new StringBuilder();
		for(String s: BANNER) {
			bannerStringBuilder.append(s).append("\n");
		}
		return bannerStringBuilder.toString();
	}
}
