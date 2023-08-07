package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLoginUtama {
    @FXML
    Button Button1;
    @FXML
    Button Button2;

    // pindah ke login pembeli
    public void pembeli(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/LoginPembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    // pindah ke login penjual
    public void penjual(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/LoginPenjual.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
