package SreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class StreamDemoex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoodIteam F1=new FoodIteam("chicken","non veg","indian",200);
		FoodIteam F2=new FoodIteam("Kung Pao Chicken", "Non Veg", "Chinese", 300);
		FoodIteam F3=new FoodIteam("Spaghetti", "Veg", "Continental", 220);
		FoodIteam F4=new FoodIteam("Spring Rolls", "Veg", "Chinese", 150);
		FoodIteam F5=new FoodIteam("French fires","veg","French",350);
		List<FoodIteam>  foodList=new ArrayList();
		 foodList.add(F1);
		 foodList.add(F2);
		 foodList.add(F3);
		 foodList.add(F4);
		 foodList.add(F5);
		 Comparator<FoodIteam> f1 =(a, b)->{
		 Double dl= Double.valueOf(a.Price);
		 Double d2= Double.valueOf(b.Price);
		return dl.compareTo(d2);
		 };
		 List<FoodIteam> foof=foodList
		 .stream()
		 .filter(f->f.getModel().equals("Chinese"))
		 .collect(Collectors.toList());
		 System.out.println(foof);
		
		

	}

}
