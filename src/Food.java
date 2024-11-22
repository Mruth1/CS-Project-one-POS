import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class Food {
    // Method to create food buttons
    public JButton createFoodButton(String foodName) {
        JButton foodButton = new JButton(foodName); // Create a button with the food name

        // adds action listener to handle button clicks
        foodButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openButton(foodName); // opens a window within foodname
            }
        });

        return foodButton;
    }

    // Opens a new window with buttons when a food item is clicked
    private void openButton(String foodName) {
        JFrame frame = new JFrame(foodName); // The new window title is the food name
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the new window

        // label showing which food was selected
        JLabel foodInfoLabel = new JLabel("Selected: " + foodName, SwingConstants.CENTER);
        frame.add(foodInfoLabel, BorderLayout.NORTH);

        // Create buttons for the new window
        JButton addToCartButton = new JButton("Add to Cart");
        JButton removeButton = new JButton("Remove from Cart");
        JButton backButton = new JButton("Back");

        // Add action listeners for each button
        addToCartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to add item to cart (for now, show message)
                JOptionPane.showMessageDialog(frame, foodName + " added to cart!");
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add functionality to remove item from cart (for now, show message)
                JOptionPane.showMessageDialog(frame, foodName + " removed from cart!");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the new window and go back
            }
        });

        // Add buttons to the frame in a panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addToCartButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(backButton);

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true); // Display the new window
    }
}


// create action listeners that add food totals to total cost and display the price on the left along with the food item name.
// create a menu once a button is clicked to add the food into
// get math to correspond correctly
// most likely move total cost to a seperate source file
// rest to be done is TBD
//