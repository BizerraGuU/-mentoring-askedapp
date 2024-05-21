package Restaurant;

import java.util.Scanner;

import Restaurant.Funcs.ExceptionChoose;

public class Menu {
	
	public void menuApp() throws ExceptionChoose {
		
		
		System.out.println("Choose an option: ");
		System.out.println("1. Register Restaurants");
		System.out.println("2. List Restaurants");
		System.out.println("3. Change Restaurant Status");
		System.out.println("4. Exit");
		
		chooseOption();
		
	}
	
	private void chooseOption() throws ExceptionChoose {
		
			
			Scanner chooseOption = new Scanner(System.in);
			
			System.out.print("\nEnter the option: ");
			int optionEnter =  chooseOption.nextInt();
			
			switch (optionEnter) {
			
			case 1: {
				
				System.out.println(" Register Restaurants");
				
				break;
			}
			
			case 2: {
						
				System.out.println("List Restaurants");
						
				break;
			}
			
			case 3: {
				
				System.out.println("Change Restaurant Status");
				
				break;
			}
			
			case 4: {
				
				System.out.println("Exit");
				
				break;
				
				}
			}
			
			if (optionEnter > 5 && optionEnter < 1) {
				
				throw new ExceptionChoose(optionEnter);
				
			}
	}
		
	}


