import java.util.*;

class Program598
{
    public static int ProductOdd(int Arr[])
    {
        int iMult = 1;

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] % 2 != 0)
            {
                iMult = iMult * Arr[i];
            }
        }
        return iMult;
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

        iRet = ProductOdd(number);
        System.out.println("Product of all odd element is : "+iRet);
    }
}