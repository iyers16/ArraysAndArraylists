package arrays;

public class Arrays {

    public static void main(String[] args) {
        
        LivingBeeing[] creatureArray = new LivingBeeing[8];
        
        /*DONE*/
        // 1 - Add the following to the array
        //      2 dogs, 2 cats, 2 humans and 2 Living beeings        
        creatureArray[0] = new arrays.Dog(4, 2, "Canis familiaris", 11.5, "Bloodhound", true);
        creatureArray[1] = new arrays.Dog(4, 2, "Canis familiaris", 11.5, "German Shepherd", false);

        creatureArray[2] = new arrays.Cat(4, 2, "Felis Catus", 16.9, "Aphrodite", 14);
        creatureArray[3] = new arrays.Cat(4, 2, "Felis Catus", 16.9, "Bob Tail", 13);

        creatureArray[4] = new arrays.Human(2, 2, "Homo Sapiens Sapiens", 72.6, "Black");
        creatureArray[5] = new arrays.Human(2, 2, "Homo Sapiens Sapiens", 72.6, "Brown");

        creatureArray[6] = new arrays.LivingBeeing(0, 0, "Cephalocereus", 200);
        creatureArray[7] = new arrays.LivingBeeing(0, 0, "Musa acuminata", 25);
        /*DONE*/
 
        /*DONE*/
        // 2 - display the contents of the array by printing the actual objects of the array 
        displayArrayObjects(creatureArray); 
        /*DONE*/
        
        /*DONE*/
        // 3 - Remove the 3rd element of the array
        // [d],[d],CHANGE[c],[c],[h],[h],[l],[l] = 8
        // [d],[d],CHANGE[c],[h],[h],[l],[l] = 7
        // before change, just copy simple
        // during and after change, apply change
        // int index = 2;
        // LivingBeeing newCreatureArr[] = new LivingBeeing[7];
        // for(int i = 0; i < newCreatureArr.length; i++) {
        //     if(i < index) {
        //         newCreatureArr[i] = creatureArray[i];
        //     } else {
        //         newCreatureArr[i] = creatureArray[i + 1];
        //     }
        // }
        creatureArray[2] = null;
        /*DONE*/
        
        /*DONE*/
        // 4 - display the contents of the array by printing the actual objects of the array       
        displayArrayObjects(creatureArray); 
        /*DONE*/

        /*DONE*/
        // 5 - Change the nbLegs for all the dogs from 4 legs to 3 legs
        for (LivingBeeing nlb : creatureArray) {
            if(nlb instanceof Dog) {
                nlb.setNbLegs(3);
            }
        }
        /*DONE*/

        /*DONE*/
        // 6 - display the contents of the array by printing the actual objects of the array       
        displayArrayObjects(creatureArray);
        /*DONE*/

        /*DONE*/
        // 7 - Display the length of the array
        System.out.println("\nLength of array is: " + creatureArray.length);
        /*DONE*/
        
    }
    public static void displayArrayObjects(LivingBeeing[] lbs) {
        String delimiter = "*********************************************************************";
        System.out.println(delimiter);  
        for (LivingBeeing lb : lbs) {
            if(lb == null) {
                System.out.println("\nnull object");
                continue;
            }
            System.out.println(lb.toString());
        }
        System.out.println(delimiter);
    }       
}