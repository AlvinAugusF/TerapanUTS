package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPageCart {
    private int x ;
    private int y;
    @FXML
    Label HargaTotal;
    @FXML
    Label TotalItem;
    private int a  = 0;
    private int tots;
    public ScrollPane ScPane;
    public VBox vboxProduct;

    public void GetA(int a){

    }
    public void SetItem (int total){
        y = total;
        System.out.println(y);
        TotalItem.setText(String.valueOf(y));
        System.out.println(TotalItem);
        x = y * 100000 ;
        HargaTotal.setText(String.valueOf(x));
        System.out.println(HargaTotal);
    }
    public void returnHome(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PagePembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }

}
