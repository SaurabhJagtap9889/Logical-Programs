import java.util.*;

class Program562
{
    public static void Display(int iValue)
    {
        if(iValue != 0)
        {
            for(int i = -iValue;i <= iValue;i++)
            {
                System.out.print(i+"\t");
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