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

import javax.swing.JFrame;

public class PFNATest {
    
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PFNA pfna = new PFNA("text");
        ServiceDate date = new ServiceDate("insert text here");
        
        frame.add(date);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
