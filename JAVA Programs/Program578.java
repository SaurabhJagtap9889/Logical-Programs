import java.util.*;

class Program578
{
    public static int RangeEvenSum(int iStart,int iEnd)
    {
        int iSum = 0;
        for(int i = iStart;i <= iEnd;i++)
        {
            if( i % 2 == 0)
            {
                iSum = iSum + i;
            }
        }
        return iSum;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0,iRet = 0;

        System.out.println("Enter the start point of Range : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the End point of range : ");
        iNo2 = sobj.nextInt();

        iRet = RangeEvenSum(iNo1, iNo2);
        System.out.println("Sum of Range of Even Number is : "+iRet);
    }
}