package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ControllerAddProduct {
    @FXML
    Button added;
    @FXML
    private void handleButtonClick(ActionEvent event){
        added.setText("Added!");
    }
    public Label NamaProduct;
    private int no;

    public void initialize(){
        added.setOnAction(this::handleButtonClick);
    }
    public void setLabel(String s){
        NamaProduct.setText(s);
    }
    public void setNo(int n){
        no = n;
    }

//
}
