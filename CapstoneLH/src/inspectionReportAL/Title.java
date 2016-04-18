/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inspectionReportAL;

/**
 *
 * @author ACLeavitt0612
 */

import javax.swing.*;
import java.awt.*;

public class Title extends JPanel{
    
    private GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints;
    
    private JLabel header1 = new JLabel("Lee's Summit, Missouri Fire Department");
    private JLabel header2 = new JLabel("Inspection Report");
    private JLabel header3 = new JLabel("Phone: (816)969-1300");
    
    Title(){
        setLayout(layout);
        constraints = new GridBagConstraints();
        
        header1.setFont(new Font("Serif", Font.BOLD, 20));
        header2.setFont(new Font("Serif", Font.PLAIN,20));
        addComponent(header1, 0, 0, 1, 2);
        addComponent(header2, 2, 0, 1, 2);
        addComponent(header3, 4, 0, 1, 1);
        
        
    }
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component, constraints); //set constraints
        add(component);
    }
}
