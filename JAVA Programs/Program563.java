import java.util.*;

class Program563
{
    public static void DisplayOdd(int iValue)
    {
        if(iValue != 0)
        {
            for(int i = 1;i <= iValue;i++)
            {
                if((i % 2) != 0)
                {
                    System.out.print(i+"\t");
                }
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        DisplayOdd(iNo);

    }
}