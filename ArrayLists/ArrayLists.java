package arraylists;

import java.util.ArrayList;

// import arrays.LivingBeeing;
// This import is interfering with package-independant classes

public class ArrayLists {

    public static void main(String[] args) {
        
        
        ArrayList<arraylists.LivingBeeing> creatureList = new ArrayList<arraylists.LivingBeeing>();
        
        // 1 - Add the following to the array
        //      2 dogs, 2 cats, 2 humans and 2 Living beeings
        creatureList.add(new arraylists.Dog(4, 2, "Canis familiaris", 11.5, "Bloodhound", true));
        creatureList.add(new arraylists.Dog(4, 2, "Canis familiaris", 11.5, "German Shepherd", false));

        creatureList.add(new arraylists.Cat(4, 2, "Felis Catus", 16.9, "Aphrodite", 14));
        creatureList.add(new arraylists.Cat(4, 2, "Felis Catus", 16.9, "Bob Tail", 13));

        creatureList.add(new arraylists.Human(2, 2, "Homo Sapiens Sapiens", 72.6, "Black"));
        creatureList.add(new arraylists.Human(2, 2, "Homo Sapiens Sapiens", 72.6, "Brown"));

        creatureList.add(new arraylists.LivingBeeing(0, 0, "Cephalocereus", 200));
        creatureList.add(new arraylists.LivingBeeing(0, 0, "Musa acuminata", 25));
        
               
        // 2 - display the contents of the array by printing the actual objects of the array       
        displayListObjects(creatureList);

        
        // 3 - Remove the 3rd element of the array
        creatureList.remove(2);
        
		
        // 4 - display the contents of the array by printing the actual objects of the array       
        displayListObjects(creatureList);


        // 5 - Change the nbLegs for all the dogs from 4 legs to 3 legs
        for (LivingBeeing lb : creatureList) {
            if(lb instanceof Dog) {
                lb.setNbLegs(3);
            }
        }

       
        // 6 - display the contents of the array by printing the actual objects of the array       
        displayListObjects(creatureList);


        // 7 - Display the length of the array
        System.out.println("\nLength of array is: " + creatureList.size());
        
    }
    public static void displayListObjects(ArrayList<LivingBeeing> lbs) {
        String delimiter = "*********************************************************************";
        System.out.println(delimiter); 
        for (LivingBeeing lb : lbs) {
            System.out.println(lb.toString());
        }
        System.out.println(delimiter);
    }
    
}
