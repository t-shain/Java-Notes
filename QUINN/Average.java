import java.util.Arrays;
import java.util.Scanner;

public class Average {
    
    // private variables
    private final int NUM_SCORES = 5;
    private int [] data = new int[NUM_SCORES];
    private double mean;
    Scanner s = new Scanner(System.in);

    public Average() {
    }

    public void getUserData() {
        int score;
        System.out.print("Enter scores\n");
        for(int i = 0; i < NUM_SCORES; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            score = s.nextInt();
            data[i] = score;
        }
    }

    public void calculateMean() {
        int value;
        int sum = 0;
        for(int z = 0; z < NUM_SCORES; z++) {
            value = data[z];
            sum += value;
        }
        mean = (double)sum / (double)NUM_SCORES;
    }

    public String toString() {
        return String.format("List: %s\nMean: %.2f\n", Arrays.toString(data), mean);
    }

    
}
