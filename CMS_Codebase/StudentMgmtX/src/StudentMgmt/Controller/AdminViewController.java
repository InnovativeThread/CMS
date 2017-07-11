/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentMgmt.Controller;

import java.awt.event.MouseEvent;
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
public class AdminViewController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
     TreeView <String> treeView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         TreeItem<String> rootItem = new TreeItem<String> ("CMS");
        rootItem.setExpanded(true);
        
        TreeItem<String> nodeA = new TreeItem<String> ("Student");
        TreeItem<String> nodeB = new TreeItem<String> ("Faculty");
        TreeItem<String> nodeC = new TreeItem<String> ("Batch");
        TreeItem<String> nodeD = new TreeItem<String> ("Course");
        TreeItem<String> nodeE = new TreeItem<String> ("Payment");
        
        rootItem.getChildren().add(nodeA);
        rootItem.getChildren().add(nodeB);
        rootItem.getChildren().add(nodeC);
        rootItem.getChildren().add(nodeD);
        rootItem.getChildren().add(nodeE);
        
        
        TreeItem<String> nodeA1= new TreeItem<String> ("Add Student");
        TreeItem<String> nodeA2= new TreeItem<String> ("Update Student");
        TreeItem<String> nodeA3= new TreeItem<String> ("Delete Student");

        nodeA.getChildren().addAll(nodeA1,nodeA2,nodeA3);

        TreeItem<String> nodeB1= new TreeItem<String> ("Add Faculty");
        TreeItem<String> nodeB2= new TreeItem<String> ("Update Faculty");
        
        nodeB.getChildren().addAll(nodeB1,nodeB2);
        
        TreeItem<String> nodeC1= new TreeItem<String> ("Add Course");
        TreeItem<String> nodeC2= new TreeItem<String> ("Update Course");

        nodeC.getChildren().addAll(nodeC1,nodeC2);
        
        TreeItem<String> nodeD1= new TreeItem<String> ("Add  Batch");
        TreeItem<String> nodeD2= new TreeItem<String> ("Update Faculty");

        nodeD.getChildren().addAll(nodeD1,nodeD2);
        
        TreeItem<String> nodeE1= new TreeItem<String> ("Add Payment");
        TreeItem<String> nodeE2= new TreeItem<String> ("Update Payment");

        nodeE.getChildren().addAll(nodeE1,nodeE2);
        
        treeView.setRoot(rootItem);
    }   
    
    public void mouseClick(MouseEvent mouseevent)
    {
        if(mouseevent.getClickCount()==2)
        {
            TreeItem<String> item =treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }
    
}
