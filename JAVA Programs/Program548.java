import java.util.*;

class Program548
{
    public static void Display(int iValue)
    {
        for(int i = 1; i <= iValue;i++)
        {
            if((i % 2) == 0)
            {
                System.out.print(i+"\n");
            }
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