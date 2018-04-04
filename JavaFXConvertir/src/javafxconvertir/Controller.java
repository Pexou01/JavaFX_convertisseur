
package javafxconvertir;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrateur
 */
public class Controller {

    @FXML TextField montant;
    @FXML TextField convertion;
    
    public void onClick(ActionEvent event){
        
        convertion.setText(String.valueOf(Double.valueOf(montant.getText())*1.23));
        
    }
    }
    

