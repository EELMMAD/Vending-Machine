package se.lexicon.elmira;

public class Drink extends Product {
    protected boolean isHot;
    /* constructor */
    public Drink(int productNumber, String productName, int productCost, boolean productHasAllergens, boolean productIsHot) {
        super(productNumber, productName, productCost, productHasAllergens);
        isHot = productIsHot;
    }
    /* examine method to show product details */
    public String examine() {
        String info = "number=<" + Integer.toString(number) + "> name=<" + name + "> cost=<" + Integer.toString(cost) + ">";
        info += " hasAllergens=<" + Boolean.toString(hasAllergens) + "> isHot=<" + Boolean.toString(isHot) + ">";
        return info;
    }
    /* use method to show the buying process */
    public String use() {
        return "Now you can drink your " + name + "!";
    }
}
