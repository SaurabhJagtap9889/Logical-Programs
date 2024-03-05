import java.util.*;

class Program546
{
    public static void Display(int iNo1,int iNo2)
    {
        for(int i = 1;i <= iNo2;i++)
        {
            System.out.print(iNo1+"\n");
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int dispalyNo = 0,timeNo = 0;

        System.out.println("Enter the number : ");
        dispalyNo = sobj.nextInt();

        System.out.println("Enter the number : ");
        timeNo = sobj.nextInt();

        Display(dispalyNo, timeNo);
    }
}