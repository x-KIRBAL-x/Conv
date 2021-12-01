package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConvertController {

    @FXML
    private Label fx_ruppe;
    @FXML
    private Label fx_pound;
    @FXML
    private Label fx_yen;
    @FXML
    private Label fx_dollar;
    @FXML
    private Label fx_euro;
    @FXML
    private Label fx_ringgit;
    @FXML
    private TextField fx_currency;
    @FXML
    private TextField fx_amount;

    @FXML
    private Label fx_hiba_currency;

    @FXML
    private Label fx_hibaamount;


    Double amount;
    int code;
    Double ruppe;
    Double pound;
    Double yen;
    Double ringgit;
    Double dollar;
    Double euro;
    Boolean ok = true;


    public void Convert(ActionEvent actionEvent) {
        ok=true;
         amount = Double.parseDouble(fx_amount.getText());
         if(amount<0) {
             ok = false;
            fx_hibaamount.setText("Szám nem lehet negatív!");
         }
         code = Integer.parseInt(fx_currency.getText());
         if (code<1 || code>6) {
            fx_hiba_currency.setText("1 és 6 között lehet!");
             ok = false;
         }
         ruppe = amount;
         pound = amount;
         yen = amount;
         ringgit = amount;
         dollar = amount;
         euro = amount;
        if(ok) {
            if (code == 1) {

                dollar = amount / 70;

                pound = amount / 88;

                euro = amount / 80;

                yen = amount / 0.63;

                ringgit = amount / 16;
            } else if (code == 2) {
                // For Dollar Conversion

                ruppe = amount * 70;

                pound = amount * 0.78;

                euro = amount * 0.87;

                yen = amount * 111.087;

                ringgit = amount * 4.17;
            } else if (code == 3) {
                // For Pound Conversion

                ruppe = amount * 88;

                dollar = amount * 1.26;

                euro = amount * 1.10;

                yen = amount * 140.93;

                ringgit = amount * 5.29;
            } else if (code == 4) {
                // For Euro Conversion

                ruppe = amount * 80;

                dollar = amount * 1.14;

                pound = amount * 0.90;

                yen = amount * 127.32;

                ringgit = amount * 4.78;
            } else if (code == 5) {

                // For Yen Conversion

                ruppe = amount * 0.63;

                dollar = amount * 0.008;

                pound = amount * 0.007;

                euro = amount * 0.007;

                ringgit = amount * 0.037;
            } else if (code == 6) {
                // For Ringgit Conversion

                ruppe = amount * 16.8;

                dollar = amount * 0.239;

                pound = amount * 0.188;

                euro = amount * 0.209;

                yen = amount * 26.63;
            }

            fx_ruppe.setText(ruppe + "");
            fx_pound.setText(pound + "");
            fx_yen.setText(yen + "");
            fx_dollar.setText(dollar + "");
            fx_euro.setText(euro + "");
            fx_ringgit.setText(ringgit + "");
            fx_hiba_currency.setText("");
            fx_hibaamount.setText("");
        }else {
            fx_ruppe.setText("-");
            fx_pound.setText("-");
            fx_yen.setText("-");
            fx_dollar.setText("-");
            fx_euro.setText("-");
            fx_ringgit.setText("-");

        }
    }
}
