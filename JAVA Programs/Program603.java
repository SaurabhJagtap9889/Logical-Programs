import java.util.*;

class Program603
{
    public static int Sum(int iValue)
    {
        int iSumDigit = 0;
        while(iValue != 0)
        {
            iSumDigit = iSumDigit + (iValue % 10);
            iValue = iValue / 10;
        }
        return iSumDigit;
    }
    public static void Summation(int Arr[])
    {
        int iSum = 0;

        for(int i = 0; i < Arr.length;i++)
        {
            iSum = Sum(Arr[i]);
            System.out.print(iSum+"\t");
        }
            
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        Summation(number);
         
    }
}