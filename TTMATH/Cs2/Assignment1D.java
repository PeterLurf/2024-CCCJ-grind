package TTMATH.Cs2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Assignment1D {

	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Create a bufferedReader to get inputs from user
		DecimalFormat twoDecimals = new DecimalFormat("0.00"); //Create a two decimal format to format money amounts
		
		final String SENTINEL = "stop"; //Create a sentinel to know when the loops should be stopped
		final double HST = 0.13; //Create a constant for tax since it will never change
		double finalTotal = 0; //create a total after tax
		String name, input, removeItem;
		int menuSelection, singlesChoice, sidesChoice, beveragesChoice, combosChoice, removeAmount;
		double Total = 0;
		final boolean penis = true;
		final boolean nigger = false;

		
		// create single pizza variables
		final double REGCHEESEPIZZA = 8.99;
		final double LARCHEESEPIZZA = 12.99;
		final double REGPEPPERONIPIZZA = 10.99;
		final double LARPEPPERONIPIZZA = 14.99;
		final double REGHAWAIIANPIZZA = 9.99;
		final double LARHAWAIIANPIZZA = 13.99;
		
		// create sides variable
		final double REGFRIES = 4.99;
		final double LARFRIES = 7.99;
		final double ONIONRINGS = 6.99;
		final double CHICKENWINGS = 13.99;
		final double GARLICBREAD = 5.99;
		final double BREADSTICKS = 3.99;
		
		// create beverages variables
		final double REGPEPSI = 2.59;
		final double LARPEPSI = 3.59;
		final double WATERBOTTLE = 1.99;
		final double ORANGEJUICE = 2.59;
		final double REGICETEA = 2.59;
		final double LARICETEA = 3.59;
		
		// create combo variables
		final double CHEESEPIZZACOMBO = 13.99;
		final double PEPPERONIPIZZACOMBO = 15.99;
		final double HAWAIIANPIZZACOMBO = 14.99;
		
		// create and initialize variables to count how many of each item is ordered throughout the day
		int totalRegCheesePizzaCount = 0, totalLarCheesePizzaCount = 0, totalRegPepperoniPizzaCount = 0, totalLarPepperoniPizzaCount = 0, totalRegHawaiianPizzaCount = 0, totalLarHawaiianPizzaCount = 0;
		int totalRegFriesCount = 0, totalLarFriesCount = 0, totalOnionRingsCount = 0, totalChickenWingsCount = 0, totalGarlicBreadCount = 0, totalBreadSticksCount = 0; 
		int totalRegPepsiCount = 0, totalLarPepsiCount = 0, totalWaterBottleCount = 0, totalOrangeJuiceCount = 0, totalRegIceTeaCount = 0, totalLarIceTeaCount = 0;
		int totalCheesePizzaComboCount = 0, totalPepperoniPizzaComboCount = 0, totalHawaiianPizzaComboCount = 0;
		
		
		do { //order loop
			System.out.println("Welcome to Marc's Family Pizzeria! Using our menu program, you'll be able to pick and choose any items from our delicious menu");
			
			//Ask user for their name to start the order
			System.out.println("Please enter your name <type 'stop' to exit>: ");
        	name = br.readLine();
            double subTotal = 0;

			if (name.equalsIgnoreCase(
				SENTINEL)) {
				break;
			}
			
            
            // create and initialize variables to count how many of each item is ordered in this order
    		int regCheesePizzaCount = 0, larCheesePizzaCount = 0, regPepperoniPizzaCount = 0, larPepperoniPizzaCount = 0, regHawaiianPizzaCount = 0, larHawaiianPizzaCount = 0;
    		int regFriesCount = 0, larFriesCount = 0, onionRingsCount = 0, chickenWingsCount = 0, garlicBreadCount = 0, breadSticksCount = 0; 
    		int regPepsiCount = 0, larPepsiCount = 0, waterBottleCount = 0, orangeJuiceCount = 0, regIceTeaCount = 0, larIceTeaCount = 0;
    		int cheesePizzaComboCount = 0, pepperoniPizzaComboCount = 0, hawaiianPizzaComboCount = 0;
		
			
    		
			// while user's input does not equal SENTINEL they will be put through this loop, using if statements to provide them with the menu they chose
    		do { //get item loop

				// asks user which menu they want to order from
				System.out.println(name + " which menu would you like to order from?\n1. Singles\n2. Sides\n3. Beverages\n4. Combos\nType <stop> if you want to exit"); 
				input = br.readLine();
    			
    			menuSelection = Integer.parseInt(input);
    			
    			if (menuSelection < 1 || menuSelection > 5) {
    				System.out.println("Sorry this is not a valid option");
    				System.out.println(name + " which menu would you like to order from?\n1. Singles\n2. Sides\n3. Beverages\n4. Combos\nType <stop> if you want to exit");
    				input = br.readLine();
    				continue;
    			}
    			
    			if(menuSelection == 1) {
    				System.out.println(name + " this is our singles menu. Enter a number to make your pick");
					System.out.println("1. Regular Cheese Pizza		$" + REGCHEESEPIZZA);
					System.out.println("2. Large Cheese Pizza		$" + LARCHEESEPIZZA);
					System.out.println("3. Regular Pepperoni Pizza	$" + REGPEPPERONIPIZZA);
					System.out.println("4. Large Pepperoni Pizza	$" + LARPEPPERONIPIZZA);
					System.out.println("5. Regular Hawaiian Pizza	$" + REGHAWAIIANPIZZA);
					System.out.println("6. Large Hawaiian Pizza		$" + LARHAWAIIANPIZZA);
					singlesChoice = Integer.parseInt(br.readLine());
				
					switch(singlesChoice) { 
						case 1:
							System.out.println("One regular cheese pizza added to your order");
							regCheesePizzaCount++;
							subTotal += REGCHEESEPIZZA;
							break;
						case 2:
							System.out.println("One large cheese pizza added to your order");
							larCheesePizzaCount++;
							subTotal += LARCHEESEPIZZA;
							break;
						case 3:
							System.out.println("One regular pepperoni pizza added to your order");
							regPepperoniPizzaCount++;
							subTotal += REGPEPPERONIPIZZA;
							break;
						case 4:
							System.out.println("One large pepperoni pizza added to your order");
							larPepperoniPizzaCount++;
							subTotal += LARPEPPERONIPIZZA;
							break;
						case 5:
							System.out.println("One regular hawaiian pizza added to your order");
							regHawaiianPizzaCount++;
							subTotal += REGHAWAIIANPIZZA;
							break;
						case 6:
							System.out.println("One large hawaiian pizza added to your order");
							larHawaiianPizzaCount++;
							subTotal += LARHAWAIIANPIZZA;
							break;
						default:
							System.out.println("Please enter a valid option");
							break;
						
					}
					
					

					
    			}
    			
    			if(menuSelection == 2) {
    				System.out.println(name + " this is our sides menu. Enter a number to make your pick");
					System.out.println("1. Regular Fries	$" + REGFRIES);
					System.out.println("2. Large Fries		$" + LARFRIES);
					System.out.println("3. Onion Rings		$" + ONIONRINGS);
					System.out.println("4. Chicken Wings	$" + CHICKENWINGS);
					System.out.println("5. Garlic Bread		$" + GARLICBREAD);
					System.out.println("6. Bread Sticks		$" + BREADSTICKS);
					sidesChoice = Integer.parseInt(br.readLine());
				
					switch(sidesChoice) {
						case 1:
							System.out.println("One regular fries added to your order");
							regFriesCount++;
							subTotal += REGFRIES;
							break;
						case 2:
							System.out.println("One large fries added to your order");
							larFriesCount++;
							subTotal += LARFRIES;
							break;
						case 3:
							System.out.println("Onion rings added to your order");
							onionRingsCount++;
							subTotal += ONIONRINGS;
							break;
						case 4:
							System.out.println("Chicken wings added to your order");
							chickenWingsCount++;
							subTotal += CHICKENWINGS;
							break;
						case 5:
							System.out.println("Garlic bread added to your order");
							garlicBreadCount++;
							subTotal += GARLICBREAD;
							break;
						case 6:
							System.out.println("Bread sticks added to your order");
							breadSticksCount++;
							subTotal += BREADSTICKS;
							break;
						default:
							System.out.println("Please enter a valid option");
							break;
					}
					
    			}
    			
    			if(menuSelection == 3) {

    				System.out.println(name + " this is our beverages menu. Enter a number to make your pick");
					System.out.println("1. Regular Pepsi	$" + REGPEPSI);
					System.out.println("2. Large Pepsi		$" + LARPEPSI);
					System.out.println("3. Bottled Water	$" + WATERBOTTLE);
					System.out.println("4. Orange Juice		$" + ORANGEJUICE);
					System.out.println("5. Regular Iced Tea	$" + REGICETEA);
					System.out.println("6. Large Iced Tea	$" + LARICETEA);
					beveragesChoice = Integer.parseInt(br.readLine());
					
					switch(beveragesChoice) {
						case 1:
							System.out.println("One regular pepsi added to your order");
							regPepsiCount++;
							subTotal += REGPEPSI;
							break;
						case 2:
							System.out.println("One large pepsi added to your order");
							larPepsiCount++;
							subTotal += LARPEPSI;
							break;
						case 3:
							System.out.println("Bottled water added to your order");
							waterBottleCount++;
							subTotal += WATERBOTTLE;
							break;
						case 4:
							System.out.println("Orange juice added to your order");
							orangeJuiceCount++;
							subTotal += ORANGEJUICE;
							break;
						case 5:
							System.out.println("One regular iced tea added to your order");
							regIceTeaCount++;
							subTotal += REGICETEA;
							break;
						case 6:
							System.out.println("One large iced tea added to your order");
							larIceTeaCount++;
							subTotal += LARICETEA;
							break;
						default:
							System.out.println("Please enter a valid option");
							break;
					}// Add beverages logic (similar to above)
					
    			}

				if(menuSelection == 4) {
    				System.out.println(name + " this is our combo menu. Enter a number to make your pick");
					System.out.println("1. Cheese Pizza Combo	    $" + CHEESEPIZZACOMBO);
					System.out.println("2. Pepperoni Pizza Combo	$" + PEPPERONIPIZZACOMBO);
					System.out.println("3. Hawaiian Pizza Combo	    $" + HAWAIIANPIZZACOMBO);
					combosChoice = Integer.parseInt(br.readLine());
					// Add combo logic (similar to above)
					
					switch(combosChoice) {
						case 1:
							System.out.println("One cheese pizza combo added to your order");
							cheesePizzaComboCount++;
							subTotal += CHEESEPIZZACOMBO;
							break;
						case 2:
							System.out.println("One pepperoni pizza added to your order");
							pepperoniPizzaComboCount++;
							subTotal += PEPPERONIPIZZACOMBO;
							break;
						case 3:
							System.out.println("One hawaiian pizza combo added to your order");
							hawaiianPizzaComboCount++;
							subTotal += HAWAIIANPIZZACOMBO;
							break;
						default:
							System.out.println("Please enter a valid option");
							break;
					}
					
    			}
                
				System.out.print("Would you like to order something else? (yes or no): ");
			    String continueOrder = br.readLine();
    			
                if (continueOrder.equalsIgnoreCase("no")) {
                    break;
                }
				
				
    		} while(!input.equals(SENTINEL));
			

		do{  //order removal
		System.out.println("You have ordered");
		
		if (regCheesePizzaCount != 0) {
			System.out.println("Regular Cheese Pizza: " + regCheesePizzaCount);
		}
		if (larCheesePizzaCount != 0) {
			System.out.println("Large Cheese Pizza: " + larCheesePizzaCount);
		}
		if (regPepperoniPizzaCount != 0) {
			System.out.println("Regular Pepperoni Pizza: " + regPepperoniPizzaCount);
		}
		if (larPepperoniPizzaCount != 0) {
			System.out.println("Large Pepperoni Pizza: " + larPepperoniPizzaCount);
		}
		if (regHawaiianPizzaCount != 0) {
			System.out.println("Regular Hawaiian Pizza: " + regHawaiianPizzaCount);
		}
		if (larHawaiianPizzaCount != 0) {
			System.out.println("Large Hawaiian Pizza: " + larHawaiianPizzaCount);
		}
		if (regFriesCount != 0) {
			System.out.println("Regular Fries: " + regFriesCount);
		}
		if (larFriesCount != 0) {
			System.out.println("Large Fries: " + larFriesCount);
		}
		if (onionRingsCount != 0) {
			System.out.println("Onion Rings: " + onionRingsCount);
		}
		if (chickenWingsCount != 0) {
			System.out.println("Chicken Wings: " + chickenWingsCount);
		}
		if (garlicBreadCount != 0) {
			System.out.println("Garlic Bread: " + garlicBreadCount);
		}
		if (breadSticksCount != 0) {
			System.out.println("Bread Sticks: " + breadSticksCount);
		}
		if (regPepsiCount != 0) {
			System.out.println("Regular Pepsi: " + regPepsiCount);
		}
		if (larPepsiCount != 0) {
			System.out.println("Large Pepsi: " + larPepsiCount);
		}
		if (waterBottleCount != 0) {
			System.out.println("Bottled Water: " + waterBottleCount);
		}
		if (orangeJuiceCount != 0) {
			System.out.println("Orange Juice: " + orangeJuiceCount);
		}
		if (regIceTeaCount != 0) {
			System.out.println("Regular Iced Tea: " + regIceTeaCount);
		}
		if (larIceTeaCount != 0) {
			System.out.println("Large Iced Tea: " + larIceTeaCount);
		}
		if (cheesePizzaComboCount != 0) {
			System.out.println("Cheese Pizza Combo: " + cheesePizzaComboCount);
		}
		if (pepperoniPizzaComboCount != 0) {
			System.out.println("Pepperoni Pizza Combo: " + pepperoniPizzaComboCount);
		}
		if (hawaiianPizzaComboCount != 0) {
			System.out.println("Hawaiian Pizza Combo: " + hawaiianPizzaComboCount);
		}

		System.out.println("Your total is: $" + twoDecimals.format(subTotal));
		System.out.println("whould you like to remove anything please type the name of the product. To continue type (no)");
		removeItem = br.readLine();

		if (removeItem.equalsIgnoreCase("Regular Cheese Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regCheesePizzaCount) {
				regCheesePizzaCount -= removeAmount;
				subTotal -= removeAmount * REGCHEESEPIZZA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
			
		}
		else if (removeItem.equalsIgnoreCase("Large Cheese Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= larCheesePizzaCount) {
				larCheesePizzaCount -= removeAmount;
				subTotal -= removeAmount * LARCHEESEPIZZA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Regular Pepperoni Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regPepperoniPizzaCount) {
				regPepperoniPizzaCount -= removeAmount;
				subTotal -= removeAmount * REGPEPPERONIPIZZA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Large Pepperoni Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= larPepperoniPizzaCount) {
				larPepperoniPizzaCount -= removeAmount;
				subTotal -= removeAmount * LARPEPPERONIPIZZA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Regular Hawaiian Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regHawaiianPizzaCount) {
				regHawaiianPizzaCount -= removeAmount;
				subTotal -= removeAmount * REGHAWAIIANPIZZA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Large Hawaiian Pizza")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= larHawaiianPizzaCount) {
				larHawaiianPizzaCount -= removeAmount;
				subTotal -= removeAmount * LARHAWAIIANPIZZA;
			}
			else
			{
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Regular Fries")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regFriesCount) {
				regFriesCount -= removeAmount;
				subTotal -= removeAmount * REGFRIES;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Large Fries")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= larFriesCount) {
				larFriesCount -= removeAmount;
				subTotal -= removeAmount * LARFRIES;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Onion Rings")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= onionRingsCount) {
				onionRingsCount -= removeAmount;
				subTotal -= removeAmount * ONIONRINGS;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Chicken Wings")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= chickenWingsCount) {
				chickenWingsCount -= removeAmount;
				subTotal -= removeAmount * CHICKENWINGS;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Garlic Bread")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= garlicBreadCount) {
				garlicBreadCount -= removeAmount;
				subTotal -= removeAmount * GARLICBREAD;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Bread Sticks")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= breadSticksCount) {
				breadSticksCount -= removeAmount;
				subTotal -= removeAmount * BREADSTICKS;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Regular Pepsi")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regPepsiCount) {
				regPepsiCount -= removeAmount;
				subTotal -= removeAmount * REGPEPSI;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Large Pepsi")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <=larPepsiCount) {
				larPepsiCount -= removeAmount;
				subTotal -= removeAmount * LARPEPSI;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Bottled Water")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= waterBottleCount) {
				waterBottleCount -= removeAmount;
				subTotal -= removeAmount * WATERBOTTLE;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Orange Juice")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= orangeJuiceCount) {
				orangeJuiceCount -= removeAmount;
				subTotal -= removeAmount * ORANGEJUICE;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Regular Iced Tea")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= regIceTeaCount) {
				regIceTeaCount -= removeAmount;
				subTotal -= removeAmount * REGICETEA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Large Iced Tea")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= larIceTeaCount) {
				larIceTeaCount -= removeAmount;
				subTotal -= removeAmount * LARICETEA;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Cheese Pizza Combo")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount<= cheesePizzaComboCount) {
				cheesePizzaComboCount -= removeAmount;
				subTotal -= removeAmount * CHEESEPIZZACOMBO;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Pepperoni Pizza Combo")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= pepperoniPizzaComboCount) {
				pepperoniPizzaComboCount -= removeAmount;
				subTotal -= removeAmount * PEPPERONIPIZZACOMBO;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("Hawaiian Pizza Combo")){
			System.out.println("how many would you like to remove");
			removeAmount = Integer.parseInt(br.readLine());
			if (removeAmount <= hawaiianPizzaComboCount) {
				hawaiianPizzaComboCount -= removeAmount;
				subTotal -= removeAmount * HAWAIIANPIZZACOMBO;
			}
			else {
				System.out.println("You have not ordered that many. Please try again");
			}
		}
		else if (removeItem.equalsIgnoreCase("no")){
			break;
		}
		else {
			System.out.println("Please enter a valid option");
		}
		
		} while(!removeItem.equalsIgnoreCase("no"));

		System.out.println("thank you for shopping with us");

		//reciept sections
		System.out.println("Reciept");
		System.out.println("Name: " + name);
		System.out.println("Items ordered");
		if (regCheesePizzaCount != 0) {
			System.out.println("Regular Cheese Pizza: " + regCheesePizzaCount);
		}
		if (larCheesePizzaCount != 0) {
			System.out.println("Large Cheese Pizza: " + larCheesePizzaCount);
		}
		if (regPepperoniPizzaCount != 0) {
			System.out.println("Regular Pepperoni Pizza: " + regPepperoniPizzaCount);
		}
		if (larPepperoniPizzaCount != 0) {
			System.out.println("Large Pepperoni Pizza: " + larPepperoniPizzaCount);
		}
		if (regHawaiianPizzaCount != 0) {
			System.out.println("Regular Hawaiian Pizza: " + regHawaiianPizzaCount);
		}
		if (larHawaiianPizzaCount != 0) {
			System.out.println("Large Hawaiian Pizza: " + larHawaiianPizzaCount);
		}
		if (regFriesCount != 0) {
			System.out.println("Regular Fries: " + regFriesCount);
		}
		if (larFriesCount != 0) {
			System.out.println("Large Fries: " + larFriesCount);
		}
		if (onionRingsCount != 0) {
			System.out.println("Onion Rings: " + onionRingsCount);
		}
		if (chickenWingsCount != 0) {
			System.out.println("Chicken Wings: " + chickenWingsCount);
		}
		if (garlicBreadCount != 0) {
			System.out.println("Garlic Bread: " + garlicBreadCount);
		}
		if (breadSticksCount != 0) {
			System.out.println("Bread Sticks: " + breadSticksCount);
		}
		if (regPepsiCount != 0) {
			System.out.println("Regular Pepsi: " + regPepsiCount);
		}
		if (larPepsiCount != 0) {
			System.out.println("Large Pepsi: " + larPepsiCount);
		}
		if (waterBottleCount != 0) {
			System.out.println("Bottled Water: " + waterBottleCount);
		}
		if (orangeJuiceCount != 0) {
			System.out.println("Orange Juice: " + orangeJuiceCount);
		}
		if (regIceTeaCount != 0) {
			System.out.println("Regular Iced Tea: " + regIceTeaCount);
		}
		if (larIceTeaCount != 0) {
			System.out.println("Large Iced Tea: " + larIceTeaCount);
		}
		if (cheesePizzaComboCount != 0) {
			System.out.println("Cheese Pizza Combo: " + cheesePizzaComboCount);
		}
		if (pepperoniPizzaComboCount != 0) {
			System.out.println("Pepperoni Pizza Combo: " + pepperoniPizzaComboCount);
		}
		if (hawaiianPizzaComboCount != 0) {
			System.out.println("Hawaiian Pizza Combo: " + hawaiianPizzaComboCount);
		}
		System.out.println("Total: $" + twoDecimals.format(subTotal));
		System.out.println("Tax: $" + twoDecimals.format(subTotal * HST));
		System.out.println("Total after tax: $" + twoDecimals.format(subTotal + (subTotal * HST)));
		System.out.println("Thank you for shopping with us");

		// add the total of this order to the total of all orders
		finalTotal += subTotal + (subTotal * HST);
		// order statistics 
		totalRegCheesePizzaCount += regCheesePizzaCount;
		totalLarCheesePizzaCount += larCheesePizzaCount;
		totalRegPepperoniPizzaCount += regPepperoniPizzaCount;
		totalLarPepperoniPizzaCount += larPepperoniPizzaCount;
		totalRegHawaiianPizzaCount += regHawaiianPizzaCount;
		totalLarHawaiianPizzaCount += larHawaiianPizzaCount;
		totalRegFriesCount += regFriesCount;
		totalLarFriesCount += larFriesCount;
		totalOnionRingsCount += onionRingsCount;
		totalChickenWingsCount += chickenWingsCount;
		totalGarlicBreadCount += garlicBreadCount;
		totalBreadSticksCount += breadSticksCount;
		totalRegPepsiCount += regPepsiCount;
		totalLarPepsiCount += larPepsiCount;
		totalWaterBottleCount += waterBottleCount;
		totalOrangeJuiceCount += orangeJuiceCount;
		totalRegIceTeaCount += regIceTeaCount;
		totalLarIceTeaCount += larIceTeaCount;
		totalCheesePizzaComboCount += cheesePizzaComboCount;
		totalPepperoniPizzaComboCount += pepperoniPizzaComboCount;
		totalHawaiianPizzaComboCount += hawaiianPizzaComboCount;

		}while(!name.equalsIgnoreCase(SENTINEL));// order loop

		// order statistics
		System.out.println("Total Statistics for the day");
		
		if (totalRegCheesePizzaCount != 0) {
			System.out.println("Total Regular Cheese Pizza sold: " + totalRegCheesePizzaCount);
		}
		if (totalLarCheesePizzaCount != 0) {
			System.out.println("Total Large Cheese Pizza sold: " + totalLarCheesePizzaCount);
		}
		if (totalRegPepperoniPizzaCount != 0) {
			System.out.println("Total Regular Pepperoni Pizza sold: " + totalRegPepperoniPizzaCount);
		}
		if (totalLarPepperoniPizzaCount != 0) {
			System.out.println("Total Large Pepperoni Pizza sold: " + totalLarPepperoniPizzaCount);
		}
		if (totalRegHawaiianPizzaCount != 0) {
			System.out.println("Total Regular Hawaiian Pizza sold: " + totalRegHawaiianPizzaCount);
		}
		if (totalLarHawaiianPizzaCount != 0) {
			System.out.println("Total Large Hawaiian Pizza sold: " + totalLarHawaiianPizzaCount);
		}
		if (totalRegFriesCount != 0) {
			System.out.println("Total Regular Fries sold: " + totalRegFriesCount);
		}
		if (totalLarFriesCount != 0) {
			System.out.println("Total Large Fries sold: " + totalLarFriesCount);
		}
		if (totalOnionRingsCount != 0) {
			System.out.println("Total Onion Rings sold: " + totalOnionRingsCount);
		}
		if (totalChickenWingsCount != 0) {
			System.out.println("Total Chicken Wings sold: " + totalChickenWingsCount);
		}
		if (totalGarlicBreadCount != 0) {
			System.out.println("Total Garlic Bread sold: " + totalGarlicBreadCount);
		}
		if (totalBreadSticksCount != 0) {
			System.out.println("Total Bread Sticks sold: " + totalBreadSticksCount);
		}
		if (totalRegPepsiCount != 0) {
			System.out.println("Total Regular Pepsi sold: " + totalRegPepsiCount);
		}
		if (totalLarPepsiCount != 0) {
			System.out.println("Total Large Pepsi sold: " + totalLarPepsiCount);
		}
		if (totalWaterBottleCount != 0) {
			System.out.println("Total Bottled Water sold: " + totalWaterBottleCount);
		}
		if (totalOrangeJuiceCount != 0) {
			System.out.println("Total Orange Juice sold: " + totalOrangeJuiceCount);
		}
		if (totalRegIceTeaCount != 0) {
			System.out.println("Total Regular Iced Tea sold: " + totalRegIceTeaCount);
			}	
		if (totalLarIceTeaCount != 0) {
			System.out.println("Total Large Iced Tea sold: " + totalLarIceTeaCount);
		}
		if (totalCheesePizzaComboCount != 0) {
			System.out.println("Total Cheese Pizza Combo sold: " + totalCheesePizzaComboCount);
		}
		if (totalPepperoniPizzaComboCount != 0) {
			System.out.println("Total Pepperoni Pizza Combo sold: " + totalPepperoniPizzaComboCount);
		}
		if (totalHawaiianPizzaComboCount != 0) {
			System.out.println("Total Hawaiian Pizza Combo sold: " + totalHawaiianPizzaComboCount);
		}
		System.out.println("Total Sales for the day: $" + twoDecimals.format(finalTotal));
		//post tax
		System.out.println("Total Sales for the day after tax: $" + twoDecimals.format(finalTotal /1.13));
		//number of orders






    }// psvm

}//class

