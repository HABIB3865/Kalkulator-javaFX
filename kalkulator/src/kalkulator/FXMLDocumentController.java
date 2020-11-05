/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author habib
 */
public class FXMLDocumentController implements Initializable {
    
       
    
    @FXML
    private Button satu;

    @FXML
    private Button dua;

    @FXML
    private Button tiga;

    @FXML
    private Button tambah;

    @FXML
    private Button empat;

    @FXML
    private Button lima;

    @FXML
    private Button enam;

    @FXML
    private Button kurang;

    @FXML
    private Button tuju;

    @FXML
    private Button delapan;

    @FXML
    private Button sembilan;

    @FXML
    private Button kali;

    @FXML
    private Button nol;

    @FXML
    private Button enter;

    @FXML
    private Button clear;

    @FXML
    private Button bagi;

    @FXML
    private TextField display;
     private int angka1 = 0;
    private String operasi = "netral";
    private int angka2 = 0;
    private int hasil;

    @FXML
    void handleButtonAction(ActionEvent event) {
            if(event.getSource() == satu)
            {
                display.setText(display.getText() + "1");
            }
            else if(event.getSource() == dua)
            {
                display.setText(display.getText() + "2");
            }
            else if(event.getSource() == tiga)
            {
                display.setText(display.getText() + "3");
            }
            else if(event.getSource() == empat)
            {
                display.setText(display.getText() + "4");
            }
            else if(event.getSource() == lima)
            {
                display.setText(display.getText() + "5");
            }
            else if(event.getSource() == enam)
            {
                display.setText(display.getText() + "6");
            }
            else if(event.getSource() == tuju)
            {
                display.setText(display.getText() + "7");
            }
            else if(event.getSource() == delapan)
            {
                display.setText(display.getText() + "8");
            }
            else if(event.getSource() == sembilan)
            {
                display.setText(display.getText() + "9");
            }
            else if(event.getSource() == nol)
            {
                display.setText(display.getText() + "0");
            }
            else if(event.getSource() == clear)
            {
                display.setText("");
            }
            else if (event.getSource() == tambah) {
                angka1 = Integer.parseInt(display.getText());
                operasi = "plus";
                display.setText("");
            }
            else if (event.getSource() == bagi) {
                angka1 = Integer.parseInt(display.getText());
                operasi = "bagi";
                display.setText("");
            }
            else if (event.getSource() == kurang) {
                angka1 = Integer.parseInt(display.getText());
                operasi = "minus";
                display.setText("");
                
                }else if (event.getSource() == kali) {
                angka1 = Integer.parseInt(display.getText());
                operasi = "kali";
                display.setText("");
                }else if (event.getSource() == enter) {
                angka2 = Integer.parseInt(display.getText());
                if (operasi.equals("plus")) {
                hasil = angka1 + angka2;
                }
                if (operasi.equals("minus")) {
                hasil = angka1 - angka2;
                }
                if (operasi.equals("kali")) {
                hasil = angka1 * angka2;
                }
                if (operasi.equals("bagi")) {
                hasil = angka1 / angka2;
                }
                display.setText(String.valueOf(hasil));
                operasi = "netral";
                }
                
            }      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
