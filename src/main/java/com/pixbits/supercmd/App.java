package com.pixbits.supercmd;

import javax.swing.JFrame;

import com.pixbits.supercmd.ui.ConsolePanel;
import com.pixbits.supercmd.ui.UIUtils;
import com.pixbits.supercmd.ui.WrapperFrame;

/**
 * Hello world!
 *
 */

public class App 
{
  public static void main( String[] args )
  {
    WrapperFrame<ConsolePanel> frame = UIUtils.buildFrame(new ConsolePanel(25, 80), "Console");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
