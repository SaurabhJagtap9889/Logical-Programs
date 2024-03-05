import java.util.*;

class Program581
{
    public static int CountDigit(int iValue)
    {
        int iCnt = 0,iDigit = 0;

        while(iValue > 0)
        {
            iDigit = iValue % 10;
            {
                if(iDigit == 2)
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

        iRet = CountDigit(iNo);
        System.out.println("Count of 2 digits in the number is : "+iRet);

    }
}