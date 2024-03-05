import java.util.*;

class Program547
{
    public static boolean CheckEvenOrOdd(int iValue)
    {
        if((iValue % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        boolean bRet = false;

        bRet = CheckEvenOrOdd(iNo);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Numebr is odd");
        }
    }
}