import java.util.*;

class Program570
{
    public static int Convert(int iValue)
    {
        int iDollar = 70;
        int iAns = 0;

        iAns = iDollar * iValue;
        return iAns;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();
        
        iRet = Convert(iNo);
        System.out.println("Convert the dollar into Rs is : "+iRet);


    }
}