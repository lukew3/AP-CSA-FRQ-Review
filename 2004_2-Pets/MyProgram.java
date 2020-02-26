import java.util.*;
public class MyProgram
{
    public static void main(String[] args)
    {
        Cat garfield = new Cat("Garfield");
        System.out.println(garfield.getName() + " says: " + garfield.speak());

        Dog rocky = new Dog("Rocky");
        System.out.println(rocky.getName() + " says: " + rocky.speak());

        LoudDog spike = new LoudDog("Spike");
        System.out.println(spike.getName() + " says: " + spike.speak());


        // ArrayList kennelOcupants = new ArrayList();
        // kennelOcupants.add(garfield);
        // kennelOcupants.add(rocky);
        // kennelOcupants.add(spike);

        Kennel myKennel = new Kennel();
        myKennel.addPet(garfield);
        myKennel.addPet(rocky);
        myKennel.addPet(spike);

        myKennel.allSpeak();

    }
}
