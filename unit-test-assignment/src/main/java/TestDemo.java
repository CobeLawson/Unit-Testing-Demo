import java.util.Random;

//A demo JUnit Test class
public class TestDemo {
	
	//Method takes two int parameters, determines if they are both positive, and if so it returns the sum of the two
    public static int addPositive (int a, int b) {
        if (a > 0 && b > 0) {
            return a+b;
        }
        else {
            throw new IllegalArgumentException("Both parameters must be positive!");
        }
    }

    //Method that acquires a random number, squares it, and returns the result
    public int randomNumberSquared() {
        int tempInt = getRandomInt();
        return tempInt*tempInt;
    }

    //Method that acquires a random int in the range of 1-10
    public int getRandomInt(){
        Random random = new Random();

        return random.nextInt(10) + 1;
    }
}