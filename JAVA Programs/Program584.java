import java.util.*;

class Program584
{
    public static int CountOdd(int iValue)
    {
        int iCnt = 0,iDigit = 0;

        while(iValue > 0)
        {
            iDigit = iValue % 10;
            {
                if((iDigit % 2) != 0)
                {
                    iCnt++;
                }
            }
            iValue = iValue / 10;
        }
        return iCnt;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = CountOdd(iNo);
        System.out.println("Frequency of odd count is : "+iRet);

    }
}