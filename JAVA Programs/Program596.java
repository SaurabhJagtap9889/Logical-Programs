import java.util.*;

class Program596
{
    public static int LastOccurance(int Arr[],int iValue)
    {

        for(int i = Arr.length - 1;i >= 0;i--)
        {
            if(Arr[i] == iValue)
            {
                return i;
            }
        }
        return -1;
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

        iRet = LastOccurance(number,iNo1);
        System.out.println("Last occurance of given number is : "+iRet);
    }
}