import java.util.Random;

public class Part1
{
    public static void main(String[] args)
    {
        // Task 1: Declare array and fill with random values
        int[] dataPoints = new int[100];

        Random rnd = new Random();

        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 2: Display values in one line separated by " | "
        System.out.println("DataPoints Values:");

        for(int i = 0; i < dataPoints.length; i++)
        {
            if(i < dataPoints.length - 1)
            {
                System.out.print(dataPoints[i] + " | ");
            }
            else
            {
                System.out.print(dataPoints[i]);
            }
        }


        int sum = 0;

        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("\n\nThe sum of the values in dataPoints is: " + sum);
        System.out.println("The average of the values in dataPoints is: " + average);
    }
}