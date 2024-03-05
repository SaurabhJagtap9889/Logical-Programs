import java.util.*;

class Program572
{
    public static int Oddfactorial(int iValue)
    {
        int iFact = 1;
        for(int i = 1;i <= iValue;i++)
        {
            if( i % 2 != 0)
            {
                iFact = iFact * i;
            }
        }
        return iFact;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = Oddfactorial(iNo);
        System.out.println("Factorial of odd count is : "+iRet);

    }
}