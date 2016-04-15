/*
 * This class creates the the search area for the homescreen
 */
package capstoneal.GUI;

/**
 *
 * @author Austin Leavitt
 * 04/06/2016
 * 
 */

import capstonezz.CapstoneConstants;
import capstonezz.GUI.SearchBox;
import capstonezz.LinkerModel;
import javax.swing.*;
import java.awt.*;


public class Search extends JPanel implements LinkerModel{
    
    public final SearchBox searchBar = new SearchBox("Search...", 30, 5, false); // create search field
    public final JButton searchButton = new JButton("GO"); // creates search button
    
    private final GridBagConstraints constraints = new GridBagConstraints();
    
    // making check boxes
    private final JCheckBox nwcb = new JCheckBox("NW");
    private final JCheckBox necb = new JCheckBox("NE");
    private final JCheckBox swcb = new JCheckBox("SW");
    private final JCheckBox secb = new JCheckBox("SE");
        
    public Search(){
        setBackground(CapstoneConstants.PANEL_BG);
        setLayout(new GridBagLayout()); // sets the layout to GridLayout
        
        searchButton.setContentAreaFilled(false);
        nwcb.setBackground(CapstoneConstants.PANEL_BG);
        necb.setBackground(CapstoneConstants.PANEL_BG);
        swcb.setBackground(CapstoneConstants.PANEL_BG);
        secb.setBackground(CapstoneConstants.PANEL_BG);
        // adding check boxes to panel
        addComponent(nwcb, 0, 0, 1, 1);
        addComponent(necb, 0, 1, 1, 1);
        addComponent(swcb, 0, 2, 1, 1);
        addComponent(secb, 0, 3, 1, 1);
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1000;
        addComponent(searchBar, 0, 4, 1, 1); // add search bar text field
        constraints.weightx = 0;
        addComponent(searchButton, 0, 6, 1, 1); // add search button
        
    } // end of constructor
    
    private void addComponent(Component component, int row, int column, int width, int height)
    {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        ((GridBagLayout)getLayout()).setConstraints(component, constraints); //set constraints
        add(component);
    }
        
    @Override
    public JTextField getLinkingComponent() {
        return searchBar;
    }
    
    public JButton getGoButton(){
        return searchButton;
    }
} // end of class
