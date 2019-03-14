import java.util.Scanner;

public class MaxNum
{
    public static void main(String[]args)
    {
        int max, num = 0, count = 1;
        Scanner input = new Scanner(System.in);
        //Header and prompts user for input
        System.out.print("\t\tFind the maximum number\n\n" +
                "Enter an integer <0 ends the input>: ");
        max = input.nextInt();

        if (max == 0)
        {
            System.out.println( "No numbers were entered except 0");
            System.exit(0);
        }

        while(max != 0)
        {
         if (max < num)
             {
             max = num;
             count = 1;
             }
         else if (num == max)
         {
             count++;
         }
         System.out.print( "Enter an integer <0 ends the input>: ");
         num = input.nextInt();
            if (num == 0)
            {
                System.out.println( "The maximum number is " + max +
                        "\nThe count for the max number is " + count);
                System.exit(0);
            }
        }
    }
}
