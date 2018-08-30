package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Controller {

    //Code for hash selection upon signup, non-functioning

    /*@FXML
    public ChoiceBox<String> hashSelect;

    ObservableList<String> hashSelectList = FXCollections.
            observableArrayList("MD5", "SHA-1", "SHA-128", "SHA-256", "SHA-384", "SHA-512");

    @FXML
    public void initializeHash(){
        hashSelect.setValue("MD5");
        hashSelect.setItems(hashSelectList);
    }*/

    @FXML
    TextField email, username, password;
    public void touchLogin(ActionEvent actionEvent) {
        Model model = new Model();
        String hashPassword = model.generatePasswordHash(password.getText());
        System.out.println(hashPassword);
    }
}
