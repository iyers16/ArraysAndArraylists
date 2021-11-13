package arraylists;

public class Cat extends Animal {

    private int tailSizeCM;
    
    Cat(String breed, int tailSizeCM) {
        super("Felis Catus", breed, 4, 16.9);
        this.tailSizeCM = tailSizeCM;
    }

    public int getTailSizeCM() {
        return tailSizeCM;
    }
    public void setTailSizeCM(int tailSizeCM) {
        this.tailSizeCM = tailSizeCM;
    }
    
    @Override
    public String toString() {
        String ret = "\nTail Size (in cm): " + this.tailSizeCM;
        return super.toString().concat(ret);
    }
}
