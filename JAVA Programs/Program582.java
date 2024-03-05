import java.util.*;

class Program582
{
    public static int Frequency(int iValue)
    {
        int iCnt = 0,iDigit = 0;

        while(iValue > 0)
        {
            iDigit = iValue % 10;
            {
                if(iDigit < 6)
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

        iRet = Frequency(iNo);
        System.out.println("Frequency of digit less than 6 is : "+iRet);

    }
}