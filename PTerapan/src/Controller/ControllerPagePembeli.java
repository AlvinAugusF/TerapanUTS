package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerPagePembeli {

    public ScrollPane ScPane;
    private int noProduct = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    public VBox vboxProduct;

    public void initialize(){
        vboxProduct = new VBox();
        ScPane.setContent(vboxProduct);

    }

    public void Cart(ActionEvent ex) throws IOException {
        Stage new_stage= new Stage();
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/UI/PageCart.fxml"));
        Parent root = loader.load();
        Scene new_scene = new Scene(root);
        new_stage.setScene(new_scene);
        new_stage.show();
        ((Node) ex.getSource()).getScene().getWindow().hide();
    }
    public void addProduct(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/AddProduct.fxml"));
        try {
            Parent p = loader.load();
            ControllerAddProduct e = loader.getController();
            e.setLabel("Product"+ noProduct);
            e.setNo(noProduct++);
            vboxProduct.getChildren().add(p);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void addHeadset(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/AddHeadset.fxml"));
        if (x == 0) {
            try {
                Parent p = loader.load();
                ControllerAddHeadset e = loader.getController();
                e.setLabel("Headset Gaming");
                e.setNo(x++);
                vboxProduct.getChildren().add(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{

        }
    }
    public void addMouse(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/AddProduct.fxml"));
        if(y == 0) {
            try {
                Parent p = loader.load();
                ControllerAddProduct e = loader.getController();
                e.setLabel("Mouse Gaming");
                e.setNo(y++);
                vboxProduct.getChildren().add(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void addKeyboard(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/UI/AddProduct.fxml"));
        if (z == 0) {
            try {
                Parent p = loader.load();
                ControllerAddProduct e = loader.getController();
                e.setLabel("Keyboard Gaming");
                e.setNo(z++);
                vboxProduct.getChildren().add(p);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
