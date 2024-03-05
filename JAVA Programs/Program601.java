import java.util.*;

class Program601
{
    public static int Differnece(int Arr[])
    {
        int iMax = Arr[0];
        int iMin = Arr[0];

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }
        return iMax - iMin;
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

        iRet = Differnece(number);
        System.out.println("Differnece between Maximum and Minimum element is : "+iRet);
    }
}