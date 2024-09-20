/* Program prologue:
/// Essentially this is my first take at any "major" project I wanted to work on. This is going to be somewhat of a small / medium sized project to where I want to make a POS (point of sale) system
/// that uses make pricing for items created within the code, have a java swing gui to navigate through the system and will calculate the total cost with taxes based on the state I reside in (FL)
/// With this being said, my code to whomever see's this isnt perfect, but its a swing (no pun intended) at my first project.
Date Started: 9/19/24 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class POSProject {
    //creating a method that will hold all the buttons to access POS options
    static void mainWindow() {
        JFrame mainframe = new JFrame("POS System"); // the window name
        mainframe = new JFrame("POS System"); // sets the title of the main window
        mainframe.pack();
        mainframe.setSize(2560, 1440); //resolution of my main monitor
        mainframe.setVisible(true);

        JPanel classicsPanel = classicsPanel(); //pulls "classicsPanel" from classicsPanel method
        mainframe.add(classicsPanel, BorderLayout.CENTER);
        JPanel totalCostPanel = totalCost();
        mainframe.add(totalCostPanel, BorderLayout.EAST);
    }
    //creates a useable button for the "Classic" Food option within the POS
    static JPanel classicsPanel() {
        JPanel classicsPanel = new JPanel();
        classicsPanel.setBorder(BorderFactory.createTitledBorder("Classics"));
        classicsPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        classicsPanel.setLayout(new BoxLayout(classicsPanel, BoxLayout.Y_AXIS));
        classicsPanel.setVisible(true);
        JButton classicsItemButton = new JButton("Classics");
        classicsPanel.add(classicsItemButton);
        return classicsPanel;
    }
    static JPanel totalCost() {
        JPanel totalCostPanel = new JPanel();
        totalCostPanel.setBorder(BorderFactory.createTitledBorder("Total Cost"));
        totalCostPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        totalCostPanel.setLayout(new BoxLayout(totalCostPanel, BoxLayout.Y_AXIS));
        totalCostPanel.setVisible(true);
        JButton totalCostItemButton = new JButton("Total Cost"); // this needs to be changed to be not be a button, more a less a window, within the window
        totalCostPanel.add(totalCostItemButton);
        return totalCostPanel;
    }


    public static void main(String[] args) {
    mainWindow();
    }
}