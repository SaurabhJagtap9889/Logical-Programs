import java.util.*;

class Program573
{
    public static int Difference(int iValue)
    {
        int iFactEven = 1;
        int iFactOdd = 1;
        for(int i = 1;i <= iValue;i++)
        {
            if( i % 2 == 0)
            {
                iFactEven = iFactEven * i;
            }
            if(i % 2 != 0)
            {
                iFactOdd = iFactOdd * i;
            }
        }
        return iFactEven - iFactOdd;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = Difference(iNo);
        System.out.println("Difference of Even factorial and odd factorial is : "+iRet);

    }
}