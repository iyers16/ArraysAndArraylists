package arraylists;

public class Animal extends LivingBeeing{

    protected String breed;

    Animal(int nbLegs, int nbEyes, String species, double lifeExpectancy, String breed) {
        // super(2, species, nbLegs, lifeExpectancy);
        super(nbLegs, nbEyes, species, lifeExpectancy);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        String ret = "\nBreed: " + this.breed;
        return super.toString().concat(ret);
    }
}
