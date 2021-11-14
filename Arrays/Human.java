package arrays;

public class Human extends LivingBeeing{
    
    private String hairColor;

    Human(int nbLegs, int nbEyes, String species, double lifeExpectancy, String hairColor) {
        // super(2, "Homo Sapiens Sapiens", 2, 72.6);
        super(nbLegs, nbEyes, species, lifeExpectancy);
        this.hairColor = hairColor;
    }
    
    public String getHairColor() {
        return hairColor;
    }
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }


    @Override
    public String toString() {
        String ret = "\nHair Color: " + this.hairColor;
        return super.toString().concat(ret);
    }
}
