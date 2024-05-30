package App;

public class Restaurant {

	private String nameRestaurant;
	private String emailRestaurante;
	private String categoryRestaurant;
	private boolean statusRestaurant;
	private String phoneNumRestaurant;
	
	
	public Restaurant(String nameRestaurant, String emailRestaurante, String categoryRestaurant, boolean statusRestaurant, String phoneNumRestaurant) {
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
	
	public String getEmailRestaurante() {
		return emailRestaurante;
	}
	
	public String getCategoryRestaurant() {
		return categoryRestaurant;
	}
	
	
	public boolean isStatusRestaurant() {
		return statusRestaurant;
	}
	
	public String getPhoneNumRestaurant() {
		return phoneNumRestaurant;
	}
	
	   @Override
	public String toString() {
	    return "Restaurant{" +
	    "nameRestaurant='" + nameRestaurant + '\'' +
	    ", emailRestaurante='" + emailRestaurante + '\'' +
	    ", categoryRestaurant='" + categoryRestaurant + '\'' +
	    ", statusRestaurant=" + statusRestaurant +
	    ", phoneNumRestaurant='" + phoneNumRestaurant + '\'' +
	    '}';
	    }

	public void setNameRestaurant(String nameRestaurant) {
		this.nameRestaurant = nameRestaurant;
	}

	public void setEmailRestaurante(String emailRestaurante) {
		this.emailRestaurante = emailRestaurante;
	}

	public void setCategoryRestaurant(String categoryRestaurant) {
		this.categoryRestaurant = categoryRestaurant;
	}

	public void setStatusRestaurant(boolean statusRestaurant) {
		this.statusRestaurant = statusRestaurant;
	}

	public void setPhoneNumRestaurant(String phoneNumRestaurant) {
		this.phoneNumRestaurant = phoneNumRestaurant;
	}
	   
	   
}
