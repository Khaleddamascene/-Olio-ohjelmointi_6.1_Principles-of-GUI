package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import Control.CurrencyConverterControl;

public class CurrencyConverterView extends Application {

    @Override
    public void start(Stage stage) {
        CurrencyConverterControl control = new CurrencyConverterControl();


        BorderPane root = new BorderPane();
        root.setPadding(new Insets(20));


        Label title = new Label("🌍 CURRENCY CONVERTER");
        title.setStyle("-fx-font-size: 24px; -fx-font-weight: bold; -fx-text-fill: #34495e;");
        BorderPane.setAlignment(title, Pos.CENTER);
        root.setTop(title);


        VBox centerBox = new VBox(20);
        centerBox.setAlignment(Pos.CENTER);

        TextField amountField = new TextField();
        amountField.setPromptText("Enter amount...");
        amountField.setPrefWidth(250);
        amountField.setStyle("-fx-font-size: 16px;");

        ComboBox<String> fromCombo = new ComboBox<>();
        ComboBox<String> toCombo = new ComboBox<>();
        fromCombo.getItems().addAll(control.getAvailableCurrencies());
        toCombo.getItems().addAll(control.getAvailableCurrencies());
        fromCombo.setValue("EUR");
        toCombo.setValue("USD");
        fromCombo.setPrefWidth(120);
        toCombo.setPrefWidth(120);


        Label arrow = new Label("➤");
        arrow.setStyle("-fx-font-size: 24px; -fx-text-fill: #7f8c8d;");

        HBox currencies = new HBox(15, fromCombo, arrow, toCombo);
        currencies.setAlignment(Pos.CENTER);

        Button convertBtn = new Button("CONVERT NOW");
        convertBtn.setPrefSize(250, 45);
        convertBtn.setStyle("-fx-background-color: #3498db; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");

        TextField resultField = new TextField();
        resultField.setEditable(false);
        resultField.setPrefWidth(250);
        resultField.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-background-color: #ecf0f1;");

        centerBox.getChildren().addAll(amountField, currencies, convertBtn, resultField);
        root.setCenter(centerBox);

        // BOTTOM: Status
        Label status = new Label("Ready to convert currencies");
        status.setStyle("-fx-text-fill: #27ae60;");
        BorderPane.setAlignment(status, Pos.CENTER);
        root.setBottom(status);

        convertBtn.setOnAction(e -> {
            String amount = amountField.getText().trim();

            if (amount.isEmpty()) {
                status.setText("❌ Please enter an amount first");
                status.setStyle("-fx-text-fill: #e74c3c;");
                resultField.clear();
                resultField.setStyle("-fx-background-color: #fdf2f2;"); // Punainen tausta
                return;
            }

            String result = control.convert(amount, fromCombo.getValue(), toCombo.getValue());
            resultField.setText(result);

            boolean isError = result.toLowerCase().contains("invalid") ||
                    result.toLowerCase().contains("unsupported") ||
                    result.toLowerCase().contains("error");

            if (isError) {
                resultField.setStyle("-fx-text-fill: #e74c3c; -fx-font-weight: bold; -fx-background-color: #fdf2f2;");
                status.setText("❌ Conversion failed");
                status.setStyle("-fx-text-fill: #e74c3c;");
            } else {

                resultField.setStyle("-fx-text-fill: #27ae60; -fx-font-weight: bold; -fx-background-color: #d5f4e6;");
                status.setText("✅ Conversion successful");
                status.setStyle("-fx-text-fill: #27ae60;");
            }
        });

        Scene scene = new Scene(root, 500, 400);
        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }
}


