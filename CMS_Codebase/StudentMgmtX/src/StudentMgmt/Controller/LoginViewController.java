/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMgmt.Controller;

import StudentMgmt.NewFXMain;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginViewController implements Initializable {

    @FXML
    private Label labelStatus;
    @FXML
    private TextField textFieldUN;
    @FXML
    private TextField textFieldPWD;
   
    
    public void login(ActionEvent ae) throws IOException
    {
        if(textFieldUN.getText().equals("user")&&textFieldPWD.getText().equals("123"))
        {
            labelStatus.setText("Valid User");
            NewFXMain nm=new NewFXMain();
        nm.showMainView();
               
        }
        else
        { 
            labelStatus.setText("Invalid User");
        }
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
