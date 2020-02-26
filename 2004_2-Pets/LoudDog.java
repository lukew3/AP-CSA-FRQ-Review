public class LoudDog extends Dog
{
    public LoudDog(String name)
    {
        super(name);
    }

    public String speak()
    {
        String dogSound = super.speak();
        return dogSound + " " + dogSound;
    }
}
