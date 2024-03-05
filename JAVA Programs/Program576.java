import java.util.*;

class Program576
{
    public static void Display(int iStart,int iEnd)
    {
        for(int i = iStart;i <= iEnd;i++)
        {
            System.out.println(i);
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

        Display(iNo1, iNo2);
    }
}