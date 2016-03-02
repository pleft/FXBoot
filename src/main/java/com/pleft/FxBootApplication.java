package com.pleft;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FxBootApplication extends Application{

	public static void main(String[] args) {
		launch();
		SpringApplication.run(FxBootApplication.class, args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("FXBoot");
		primaryStage.show();
	}
}
