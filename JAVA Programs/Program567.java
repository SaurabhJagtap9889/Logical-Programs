import java.util.*;

class Program567
{
    public static void DisplayTable(int iValue)
    {
        for(int i = 1;i <= 10;i++)
        {
            System.out.println(iValue*i);
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        DisplayTable(iNo);

    }
}