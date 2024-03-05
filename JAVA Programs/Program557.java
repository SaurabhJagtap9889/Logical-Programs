import java.util.*;

class Program557
{
    public static boolean Greater(int ivalue)
    {
        if(ivalue > 100)
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
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        bRet = Greater(iNo);

        if(bRet == true)
        {
            System.out.println("Number is greater than 100");
        }
        else
        {
            System.out.println("Number is not greater than 100");
        }

    }
}