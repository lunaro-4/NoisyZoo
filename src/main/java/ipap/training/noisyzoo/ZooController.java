package ipap.training.noisyzoo;

import ipap.training.noisyzoo.Animals.Animals;
import ipap.training.noisyzoo.Animals.Raven;
import ipap.training.noisyzoo.Animals.Wolf;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ZooController {

    private Animals selectedAnimal = Animals.Wolf;

    @FXML
    private ToggleGroup animals;

    @FXML
    private RadioButton raven;

    @FXML
    private Label sayField;

    @FXML
    private RadioButton wolf;

    @FXML
    void sayAction(ActionEvent event) {
        String s = "Animal not resolved";
        switch (selectedAnimal){
            case Wolf -> s = new Wolf().say();
            case Raven -> s = new Raven().say();
        }
        sayField.setText(s);
    }

    @FXML
    void changeAnimal(ActionEvent event){
        RadioButton selected = (RadioButton) event.getSource();
        if (selected== wolf)
            selectedAnimal = Animals.Wolf;
        if (selected==raven)
            selectedAnimal=Animals.Raven;
        sayField.setText("");

    }
}