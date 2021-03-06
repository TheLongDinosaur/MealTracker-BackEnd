public enum Category {

  Fruit,
  Vegetable,
  Protein,
  Dessert,
  Beverage,
  Fat,
  Carbohydrate;
}

class CategoryTest {

    Category category;

    public CategoryTest(Category name) {
    this.category = name;
    System.out.println("Category name: " + name);
    }

    public void Categories() {
        switch (category) {
        case Fruit:
            System.out.println("Fruit is an excellent source of energy and nutrition.");
            break;
        case Vegetable:
            System.out.println("Vegetables are an excellent source of vitamins.");
            break;
        case Protein:
            System.out.println("Protein is an essential building block for our bodies. Red meat and soy-based
            proteins should be consumed in limited amounts. Instead, go for lean proteins such as fish, poultry,
            legumes, and nuts.);
            break;
        case Dessert:
            System.out.println("Dessert can be a special treat. Reward yourself from time to time for staying on track
            with your dietary and exercise goals.  But don't overdo it!");
            break;
        case Beverage:
            System.out.println("Fruit juices, soda and other beverages containing added sugars and caffeine should be
            enjoyed in limited amounts, if not avoided altogether. Stick with healthy beverage options such as
            Water or
            fresh-brewed, sugar-free Tea.");
            break;
        case Fat:
            System.out.println("Good fats are essential for maintaining optimal health. Healthy fats such as the omegas
            found in fish, legumes and nuts are required to keep the brain and muscles functioning properly.
            These fats can even help regulate mood and ward off depression.");
            break;
        case Carbohydrate:
            System.out.println("Complex carbohydrates are necessary for sustaining energy levels and brain function.");
            break;
        default:
            System.out.println("Unrecognised category. Please try again.");
            break;
        }
    }

    public static void main (String[] args) {
      CategoryTest myCategory = new CategoryTest(Category.Beverage);
      myCategory.Categories();
    }

}