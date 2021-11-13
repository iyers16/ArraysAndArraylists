package arraylists;

public class Animal extends LivingBeeing{

    protected String breed;

    Animal(String species, String breed, int nbLegs, double lifeExpectancy) {
        super(2, species, nbLegs, lifeExpectancy);
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
