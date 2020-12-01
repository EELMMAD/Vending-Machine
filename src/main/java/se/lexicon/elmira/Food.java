package se.lexicon.elmira;

public class Food extends Product {
    protected FoodClassification classification;
    /* constructor */
    public Food(int productNumber, String productName, int productCost, boolean productHasAllergens, FoodClassification productClassification) {
        super(productNumber, productName, productCost, productHasAllergens);
        classification = productClassification;
    }
    /* examine method to show product details */
    public String examine() {
        String info = "number=<" + Integer.toString(number) + "> name=<" + name + "> cost=<" + Integer.toString(cost) + ">";
        info += " hasAllergens=<" + Boolean.toString(hasAllergens) + "> classification=<" + classification.toString() + ">";
        return info;
    }
    /* use method to show the buying process */
    public String use() {
        return "Now you can eat your " + name + "!";
    }
}
