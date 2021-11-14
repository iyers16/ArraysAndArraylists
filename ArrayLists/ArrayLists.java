package arraylists;

import java.util.ArrayList;

// import arrays.LivingBeeing;
// This import is interfering with package-independant classes

public class ArrayLists {

    public static void main(String[] args) {
        
        
        ArrayList<arraylists.LivingBeeing> creatureList = new ArrayList<arraylists.LivingBeeing>();
        
        // 1 - Add the following to the array
        //      2 dogs, 2 cats, 2 humans and 2 Living beeings
        // arraylists.LivingBeeing dog1 = new arraylists.Dog("Bloodhound", true);
        creatureList.add(new arraylists.Dog("Bloodhound", true));
        // arraylists.LivingBeeing dog2 = new arraylists.Dog("German Shepherd", false);
        creatureList.add(new arraylists.Dog("German Shepherd", false));

        // arraylists.LivingBeeing cat1 = new arraylists.Cat("Aphrodite", 14);
        creatureList.add(new arraylists.Cat("Aphrodite", 14));
        // arraylists.LivingBeeing cat2 = new arraylists.Cat("Bob Tail", 13);
        creatureList.add(new arraylists.Cat("Bob Tail", 13));

        // arraylists.LivingBeeing human1 = new arraylists.Human("Black");
        creatureList.add(new arraylists.Human("Black"));
        // arraylists.LivingBeeing human2 = new arraylists.Human("Brown");
        creatureList.add(new arraylists.Human("Brown"));

        // arraylists.LivingBeeing lb1 = new arraylists.LivingBeeing(0, "Musa acuminata", 0, 25);
        creatureList.add(new arraylists.LivingBeeing(0, "Musa acuminata", 0, 25));
        // arraylists.LivingBeeing lb2 = new arraylists.LivingBeeing(0, "Cephalocereus", 0, 200);
        creatureList.add(new arraylists.LivingBeeing(0, "Cephalocereus", 0, 200));
        
               
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
