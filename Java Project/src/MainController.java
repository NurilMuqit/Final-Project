import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
    @FXML
    private RadioButton B1, B2, B3, B4, B5, B6;
    @FXML
    private Button Checkout;
    @FXML
    private Label LabelHarga, LabelNama;
    @FXML
    private ImageView ImageRamen;

    Image Ramen1 = new Image (getClass().getResourceAsStream("Sukume Ramen.jpg"));
    Image Ramen2 = new Image (getClass().getResourceAsStream("Hakata Ramen.jpg"));
    Image Ramen3 = new Image (getClass().getResourceAsStream("Sapporo Miso.jpg"));
    Image Ramen4 = new Image (getClass().getResourceAsStream("Kitakata Ramen.jpg"));
    Image Ramen5 = new Image (getClass().getResourceAsStream("Hakodate Ramen.jpg"));
    Image Ramen6 = new Image (getClass().getResourceAsStream("Wakayama Ramen.jpg"));

    public void UserCheckOut(ActionEvent event)throws IOException{
        
        ToggleGroup group = new ToggleGroup();
        B1.setToggleGroup(group);
        B2.setToggleGroup(group);
        B3.setToggleGroup(group);
        B4.setToggleGroup(group);
        B5.setToggleGroup(group);
        B6.setToggleGroup(group);

        if(B1.isSelected()){
            LabelHarga.setText("30.000");
            LabelNama.setText("Sukume Ramen");
            ImageRamen.setImage(Ramen1);
        }
        else if(B2.isSelected()){
            LabelHarga.setText("29.000");
            LabelNama.setText("Hakata Ramen");
            ImageRamen.setImage(Ramen2);
        }
        else if(B3.isSelected()){
            LabelHarga.setText("28.000");
            LabelNama.setText("Sapporo Miso");
            ImageRamen.setImage(Ramen3);
        }
        else if(B4.isSelected()){
            LabelHarga.setText("35.000");
            LabelNama.setText("Kitakata Ramen");
            ImageRamen.setImage(Ramen4);
        }
        else if(B5.isSelected()){
            LabelHarga.setText("30.000");
            LabelNama.setText("Hakodate Ramen");
            ImageRamen.setImage(Ramen5);
        }
        else if(B6.isSelected()){
            LabelHarga.setText("33.000");
            LabelNama.setText("Wakayama Ramen");
            ImageRamen.setImage(Ramen6);
        }
        
    }  
    public void Change(ActionEvent event)throws IOException{
        Main scene = new Main();
        scene.changeScene("Pay.fxml");
    }
}
