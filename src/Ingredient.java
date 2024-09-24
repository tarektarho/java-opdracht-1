public class Ingredient {
    private double amount;
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
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setAmount(float amount) {
        if (amount > 0) {
            this.amount = amount;
        }
    }

    public void setUnit(String unit) {
        if (unit != null && !unit.isEmpty()) {
            this.unit = unit;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }
}
