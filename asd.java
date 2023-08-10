package test1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class asd {
	static Scanner console = new Scanner(System.in);
    public static void main(String[] args) {
        String outputFilePath = "numbers.txt";  // Update this with the desired output file path
        
        try {
            FileWriter writer = new FileWriter(outputFilePath);

            // Loop to write numbers from 1 to 10 to the file
    		int[] numbers = new int[10];
   		 for (int i = 0; i < 10; i++) {
    			
    	        System.out.print("Enter number " + (i + 1) + ": ");
    	        numbers[i] = console.nextInt();
    			System.out.println();
                writer.write(Integer.toString(i));
                writer.write("First Highest: " + numbers[9] + "\n");
                writer.write("Second Highest: " + numbers[8] + "\n");
                writer.write("First Lowest: " + numbers[0] + "\n");
                writer.write("Second Lowest: " + numbers[1] + "\n");
                writer.write(System.lineSeparator());  // Write a new line after each number
            }

            writer.close();
            Arrays.sort(numbers);
            System.out.println("First Highest: " + numbers[9] + "\n");
            System.out.println("Second Highest: " + numbers[8] + "\n");
            System.out.println("First Lowest: " + numbers[0] + "\n");
            System.out.println("Second Lowest: " + numbers[1] + "\n");
     
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
