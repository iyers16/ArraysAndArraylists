package arrays;

public class Arrays {

    public static void main(String[] args) {
        
        LivingBeeing[] creatureArray = new LivingBeeing[8];
        
        /*DONE*/
        // 1 - Add the following to the array
        //      2 dogs, 2 cats, 2 humans and 2 Living beeings        
        creatureArray[0] = new arrays.Dog("Bloodhound", true);
        creatureArray[1] = new arrays.Dog("German Shepherd", false);

        creatureArray[2] = new arrays.Cat("Aphrodite", 14);
        creatureArray[3] = new arrays.Cat("Bob Tail", 13);

        creatureArray[4] = new arrays.Human("Black");
        creatureArray[5] = new arrays.Human("Brown");

        creatureArray[6] = new arrays.LivingBeeing(0, "Cephalocereus", 0, 200);
        creatureArray[7] = new arrays.LivingBeeing(0, "Musa acuminata", 0, 25);
        /*DONE*/
 
        /*DONE*/
        // 2 - display the contents of the array by printing the actual objects of the array 
        displayArrayObjects(creatureArray); 
        /*DONE*/
        
        /*DONE*/
        // 3 - Remove the 3rd element of the array
        int index = 2;
        LivingBeeing newCreatureArr[] = new LivingBeeing[7];
        for(int i = 0; i < newCreatureArr.length; i++) {
            if(index <= i) {
                newCreatureArr[i] = creatureArray[i + 1];
            } else {
                newCreatureArr[i] = creatureArray[i];
            }
        }
        /*DONE*/
        
        /*DONE*/
        // 4 - display the contents of the array by printing the actual objects of the array       
        displayArrayObjects(newCreatureArr); 
        /*DONE*/

        /*DONE*/
        // 5 - Change the nbLegs for all the dogs from 4 legs to 3 legs
        for (LivingBeeing nlb : newCreatureArr) {
            if(nlb instanceof Dog) {
                nlb.setNbLegs(3);
            }
        }
        /*DONE*/

        /*DONE*/
        // 6 - display the contents of the array by printing the actual objects of the array       
        displayArrayObjects(newCreatureArr);
        /*DONE*/

        /*DONE*/
        // 7 - Display the length of the array
        System.out.println("\nLength of array is: " + newCreatureArr.length);
        /*DONE*/
        
    }
    public static void displayArrayObjects(LivingBeeing[] lbs) {
        String delimiter = "*********************************************************************";
        System.out.println(delimiter);  
        for (LivingBeeing lb : lbs) {
            System.out.println(lb.toString());
        }
        System.out.println(delimiter);
    }       
}
