import java.util.*;

class Program591
{
    public static int Difference(int Arr[])
    {
        int iCntEven = 0,iCntOdd = 0;

        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i] % 2 == 0)
            {
                iCntEven++;
            }
            else
            {
                iCntOdd++;
            }
        }
        return iCntEven - iCntOdd;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];

        System.out.println("Enter the elements : ");
        for(int i = 0;i < iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        iRet = Difference(number);
        System.out.println("Differnece between frequency of EvenCount and OddCount is : "+iRet);
    }
}