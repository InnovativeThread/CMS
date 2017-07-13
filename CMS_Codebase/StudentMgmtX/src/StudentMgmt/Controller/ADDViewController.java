/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMgmt.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author Ranoji
 */
public class ADDViewController implements Initializable {

        /**
     * Initializes the controller class.
     */
    
     @FXML
     TreeView <String> treeView;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         TreeItem<String> rootItem = new TreeItem<String> ("Root");
        rootItem.setExpanded(true);
        
        TreeItem<String> nodeA = new TreeItem<String> ("nodeA");
        TreeItem<String> nodeB = new TreeItem<String> ("nodeB");
        TreeItem<String> nodeC = new TreeItem<String> ("nodeC");
        rootItem.getChildren().add(nodeA);
        rootItem.getChildren().add(nodeB);
        rootItem.getChildren().add(nodeC);
        treeView.setRoot(rootItem);
    }    
    
}
