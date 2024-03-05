import java.util.*;

class Program566
{
    public static int factorial(int iValue)
    {
        int iFact = 1;
        if(iValue < 0)
        {
            iValue = -iValue;
        }
        {
            for(int i = 1;i <= iValue;i++)
            {
                iFact = iFact * i;
            }
            return iFact;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = factorial(iNo);
        System.out.println("factorial is : "+iRet);

    }
}