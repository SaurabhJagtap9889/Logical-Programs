import java.util.*;

class Program599
{
    public static int Maximum(int Arr[])
    {
        int iMax = Arr[0];

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
        }
        return iMax;
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

        iRet = Maximum(number);
        System.out.println("Maximum element is : "+iRet);
    }
}