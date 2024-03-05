import java.util.*;

class Program600
{
    public static int Minimum(int Arr[])
    {
        int iMin = Arr[0];

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }
        return iMin;
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

        iRet = Minimum(number);
        System.out.println("Minimum element is : "+iRet);
    }
}