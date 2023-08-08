package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPasswordPenjual {

    @FXML
    Label Pass;
    @FXML
    TextField Text;
    public String pass;
    public String Name;

    public void isiPass(String Password){
        Pass.setText(Password);
    }
    public void SetPassword(ActionEvent ex){
        Pass.setText(Text.getText());
        pass = (Text.getText());
    }
    public void isiName(String Nama){
        Name = Nama;
    }
    public void Back(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/AkunPenjual.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ControlerAkunPenjual ca = loader.getController();
        ca.isiPass(pass);
        ca.isiName(Name);
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
}
