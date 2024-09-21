import javax.swing.*;

public class Food { // file to have all the food options in
        //creates method for a specific food button in POSProject.java
        public JButton createFoodButton(String foodName) {
            JButton createFoodButton = new JButton(foodName);
             // action listeners here for what each button made should do (DRY Principle)
            return createFoodButton;

    }
}


// create action listeners that add food totals to total cost and display the price on the left along with the food item name.
// create a menu once a button is clicked to add the food into
// get math to correspond correctly
// most likely move total cost to a seperate source file
// rest to be done is TBD
//