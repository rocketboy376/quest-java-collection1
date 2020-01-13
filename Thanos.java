import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        ArrayList<Hero> heroes = new ArrayList<>(8);
        
        Hero natasha = new Hero("Black Widow", 34);
        Hero steve = new Hero("Captain America", 100);
        Hero vision = new Hero("Vision", 3);
        Hero tony = new Hero("Iron Man", 48);
        Hero wanda = new Hero("Scarlet Witch", 29);
        Hero odinson = new Hero("Thor", 1500);
        Hero bruce = new Hero("Hulk", 49);
        Hero stephen = new Hero("Doctor Strange", 42);
        
        
        heroes.add(natasha);
        heroes.add(steve);
        heroes.add(vision);
        heroes.add(tony);
        heroes.add(wanda);
        heroes.add(odinson);
        heroes.add(bruce);
        heroes.add(stephen);
        
        odinson.setAge(1501);
        
     // TODO 4 : Shuffle the heroes list
        Collections.shuffle(heroes);

        
     // TODO 5 : Keep only the half of the list
        //List<Hero> heroesReduced = heroes.subList(heroes.size()/2, heroes.size());  
        //System.out.println(heroes.size());
        heroes.subList(heroes.size()/2, heroes.size()).clear(); //remove the second half of the list -> (index 4 till index 7)
               
     //print as list
        //System.out.println(heroes + "\n");

     // TODO 6 : Loop throught the list and display the name of the remaining heroes
        
        for (Hero helden : heroes) {
            System.out.println(helden.getName());
        }        

    }
}
