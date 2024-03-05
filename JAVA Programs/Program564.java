import java.util.*;

class Program564
{
    public static void MultipleDisplay(int iValue)
    {
        if(iValue != 0)
        {
            for(int i = 1;i <= 5;i++)
            {
                System.out.println(i * iValue );
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        MultipleDisplay(iNo);

    }
}