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
	}>
	
	public void RegisterRestaurant() {
		
		boolean statusRes;
		
		System.out.print("\nEnter Your Restaurant Name: ");
		String nameRes = enterRestaurant.next();
		
		System.out.print("\nEnter Your Restaurant Email: ");
		String emailAddRes = enterRestaurant.next();
		
		System.out.print("\nEnter Your Restaurant Category: ");
		String categoryRes = enterRestaurant.next();
		
		System.out.println("\nCategories: Fast-Food, Italian, Mexican, Brazilian, Sushi\n");
		
		System.out.println("\nEnter 1 to Activate and 0 to Deactivate\n");

		System.out.print("Enter Your Restaurant Status: ");
		int statusResEnter = enterRestaurant.nextInt();
		
		if (statusResEnter == 1) {
			statusRes = true;
			break;
			
		} else if (statusResEnter == 0) {
			statusRes = false;
			break;
			
		} else {
			throw new InvalidStatusException("Invalid status value. Please enter 1 for active or 0 for inactive.");
		}
		
		System.out.print("Enter Your Restaurant Status: ");
		String phoneNumRest = enterRestaurant.next();
		
		listRestaurants.add(new Restaurant(nameRes, emailAddRes, categoryRes, statusRes, phoneNumRest));
	}
	
	public void ListRestaurant() {
		
	}
	
	public void ChangeRestaurantStatus(){
		
	}
	
	public void Exit() {
		
	}
}
