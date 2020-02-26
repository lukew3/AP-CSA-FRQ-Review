import java.util.*;
public class Kennel {
    private ArrayList <Pet> petList;
  // postcondition: for each pet in the kennel, its name followed
  //                by the result of a call to its speak method
  //                has been printed, one line per Pet
    public Kennel()
    {
        petList = new ArrayList <Pet> ();
    }

    public void addPet(Pet p)
    { petList.add(p); }

    public void allSpeak()
    {
        for (int i = 0; i < petList.size(); i++) {
            Pet pet = petList.get(i);
            System.out.println(pet.getName() + ": " + pet.speak());
        }
    }
}
