import java.util.ArrayList;
import java.time.LocalTime;

public class Meal extends Food {

  ArrayList<Food> foods = new ArrayList<Food>();

  public Meal(String name, double Calories, double Fat, double Carbohydrates, double Protein, ArrayList<Category>
  categories) {
    super(name, Calories, Fat, Carbohydrates, Protein, categories);
  }

  LocalTime getMealTime() {
    LocalTime mealTime = LocalTime.now();
    return mealTime;
  }

  void addFood(Food food) {
    this.foods.add(food);
  }

  void viewFoods() {
    for (int i =0; i<this.foods.size();i++) {
      System.out.println(this.foods.get(i).name);
    }
  }

  public static void main(String[] args) {

    ArrayList<Category> categories = new ArrayList<Category>();
    categories.add(Category.Fat);
    categories.add(Category.Beverage);
    categories.add(Category.Protein);

    Meal myMeal = new Meal("Milkshake", 280, 26, 89, 12, categories);
    myMeal.addFood(myMeal);

    ArrayList<Category> Watermeloncategories = new ArrayList<Category>();
    Watermeloncategories.add(Category.Fruit);
    Watermeloncategories.add(Category.Carbohydrate);
    Food watermelon = new Food( "Watermelon", 85, 0.4, 21, 1.7, Watermeloncategories);

    myMeal.addFood(watermelon);

    LocalTime currentTime = myMeal.getMealTime();

    System.out.println(currentTime);
    myMeal.viewFoods();
  }

}