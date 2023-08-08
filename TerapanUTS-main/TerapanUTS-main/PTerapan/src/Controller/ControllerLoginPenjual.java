package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerLoginPenjual {
    @FXML
    Button Button7;
    @FXML
    TextField Text2;
    @FXML
    PasswordField pass;

    // mengambil nama dan password serta pindah ke hal pemilik
    public void login(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PagePenjual.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ControllerPagePenjual CP = loader.getController();
        CP.isiName(Text2.getText());
        CP.isiPass(pass.getText());
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
