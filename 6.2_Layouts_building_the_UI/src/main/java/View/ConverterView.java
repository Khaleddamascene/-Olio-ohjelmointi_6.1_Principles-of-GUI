package View;

import Controller.ConverterController;
import Model.Currency;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConverterView extends Application {

    private TextField amountField = new TextField();
    private TextField resultField = new TextField();

    private ComboBox<Currency> fromBox = new ComboBox<>();
    private ComboBox<Currency> toBox = new ComboBox<>();

    private ConverterController controller;

    @Override
    public void init() {
        controller = new ConverterController();
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("Currency Converter");

        Label instruction =
                new Label("Enter amount, choose currencies and press Convert.");

        Label amountLabel = new Label("Amount:");
        Label fromLabel = new Label("From currency:");
        Label toLabel = new Label("To currency:");
        Label resultLabel = new Label("Result:");

        Button convertButton = new Button("Convert");

        resultField.setEditable(false);

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20));
        layout.setHgap(10);
        layout.setVgap(10);

        layout.add(instruction, 0, 0, 2, 1);
        layout.add(amountLabel, 0, 1);
        layout.add(amountField, 1, 1);
        layout.add(fromLabel, 0, 2);
        layout.add(fromBox, 1, 2);
        layout.add(toLabel, 0, 3);
        layout.add(toBox, 1, 3);
        layout.add(resultLabel, 0, 4);
        layout.add(resultField, 1, 4);
        layout.add(convertButton, 1, 5);

        fromBox.getItems().addAll(controller.getCurrencies());
        toBox.getItems().addAll(controller.getCurrencies());

        convertButton.setOnAction(e -> convertCurrency());

        Scene scene = new Scene(layout, 400, 300);
        scene.getStylesheets().add(getClass().getResource("/Currency.css").toExternalForm());
        stage.setScene(scene);
        stage.show();


    }

    private void convertCurrency() {

        try {

            double amount = Double.parseDouble(amountField.getText());

            Currency fromCurrency = fromBox.getValue();
            Currency toCurrency = toBox.getValue();

            if (fromCurrency == null || toCurrency == null) {
                showError("Please select currencies.");
                return;
            }

            double result = controller.convert(amount, fromCurrency, toCurrency);

            resultField.setText(String.format("%.2f", result));
        }
        catch (NumberFormatException e) {
            showError("Invalid number. Please enter a valid amount.");
        }
    }

    public void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR, message);
        alert.showAndWait();
    }
}
