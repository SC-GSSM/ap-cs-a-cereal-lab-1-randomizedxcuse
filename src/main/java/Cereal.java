/**
 * Cereal.java
 *
 * @author – Your name
 * @author – Class period
 *
 */
public class Cereal
{
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups
    private String name;
    private int calories;
    private int fiber; 
    private int carbs;
    private double cups;

    // constructor that creates a cereal object
    public Cereal(String n, int cal, int f, int car, double cup){
        name = n;
        calories = cal;
        fiber = f;
        carbs = car;
        cups = cup;
    }

    // accessor methods for each instance variable
    public String getName(){
            return name;
    }
    public int getFiber(){
            return fiber;
    }
    public int getCalories(){
            return calories;
    }
    public int getCarbs(){
            return carbs;
    }
    public double getCups(){
            return cups;
    }

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */
    public String toString(){
        return "Cereal: "+name+", "+calories+", "+fiber+", "+carbs+", "+cups;
    }

}


