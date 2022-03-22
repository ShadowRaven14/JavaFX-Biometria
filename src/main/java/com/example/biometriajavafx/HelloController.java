package com.example.biometriajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.awt.image.BufferedImage;

public class HelloController {

    // Image views
    @FXML
    private ImageView originalImageView;
    private ImageView niBlackImageView;
    private ImageView sauvolaImageView;
    private ImageView phansalkarImageView;
    private ImageView bernsenImageView;

    @FXML
    private Label welcomeText;

    @FXML
    private Button loadImageBtn;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onLoadImageBtnClick() {
        Stage thisStage = (Stage) loadImageBtn.getScene().getWindow();

        BufferedImage originalImage;
        originalImage = FileHandler.LoadImage(thisStage);

        originalImageView.setImage(FileHandler.convertToFxImage(originalImage));

        welcomeText.setText("Load image!");


    }
}