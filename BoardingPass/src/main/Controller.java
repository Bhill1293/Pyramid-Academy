package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import person.Person;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    Person newCustomer = new Person();


    //Person data for ticket
    @FXML
    public void nameSubmit(ActionEvent e){
        newCustomer.setName(String.valueOf(nameField));
        System.out.println(newCustomer.getName());

    }
}
