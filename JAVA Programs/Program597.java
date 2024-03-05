import java.util.*;

class Program597
{
    public static void Range(int Arr[],int iStart,int iEnd)
    {

        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] > iStart && Arr[i] < iEnd)
            {
                System.out.print(Arr[i]+"\t");
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iNo1 = 0,iNo2 = 0;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];
        System.out.println("Enter the elements : ");
        for(int i = 0;i<iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        System.out.println("Starting point of Range is : ");
        iNo1 = sobj.nextInt();

        System.out.println("Ending point of Range is : ");
        iNo2 = sobj.nextInt();

        Range(number,iNo1,iNo2);
    }
}