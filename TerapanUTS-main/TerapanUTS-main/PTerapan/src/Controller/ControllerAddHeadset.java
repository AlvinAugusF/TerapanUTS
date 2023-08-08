package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ControllerAddHeadset {
    private int a = 0;
    private Integer Jumlah = 0;
    @FXML
    Label JumlahItem;
    @FXML
    Button addHeadset;
    @FXML
    private void Added(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/PageCart.fxml"));
        Parent root = loader.load();
        ControllerPageCart e = loader.getController();
        if (e != null) {
            addHeadset.setText("Added!");
            a = 1;
            e.GetA(a);
        } else {
            // Handle the case when the controller is null
            // For example, show an error message or log a warning.
        }
    }

    public Label NamaProduct;
    private int no;

    public void setLabel(String s){

        NamaProduct.setText(s);
    }
    public void setNo(int n){
        no = n;
    }

    public void tambahItem(ActionEvent ex){
        Jumlah = Jumlah + 1;
        String Angka = Jumlah.toString();
        JumlahItem.setText(Angka);
    }
    public void kurangItem(ActionEvent ex) {
        if (Jumlah != 0) {
            Jumlah = Jumlah - 1;
            String Angka = Jumlah.toString();
            JumlahItem.setText(Angka);
        }else {

        }
    }
//
}
