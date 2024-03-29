/* 5)
Write Java program which accept N numbers from user and display all such elements which are multiple of 11.
*/

import java.util.Scanner;

class Assignment33Program5
{
    public static void Display(int Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt] % 11) == 0)
            {
                System.out.println("Elements are : "+Arr[iCnt]);
            }
        }
    }

    public static void main(String arg[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of N:");
        int iNo = scanner.nextInt();

        int[] elements = new int[iNo];

        System.out.println("Enter the elements:");
        for (int i = 0; i < iNo; i++) 
        {
            elements[i] = scanner.nextInt();
        }
        
        Display(elements);

    }
}