import java.util.*;

class Program569
{
    public static void DisplayPattern(int iValue)
    {
        for(int i = 1;i <= iValue;i++)
        {
            System.out.print("*\t");
        }
        for(int i = 1;i <= iValue;i++)
        {
            System.out.print("#\t");
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        DisplayPattern(iNo);

    }
}