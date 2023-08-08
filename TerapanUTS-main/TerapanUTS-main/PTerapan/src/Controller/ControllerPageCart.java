package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPageCart {
    private int a  = 0;
    public ScrollPane ScPane;
    public VBox vboxProduct;


    public void initialize(){
        vboxProduct = new VBox();
        ScPane.setContent(vboxProduct);
    }
    public void GetA(int a){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/ItemCartPage.fxml"));
        if (a == 1){
            try {
                Parent p = loader.load();
                ControllerAddCart e = loader.getController();
                vboxProduct.getChildren().add(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{

        }
    }
    public void resi(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PageResi.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
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
