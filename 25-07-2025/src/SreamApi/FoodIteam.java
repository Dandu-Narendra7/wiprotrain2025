package SreamApi;

public class FoodIteam {
	String foodName;
	String foodType;
	String Model;
	double Price;
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public FoodIteam(String foodName, String foodType, String model, double price) {
		super();
		this.foodName = foodName;
		this.foodType = foodType;
		this.Model = model;
		this.Price = price;
	}
	@Override
	public String toString() {
		return "FoodIteam [foodName=" + foodName + ", foodType=" + foodType + ", Model=" + Model + ", Price=" + Price
				+ "]";
	}
	

}
