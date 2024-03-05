import java.util.*;

class Program589
{
    public static void Display(int Arr[])
    {
        System.out.println("Elements which are even and divisible by 5 :");
        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                if(Arr[i] % 5 == 0)
                {
                    System.out.print(Arr[i]+"\t");
                }
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];

        System.out.println("Enter the elements : ");
        for(int i = 0;i < iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        Display(number);
    }
}