package com.abraham.callssmsmanager.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.Objects;

public class SmsController {

    @FXML
    private Hyperlink DeselectAllHyperlink;

    @FXML
    private TableColumn<?, ?> addressColumn;

    @FXML
    private TableColumn<?, ?> bodyColumn;

    @FXML
    private AnchorPane checkboxAnchorPane;

    @FXML
    private TableColumn<?, ?> dateTimeColumn;

    @FXML
    private Button fetchButton;

    @FXML
    private ImageView iconrefresh;

    @FXML
    private TableColumn<?, ?> imeiColumn;

    @FXML
    private TextField readingLimitTextfield;

    @FXML
    private TextField receivingTimeTextField;

    @FXML
    private Button refreshButton;

    @FXML
    private Hyperlink selectAllHyperlink;
    @FXML
    public  void  initialize(){
        loadReources();
    }

    private void loadReources() {
        Image refreshImage = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/images/refresh.png")));
        iconrefresh.setImage(refreshImage);
    }

}
