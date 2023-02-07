/** 
 Thaddeus Shain 
 CS121
 Opens a file and produces an outputfile that sorts the integers with the first file. 
 */
import java.io.*;
import java.util.Scanner;

public class NumberTester {
    public static void main(String[] args) throws IOException {

        // Reads the numbers.txt file line by line //
        Scanner s = new Scanner(new File("numbers.txt"));

        // Adds labels to chart
        addFormat();


        // Appends at the bottom of the numberSummary.txt file //
        FileWriter fw = new FileWriter("numberSummary.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        
        
        /* for each number this while loop goes through the three qualifications,
        if they are prime, if they have repeated digits or if they are even.
        Then prints them to a chart.
        */

        String repeated;
        String even;
        String prime;

        while (s.hasNext()) {
            int number = s.nextInt();

            if (isEven(number)) {
                even = "+";
            } else
                even = "-";

            if (isPrime(number)) {
                prime = "+";
            } else
                prime = "-";

            if (isRepeated(number)) {
                repeated = "+";
            }
            else
                repeated = "-";

            pw.printf("\n%-8s %-6s %-5s %-6s", number, repeated, even, prime);
        }
        s.close();
        pw.close();

    }

    /**
     * This method prints the labels of the chart
     */
    public static void addFormat() throws IOException {
        PrintWriter pnew = new PrintWriter("numberSummary.txt");
        pnew.printf("\s\s\s\s\s\s\sRepeat");
        pnew.printf("\n%-5s %-6s %-5s %-5s", "Number", "Digits", "Even", "Prime");
        pnew.close();

    }

    /**
     * given a value returns a boolean if value is even.
     * @param num value of number.txt line
     * @return returns a true if value is even, else returns false
     */
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;

    }

    /**
     * given a value returns a boolean true if value is prime.
     * @param num value from numbers.txt file
     * @return a boolean value
     */
    public static boolean isPrime(int num) {
        // if statement that returns true if number is 1 and false if number is less than 1
        if (num < 1) {
            return false;
        } else if (num == 1) return true;

        // returns true if value is prime else false
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if number from file has consecutive repeated numbers.
     * @param num value from numbers.txt file
     * @return a boolean true if value has consecutive repeated numbers else false.
     */
    public static boolean isRepeated(int num) {
        String numString = "" + num;
        for(int i = 0; i < numString.length() -1; i++){
            if(numString.charAt(i) == numString.charAt(i + 1))
                return true;
        }
        return false;


    }
}
