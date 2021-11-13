package arraylists;

public class Dog extends Animal{

    private boolean isHuntingDog;
    
    Dog(String breed, boolean isHuntingDog) {
        super("Canis familiaris", breed, 4, 11.5);
        this.isHuntingDog = isHuntingDog;
    }

    public boolean getIsHuntingDog() {
        return this.isHuntingDog;
    }
    public void setIsHuntingDog(boolean input) {
        this.isHuntingDog = input;
    }

    @Override
    public String toString() {
        String ret = "\nHunting dog: " + ((this.isHuntingDog == false) ? "No" : "Yes");
        return super.toString().concat(ret);
    }
    
   
   
    
}
