import java.util.*;

class Program593
{
    public static int Frequency(int Arr[])
    {
        int iCnt = 0;

        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i]  == 11)
            {
                iCnt++;
            }
        }   
        return iCnt;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];

        System.out.println("Enter the elements : ");
        for(int i = 0;i < iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        iRet = Frequency(number);
        System.out.println("Frequency of 11 is : "+iRet);
    }
}