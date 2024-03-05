import java.util.*;

class Program571
{
    public static int Evenfactorial(int iValue)
    {
        int iFact = 1;
        for(int i = 1;i <= iValue;i++)
        {
            if( i % 2 == 0)
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

        iRet = Evenfactorial(iNo);
        System.out.println("Factorial of even count is : "+iRet);

    }
}