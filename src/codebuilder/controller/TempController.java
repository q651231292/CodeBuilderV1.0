package codebuilder.controller;

import java.net.URL;
import java.util.ResourceBundle;

import codebuilder.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class TempController implements Initializable {

	@FXML
	TableView tempList;
	@FXML
	VBox vbox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	public void addTempTo(ActionEvent event) {
		App.SceneReplacer("/fxml/temp/AddTempTo.fxml");
	}

	@FXML
	public void delTemp(ActionEvent event) {
	}

	@FXML
	public void modTempTo(ActionEvent event) {
	}

	@FXML
	public void addTempChil(ActionEvent event) {
		HBox hbox = new HBox();
		TextField key = new TextField();
		TextArea value = new TextArea();
		value.getStyleClass().add("values");
		hbox.getChildren().addAll(key, value);
		hbox.getStyleClass().add("hbox");
		vbox.getChildren().addAll(hbox);
	}

	@FXML
	public void addTemp(ActionEvent event) {

	}

}
