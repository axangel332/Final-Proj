package test1;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;

public class test2 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner reader = new Scanner(new FileReader("numbers.txt"));

		int[] numbers = new int[10];

		while (reader.hasNext())

		{

			numbers[9] = reader.nextInt();

			numbers[8] = reader.nextInt();

			numbers[0] = reader.nextInt();
			
			numbers[1] = reader.nextInt();
            
            System.out.println("First Highest: " + numbers[9] + "\n");
            System.out.println("Second Highest: " + numbers[8] + "\n");
            System.out.println("First Lowest: " + numbers[0] + "\n");
            System.out.println("Second Lowest: " + numbers[1] + "\n");

		}

		reader.close();
	}
}