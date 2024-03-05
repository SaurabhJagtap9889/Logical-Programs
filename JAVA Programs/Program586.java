import java.util.*;

class Program586
{
    public static int Sum(int iValue)
    {
        int iDigit = 0,iSumEven = 0,iSumOdd = 0;

        while(iValue > 0)
        {
            iDigit = iValue % 10;
            {
                if((iDigit % 2) == 0)
                {
                    iSumEven = iSumEven + iDigit;
                }
                if((iDigit % 2) != 0)
                {
                    iSumOdd = iSumOdd + iDigit;
                }
            }
            iValue = iValue / 10;
        }
        return iSumEven - iSumOdd;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = Sum(iNo);
        System.out.println("Differnece of Even Sum and Odd sum is : "+iRet);

    }
}