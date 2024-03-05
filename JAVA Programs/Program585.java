import java.util.*;

class Program585
{
    public static int DigitMult(int iValue)
    {
        int iCnt = 0,iDigit = 0,iMult = 1;

        while(iValue > 0)
        {
            iDigit = iValue % 10;
            {
                iMult = iMult * iDigit;
            }
            iValue = iValue / 10;
        }
        return iMult;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = DigitMult(iNo);
        System.out.println("Multiplication of digits are : "+iRet);

    }
}