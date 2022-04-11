/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import Modelo.Operaciones;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author ivanm
 */
public class FXMLCalculadoraController implements Initializable {

    @FXML
    private TextField TFOperador1;
    @FXML
    private TextField TFOperador2;
    @FXML
    private TextField TFResultado;
    @FXML
    private Button BTNOperar;
    @FXML
    private RadioButton RSuma;
    @FXML
    private ToggleGroup grupoCuenta;
    @FXML
    private RadioButton RDivision;
    @FXML
    private RadioButton RResta;
    @FXML
    private RadioButton RMultiplicacion;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void HandlerOperar(ActionEvent event) {
        try{
        int num1 = Integer.parseInt(this.TFOperador1.getText());
        int num2 = Integer.parseInt(this.TFOperador2.getText());

        Operaciones O = new Operaciones(num1, num2);

        if(RSuma.isSelected()){
        this.TFResultado.setText(String.valueOf(O.Suma()));}
        else if(RResta.isSelected()){
        this.TFResultado.setText(String.valueOf(O.Resta()));}
        else if(RMultiplicacion.isSelected()){
        this.TFResultado.setText(String.valueOf(O.Multiplicacion()));}
        else if(RDivision.isSelected()){
        this.TFResultado.setText(String.valueOf(O.Division()));}
    }catch(NumberFormatException e){

    Alert A = new Alert(Alert.AlertType.ERROR);

    A.setHeaderText(null);
    A.setTitle("Error");
    A.setContentText("Introducir dos números enteros");
    A.showAndWait();
    }
 }

    @FXML
    private void HandlerResultado(ActionEvent event) {
    }
}