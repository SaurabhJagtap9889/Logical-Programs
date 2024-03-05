import java.util.*;

class Program577
{
    public static void RangeEven(int iStart,int iEnd)
    {
        for(int i = iStart;i <= iEnd;i++)
        {
            if( i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0,iNo2 = 0;

        System.out.println("Enter the start point of Range : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the End point of range : ");
        iNo2 = sobj.nextInt();

        RangeEven(iNo1, iNo2);
    }
}