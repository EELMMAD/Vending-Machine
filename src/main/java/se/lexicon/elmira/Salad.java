package se.lexicon.elmira;

public class Salad extends Product {
    protected boolean hasDressing;
    /* constructor */
    public Salad(int productNumber, String productName, int productCost, boolean productHasAllergens, boolean productHasDressing) {
        super(productNumber, productName, productCost, productHasAllergens);
        hasDressing = productHasDressing;
    }
    /* examine method to show product details */
    public String examine() {
        String info = "number=<" + Integer.toString(number) + "> name=<" + name + "> cost=<" + Integer.toString(cost) + ">";
        info += " hasAllergens=<" + Boolean.toString(hasAllergens) + "> hasDressing=<" + Boolean.toString(hasDressing) + ">";
        return info;
    }
    /* use method to show the buying process */
    public String use() {
        return "Now you can eat your " + name + "!";
    }
}

