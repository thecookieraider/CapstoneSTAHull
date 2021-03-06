package capstoneca.SFLossReduction;

/**
 *
 * @author ccallen0504
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

public class sFLRTType extends JPanel{
    
    //Title
    
    
    //making the check boxes 
    // row one
    private final JCheckBox cB1 = new JCheckBox(" Occupancy ");
    private final JCheckBox cB2 = new JCheckBox(" Life Safety ");
    private final JCheckBox cB3 = new JCheckBox(" Sprinkler ");
    private final JCheckBox cB5 = new JCheckBox(" Complaint ");
    private final JCheckBox cB6 = new JCheckBox(" Explosive Storage ");
    private final JCheckBox cB4 = new JCheckBox(" Hazardous Materials Permint ");
    
    
    // row two
    JRadioButton semi = new JRadioButton("Semi - Annual ");
    JRadioButton annual = new JRadioButton("Annual");
    private final JCheckBox cB7 = new JCheckBox(" UST ");
    private final JCheckBox cB8 = new JCheckBox(" Post-Incident ");
    private final JCheckBox cB9 = new JCheckBox(" Open Burning ");
    private final JCheckBox cB10 = new JCheckBox(" Other ");
    
    
    public sFLRTType() {
        GridBagConstraints c = new GridBagConstraints();
        setLayout(new GridBagLayout());
        
        cB1.setName("30");
        cB2.setName("31");
        cB3.setName("32");
        cB4.setName("33");
        cB5.setName("34");
        cB6.setName("35");
        cB7.setName("36");
        cB8.setName("37");
        cB9.setName("38");
        cB10.setName("39");
        semi.setName("40");
        annual.setName("41");
        
        c.fill = GridBagConstraints.HORIZONTAL;
        // row one
        c.gridy = 0;
        
        c.gridx = 0;
        add(cB1, c);
        c.gridx = 1;
        add(cB2, c);
        c.gridx = 2;
        add(cB3, c);
        c.gridx = 3;
        add(cB4, c);
        c.gridx = 4;
        add(cB5, c);
        
        c.gridy = 1;
        
        c.gridx = 0;
        add(cB6, c);
        c.gridx = 1;
        add(cB7, c);
        c.gridx = 2;
        add(cB8, c);
        c.gridx = 3;
        add(cB9, c);
        c.gridx = 4;
        add(cB10, c);
        
        //creates the radio buttons to a group
        final ButtonGroup group = new ButtonGroup();
        group.add(semi);
        group.add(annual);
        c.gridx = 5;
        add(semi, c);
        c.gridx = 6;
        add(annual, c);
    }
}
