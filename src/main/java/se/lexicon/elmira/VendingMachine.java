package se.lexicon.elmira;

public interface VendingMachine {
    public int[] deposits = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    /* initiating products */
    public Food food1 = new Food(1, "Pizza", 24, false, FoodClassification.FastFood);
    public Food food2 = new Food(2, "Sushi", 43, true, FoodClassification.Seafood);
    public Food food3 = new Food(3, "Milk & Cake", 16, false, FoodClassification.Dairy);
    public Food food4 = new Food(4, "Cereals", 30, false, FoodClassification.Vegetarian);
    public Food food5 = new Food(5, "Roast Chicken", 32, true, FoodClassification.Normal);
    public Salad salad1 = new Salad(6, "Mexican", 8, false, false);
    public Salad salad2 = new Salad(7, "Mexican", 9, false, true);
    public Salad salad3 = new Salad(8, "Nicoise", 18, true, false);
    public Salad salad4 = new Salad(9, "Nicoise", 20, true, true);
    public Salad salad5 = new Salad(10, "Waldorf", 26, false, false);
    public Salad salad6 = new Salad(11, "Waldorf", 27, false, true);
    public Drink drink1 = new Drink(12, "Coffee", 5, false, true);
    public Drink drink2 = new Drink(13, "Orange Juice", 11, false, false);
    public Drink drink3 = new Drink(14, "Soda", 3, false, false);
    public Drink drink4 = new Drink(15, "Lemonade", 13, false, false);
    public Drink drink5 = new Drink(16, "Hot Chocolate", 8, false, true);
    public Drink drink6 = new Drink(17, "Water", 2, false, false);
    public Drink drink7 = new Drink(18, "Green Tea", 6, false, true);
    public Drink drink8 = new Drink(19, "Milkshake", 22, true, false);
    public Drink drink9 = new Drink(20, "Smoothie", 32, false, false);
    /* methods prototypes */
    public void addCurrency(int amount);
    public Product request(int productNumber);
    public int endSession();
    public String getDescription(int productNumber);
    public int getBalance();
    public String[] getProducts();
}
