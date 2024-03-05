import java.util.*;

class Program568
{
    public static void ReverseTable(int iValue)
    {
        for(int i = 10;i >= 1;i--)
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

        ReverseTable(iNo);

    }
}