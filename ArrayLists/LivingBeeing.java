package arraylists;

public class LivingBeeing {
    protected int nbLegs;
    protected int nbEyes;
    protected String species;
    protected double lifeExpectancy;

    LivingBeeing(int nbLegs, int nbEyes, String species, double lifeExpectancy) {
        this.nbEyes = nbEyes;
        this.nbLegs = nbLegs;
        this.species = species;
        this.lifeExpectancy = lifeExpectancy;
    }

    public int getNbLegs() {
        return nbLegs;
    }
    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getNbEyes() {
        return nbEyes;
    }
    public void setNbEyes(int nbEyes) {
        this.nbEyes = nbEyes;
    }

    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public double getLifeExpectancy() {
        return lifeExpectancy;
    }
    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String toString() {
        String ret = "\nCharacteristics of this " + String.valueOf(this.getClass()).split("\\.")[1] + ":" 
                    + "\nLegs: " + this.nbLegs 
                    + "\nEyes: " + this.nbEyes
                    + "\nSpecies: " + this.species
                    + "\nLife Expectancy (in years): " + this.lifeExpectancy;

        return ret;
    }
}
