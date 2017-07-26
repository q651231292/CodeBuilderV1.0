package codebuilder.controller;

import codebuilder.App;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class IndexController {
	@FXML
	private Button diyMark;
	@FXML
	private Button diyTemp;
	@FXML
	private Button createCode;

	@FXML
	public void diyMarkTo(ActionEvent event) {
		App.SceneReplacer("DiyMark.fxml");
	}

	@FXML
	public void diyTempTo(ActionEvent event) {
	}
	@FXML
	public void createCodeTo(ActionEvent event) {
	}
}
