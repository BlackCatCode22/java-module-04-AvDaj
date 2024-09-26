package adam.zoo.com;
import java.util.Date;

public class Animal {
    static int numOfAnimal = 0;
    public Animal(){
        numOfAnimal++;
    }
    public Animal(String aName) {
        this.animalName = aName;
        numOfAnimal++;
    }

    // Create a few attributes (fields)
    private String sex;
    private int age = 0;
    private int weight = 0;
    private String animalID;
    private String animalName;
    private Date animalBirthday;
    private String animalColor;
    private String animalOrigin;
    private Date animalArrivalDate;

    // Create getters and setters
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGetAnimalID() {
        return animalID;
    }
    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public String getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Date getAnimalBirthday() {
        return animalBirthday;
    }
    public void setAnimalBirthday(Date animalBirthday) {
        this.animalBirthday = animalBirthday;
    }

    public String getAnimalColor() {
        return animalColor;
    }
    public void setAnimalColor(String animalColor){
        this.animalColor = animalColor;
    }

    public String getAnimalOrigin() {
        return animalOrigin;
    }
    public void setAnimalOrigin(String animalOrigin) {
        this.animalOrigin = animalOrigin;
    }

    public Date getAnimalArrivalDate() {
        return animalArrivalDate;
    }
    public void setAnimalArrivalDate(Date animalArrivalDate) {
        this.animalArrivalDate = animalArrivalDate;
    }

}
