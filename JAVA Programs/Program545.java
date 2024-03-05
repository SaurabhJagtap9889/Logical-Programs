import java.util.*;

class Program545
{
    public static void Display(int iValue)
    {
        if(iValue < 10)
        {
            System.out.println("Hello\n");
        }
        else
        {
            System.out.println("Demo\n");
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        Display(iNo);

    }
}