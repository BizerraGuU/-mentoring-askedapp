package Funcs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import App.Restaurant;

public class FuncApp {
	
	Scanner enterRestaurant = new Scanner(System.in);
	private List<Restaurant> listRestaurants;
	
	public FuncApp() {
	    this.listRestaurants = new ArrayList<>();
	}
	
	public void Menu() {
		
	}
	
	public void RegisterRestaurant() throws InvalidStatusException, InterruptedException {
		
		boolean statusRes = false;
		
		System.out.print("\nEnter Your Restaurant Name: ");
		String nameRes = enterRestaurant.next();
		
		System.out.print("\nEnter Your Restaurant Email: ");
		String emailAddRes = enterRestaurant.next();
		
		System.out.print("\nEnter Your Restaurant Category: ");
		String categoryRes = enterRestaurant.next();
		
		System.out.println("\nCategories: Fast-Food, Italian, Mexican, Brazilian, Sushi\n");
		
		System.out.println("\nEnter 1 to Activate and 0 to Deactivate\n");

		System.out.print("Do you want to activate your restaurant? Press [1] if Yes and [0] if No: ");
		int statusResEnter = enterRestaurant.nextInt();
		
		if (statusResEnter == 1) {
			statusRes = true;
		} 
			
		System.out.print("Enter Your Restaurant Status: ");
		String phoneNumRest = enterRestaurant.next();
		
		listRestaurants.add(new Restaurant(nameRes, emailAddRes, categoryRes, statusRes, phoneNumRest));
		
		System.out.println("\nThe Restaurant has been registered!");
		
		System.out.print("\nDo You want to register another restaurt? Press [1] if Yes and [0] if Not: ");
		int ansUserRes = enterRestaurant.nextInt();
		
		if (ansUserRes == 1) {
			RegisterRestaurant();
		} else {
			System.out.print("\nDo You want to go back to menu? Press [1] if Yes and [0] if Not: ");
			int goBackToMenuRes = enterRestaurant.nextInt();
			
			if (goBackToMenuRes == 1) {
				
				System.out.println("\nOk, Your are going back to menu . . .");
				Thread.sleep(1000);
				Menu();
			} else {
				Exit();
			}
		}	
	}

	public void ListRestaurant() throws InterruptedException {
		if (listRestaurants.isEmpty()) {
			System.out.println("No restaurants registered");
		} else {
			for (Restaurant restaurant : listRestaurants) {
				System.out.println(restaurant);
			}
		}
		
		System.out.print("Want to go back to menu? Press [1] if Yes and [0] if Not");
		int ansUser = enterRestaurant.nextInt();
		
		if (ansUser == 1) {
			System.out.println("You are going back to menu . . .");
			Thread.sleep(1000);
			Menu();
		} else {
			Exit();
		}
	}
	
	public void ChangeRestaurantStatus() throws InterruptedException {
		
		System.out.print("Enter the name of the restaurant you want to activate or deactivate: ");
		String nameResEnter = enterRestaurant.next();
		
		for (Restaurant restaurant : listRestaurants) {
			if (restaurant.getNameRestaurant().equalsIgnoreCase(nameResEnter)) {
				
				System.out.println("The current Status is: " + restaurant.isStatusRestaurant());
				
				System.out.print("\nDo You really want to change? Press [1] if Yes and [0] if Not: ");
				int confirmAns = enterRestaurant.nextInt();
				
				if (confirmAns == 1) {	
					restaurant.setStatusRestaurant(!restaurant.isStatusRestaurant());
					System.out.println("The status of restaurant " + restaurant.getNameRestaurant() + "has been changed to " + (restaurant.isStatusRestaurant() ? "Active" : "Deactive."));
					
					System.out.print("\nDo you want to change status of another restaurant? Press [1] if Yes and [0] if Not: ");
					int keepChanging = enterRestaurant.nextInt();
					
					if (keepChanging == 1) {
						ChangeRestaurantStatus();
					} else  {
					
						System.out.print("Do you want to go back to menu?  Press [1] if Yes and [0] if Not: ");
						int newAnsUser = enterRestaurant.nextInt();
						
						if (newAnsUser == 1) {
							System.out.println("Ok, you are going back to menu . . .");
							Thread.sleep(1000);
							Menu();
						} else {
							Exit();
							}
						}
				} else {
				System.out.println("Ok, you are going back to menu . . .");
				Thread.sleep(1000);
				Menu();
				}
			}
		}
	}
	
	public void Exit() throws InterruptedException {
		
		System.out.println("\nDo you really want to quit? Press [1] if Yes and [0] if Not: ");
		int confirmQuit = enterRestaurant.nextInt();
		
		if (confirmQuit == 1) {

			System.out.println("\nOk, See You! Exiting the program . . .");
			System.exit(0);
		} else {
			System.out.println("\nOk, you are going back to menu . . .");
			Thread.sleep(1000);
			Menu();
		}
	}
}
