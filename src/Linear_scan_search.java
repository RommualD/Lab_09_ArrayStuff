import java.util.Random;
import java.util.Scanner;

public class Linear_scan_search
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int[] dataPoints = new int[100];

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        System.out.print("Enter a value to search for (1–100): ");
        int target = in.nextInt();

        int count = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == target)
            {
                count++;
            }
        }

        System.out.println("The value " + target + " was found " + count + " times in the array.");

        System.out.print("\nEnter another value to search for (1–100): ");
        int target2 = in.nextInt();

        int position = -1;

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == target2)
            {
                position = i;
                break;
            }
        }

        if(position != -1)
        {
            System.out.println("The value " + target2 + " was found at array index " + position);
        }
        else
        {
            System.out.println("The value " + target2 + " was NOT found in the array.");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("\nThe minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Call average method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;

        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }

        return (double) sum / values.length;
    }
}