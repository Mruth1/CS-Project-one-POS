/* Program prologue:
/// Essentially this is my first take at any "major" project I wanted to work on. This is going to be somewhat of a small / medium sized project to where I want to make a POS (point of sale) system
/// that uses make pricing for items created within the code, have a java swing gui to navigate through the system and will calculate the total cost with taxes based on the state I reside in (FL)
/// With this being said, my code to whomever see's this isnt perfect, but its a swing (no pun intended) at my first project.
Date Started: 9/19/24 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POSProject {
    public static void main(String[] args) {
        // create a JFRAME and set the properties of it
        JFrame frame = new JFrame("Gui Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
        int[] amountOfClicks = {0};
        JButton button = new JButton("Press: "+amountOfClicks) ;
        frame.getContentPane().add(button); // adds button to content pane of frame

        button.addActionListener(new ActionListener() { // Action Listener respondes to the button when it is clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                amountOfClicks[0]++;

                button.setText("Press: "+amountOfClicks[0]) ;
            }
        });

    }
}