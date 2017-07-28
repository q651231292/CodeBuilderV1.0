package codebuilder.controller;

import codebuilder.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class IndexController {

	@FXML
	private Button diyTemp;
	@FXML
	private Button createCode;

	@FXML
	public void diyTempTo(ActionEvent event) {
		App.SceneReplacer("/fxml/temp/QueryTempTo.fxml");
	}
	@FXML
	public void createCodeTo(ActionEvent event) {
	}
}
