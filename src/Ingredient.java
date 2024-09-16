public class Ingredient {
    private int amount;
    private String unit;
    private String name;

    public Ingredient() {
    }

    /**
     * Constructs an Ingredient with the specified amount, unit, and name.
     *
     * @param amount the amount of the ingredient
     * @param unit the unit of measurement for the ingredient
     * @param name the name of the ingredient
     */
    public Ingredient(int amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    // Getters
    public int getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }
}
