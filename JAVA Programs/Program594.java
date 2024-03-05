import java.util.*;

class Program594
{
    public static int Frequency(int Arr[],int iValue)
    {
        int iCnt = 0;

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == iValue)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iNo1 = 0,iRet = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        System.out.println("Frequency finding number : ");
        iNo1 = sobj.nextInt();

        iRet = Frequency(number,iNo1);
        System.out.println("frequency of given number is : "+iRet);
    }
}