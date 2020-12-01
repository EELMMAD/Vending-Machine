package se.lexicon.elmira;

public enum FoodClassification {
    Seafood,
    FastFood,
    Dairy,
    Vegetarian,
    Normal;
    /* toString method to return appropriate string */
    public String toString() {
        switch(this) {
            case Seafood: return "sea food";
            case FastFood: return "fast food";
            case Dairy: return "dairy food";
            case Vegetarian: return "vegetarian food";
            default: return "normal food";
        }
    }
}

