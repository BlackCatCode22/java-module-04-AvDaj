package adam.zoo.com;

public class Hyena extends adam.zoo.com.Animal {
    static int numOfHyenas = 0;

    // Constructor
    public Hyena(String hyenaName) {
        super(hyenaName);
        numOfHyenas++;
    }

}
