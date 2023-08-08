package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControlerAkunPembeli {
    public String pass;
    public String Name;

    public void Password(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PasswordPembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ControllerPasswordPembeli ca = loader.getController();
        ca.isiPass(pass);
        ca.isiName(Name);
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void LogOut(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/LoginUtama.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void Back(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PagePembeli.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ControllerPagePembeli CP = loader.getController();
        CP.isiName(Name);
        CP.isiPass(pass);
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void isiPass(String Password){
        pass = Password;
    }
    public void isiName(String Nama){
        Name = Nama;
    }
}
