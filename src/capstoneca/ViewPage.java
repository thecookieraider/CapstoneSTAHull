/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capstoneca;

import capstonezz.GUI.NavigationButton;
import capstonezz.NavigationModel;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;



/**
 *
 * @author ccallen0504
 */
public class ViewPage extends JPanel implements NavigationModel {
    private final int width;
    private final int height;
    private JToolBar toolBar;

    private NavigationButton forward;
    private NavigationButton backward;
    private Home homeButton;
    private EditButton editButton;

    private String displayString = "";
    
    public ViewPage(int width, int height, String display){
        this.width = width;
        this.height = height;
        displayString = display;
        
        init();
    }

    private void init(){
        toolBar = new JToolBar();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        toolBar.setBorderPainted(true);
        toolBar.setLayout(new FlowLayout());

        forward = new NavigationButton(NavigationButton.NavigationType.FORWARD,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        backward = new NavigationButton(NavigationButton.NavigationType.BACK,
        NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        homeButton = new Home(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        editButton = new EditButton(NavigationButton.getButtonWidth(width),
        NavigationButton.getButtonHeight(height));

        editButton.setBorderPainted(true);
        editButton.setFocusPainted(true);
        editButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        editButton.setToolTipText("Switch to edit mode");
        
        homeButton.setBorderPainted(true);
        homeButton.setFocusPainted(true);
        homeButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        toolBar.setLayout(new FlowLayout());
        toolBar.add(backward);
        toolBar.add(homeButton);
        toolBar.add(forward);
        toolBar.add(editButton);

        add(toolBar);
        
    }

    @Override
    public JButton getBackButton() {
        return backward;
    }

    @Override
    public JButton getForwardButton() {
        return forward;
    }

    @Override
    public JButton getHomeButton() {
        return homeButton;
    }

    public JButton getEditButton(){
        return editButton;
    }

    public void change(String string){
        displayString = string;
    }

    public String getString(){
        return displayString;
    }

}
    
