import java.util.*;

class Program579
{
    public static void DisplayReverse(int iValue)
    {
        int iDigit = 0;
        while(iValue != 0)
        {
            iDigit = iValue % 10;
            System.out.println(iDigit);
            iValue = iValue/10;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        DisplayReverse(iNo);
     }
}