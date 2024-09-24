public class ApplePieRecipe {
    // Create Ingredient objects
    Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient sugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient crystalSugar = new Ingredient(75, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadcrumbs = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients() {
        preparePrintIngredient(butter);
        preparePrintIngredient(sugar);
        preparePrintIngredient(flour);
        preparePrintIngredient(egg);
        preparePrintIngredient(vanillaSugar);
        preparePrintIngredient(salt);
        preparePrintIngredient(apples);
        preparePrintIngredient(crystalSugar);
        preparePrintIngredient(cinnamon);
        preparePrintIngredient(breadcrumbs);
    }

    /**
     * Step up method to print an ingredient and to make sure we don't violate DRY
     * @param ingredient the ingredient to print
     */
    private void preparePrintIngredient(Ingredient ingredient) {
        System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
    }

    /**
     * Stappen:
     *
     * Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)
     * Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.
     * Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.
     * Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.
     * Vet de springvorm in en bestrooi deze met bloem
     * Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.
     * Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.
     * Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.
     * Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken
     * Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.
     */
    public void preheatOven() {
        System.out.println("Stap 1: Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void prepareEgg() {
        System.out.println("Stap 2: Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixDough() {
        System.out.println("Stap 3: Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareApplesAndSugar() {
        System.out.println("Stap 4: Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void greasePan() {
        System.out.println("Stap 5: Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void makeCrustAndSprinkleBreadcrumbs() {
        System.out.println("Stap 6: Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void addAppleFilling() {
        System.out.println("Stap 7: Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void createLatticeCrust() {
        System.out.println("Stap 8: Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void placeLatticeOnPie () {
        System.out.println("Stap 9: Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bakePie() {
        System.out.println("Stap 10: Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printRecipe() {
        preheatOven();
        prepareEgg();
        mixDough();
        prepareApplesAndSugar();
        greasePan();
        makeCrustAndSprinkleBreadcrumbs();
        addAppleFilling();
        createLatticeCrust();
        placeLatticeOnPie();
        bakePie();
    }
}
