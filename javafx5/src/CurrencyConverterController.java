import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.StringConverter;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverterController {

    @FXML private ChoiceBox<String> fromCurrency;
    @FXML private ChoiceBox<String> toCurrency;
    @FXML private Spinner<Double> amountSpinner;
    @FXML private Label resultLabel;

    private final Map<String, Double> rates = new HashMap<>();

    @FXML
    public void initialize() {
        fromCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");
        toCurrency.getItems().addAll("GEL", "USD", "EUR", "GBP");

        fromCurrency.setValue("GEL");
        toCurrency.setValue("USD");

        SpinnerValueFactory.DoubleSpinnerValueFactory valueFactory =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 100000, 100, 1);
        valueFactory.setConverter(new StringConverter<>() {
            @Override public String toString(Double value) {
                return String.format("%.2f", value);
            }
            @Override public Double fromString(String s) {
                try {
                    return Double.parseDouble(s);
                } catch (NumberFormatException e) {
                    return 0.0;
                }
            }
        });
        amountSpinner.setValueFactory(valueFactory);

        initRates();
        addListeners();
        updateResult();
    }

    private void initRates() {
        rates.put("GEL", 1.0);
        rates.put("USD", 2.7);
        rates.put("EUR", 2.9);
        rates.put("GBP", 3.2);
    }

    private void addListeners() {
        fromCurrency.setOnAction(e -> updateResult());
        toCurrency.setOnAction(e -> updateResult());
        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> updateResult());
    }

    private void updateResult() {
        String from = fromCurrency.getValue();
        String to = toCurrency.getValue();
        Double amount = amountSpinner.getValue();

        if (from == null || to == null || amount == null) {
            resultLabel.setText("შეავსე ყველა ველი სწორად");
            return;
        }

        if (from.equals(to)) {
            resultLabel.setText(String.format("შედეგი: %.2f %s", amount, to));
            return;
        }

        double gelAmount = amount * rates.get(from);
        double converted = gelAmount / rates.get(to);

        resultLabel.setText(String.format("შედეგი: %.2f %s", converted, to));
    }
}
