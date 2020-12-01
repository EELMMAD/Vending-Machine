package se.lexicon.elmira;

public abstract class Product {
    protected int number;
    protected String name;
    protected int cost;
    protected boolean hasAllergens;
    /* constructor */
    public Product(int productNumber, String productName, int productCost, boolean productHasAllergens) {
        number = productNumber;
        name = productName;
        cost = productCost;
        hasAllergens = productHasAllergens;
    }
    /* examine abstract method */
    public abstract String examine();
    /* use abstract method */
    public abstract String use();
}
