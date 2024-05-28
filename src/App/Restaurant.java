package App;

public class Restaurant {

	private String nameRestaurant;
	private String emailRestaurante;
	private String categoryRestaurant;
	private boolean statusRestaurant;
	private String phoneNumRestaurant;
	
	
	public Restaurant(String nameRestaurant, String emailRestaurante, String categoryRestaurant,
			boolean statusRestaurant, String phoneNumRestaurant) {
		super();
		this.nameRestaurant = nameRestaurant;
		this.emailRestaurante = emailRestaurante;
		this.categoryRestaurant = categoryRestaurant;
		this.statusRestaurant = statusRestaurant;
		this.phoneNumRestaurant = phoneNumRestaurant;
	}
	
	public String getNameRestaurant() {
		return nameRestaurant;
	}
	
	public void setNameRestaurant(String nameRestaurant) {
		this.nameRestaurant = nameRestaurant;
	}
	
	public String getEmailRestaurante() {
		return emailRestaurante;
	}
	
	public void setEmailRestaurante(String emailRestaurante) {
		this.emailRestaurante = emailRestaurante;
	}
	
	public String getCategoryRestaurant() {
		return categoryRestaurant;
	}
	
	public void setCategoryRestaurant(String categoryRestaurant) {
		this.categoryRestaurant = categoryRestaurant;
	}
	
	public boolean isStatusRestaurant() {
		return statusRestaurant;
	}
	
	public void setStatusRestaurant(boolean statusRestaurant) {
		this.statusRestaurant = statusRestaurant;
	}
	
	public String getPhoneNumRestaurant() {
		return phoneNumRestaurant;
	}
	
	public void setPhoneNumRestaurant(String phoneNumRestaurant) {
		this.phoneNumRestaurant = phoneNumRestaurant;
	}
}
