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
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setSize(2560, 1440); //resolution of my main monitor
        mainframe.setVisible(true);
        JPanel totalCostPanel = totalCost(); // creates total costpanel to mainWindow
        mainframe.add(totalCostPanel, BorderLayout.EAST); // sets the totalcostPanel to the right side of the GUI

        // create buttons with Food File
        Food foodButton = new Food();
        JButton classicsFood = foodButton.createFoodButton("Classics");
        JButton uniqueFood = foodButton.createFoodButton("Unique Food");

        //create a panel for foods to be in
        JPanel foodPanel = new JPanel();
        foodPanel.setBorder(BorderFactory.createTitledBorder("Food List"));
        foodPanel.add(classicsFood);
        foodPanel.add(uniqueFood);

        mainframe.add(foodPanel, BorderLayout.CENTER);

    }

    // create a window displaying the total cost, this will have a subtotal and implement the state tax in florida as two seperate values. then adds the both to show "amount due"
    static JPanel totalCost() {
        //create variables to do increment when POS is being used
        double subtotalCost = 0.00;
        double taxCost = 0.00;
        double totalDue = 0.00; // wanted to do amount do but interferes with JLabel within this method

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Total Cost"));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // labels within the panel, sets the cost to only 2 decimal places
        JLabel subtotalLabel = new JLabel(String.format("Subtotal: $%.2f", subtotalCost));
        JLabel taxLabel = new JLabel(String.format("Tax: $%.2f", taxCost));
        JLabel amountDue = new JLabel(String.format("Amount Due: $%.2f", totalDue));

        //aligns the numbers at the bottom right of the screen

        panel.add(subtotalLabel);
        panel.add(taxLabel);
        panel.add(amountDue);

        return panel;
    }


    public static void main(String[] args) {
    mainWindow();
    }
}