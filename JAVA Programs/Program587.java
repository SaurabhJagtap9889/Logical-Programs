import java.util.*;

class Program587
{
    public static int Difference(int Arr[])
    {
        int iSumEven = 0,iSumOdd = 0;

        for(int i = 0;i < Arr.length ;i++)
        {
            if( Arr[i] % 2 == 0)
            {
                iSumEven = iSumEven + Arr[i];
            }
            if(Arr[i] % 2 != 0)
            {
                iSumOdd = iSumOdd + Arr[i];
            }
        }
        return iSumEven - iSumOdd;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];

        System.out.println("Enter the Elements");
        for(int i = 0;i < iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        iRet = Difference(number);
        System.out.println("Difference is : "+iRet);

    }
}