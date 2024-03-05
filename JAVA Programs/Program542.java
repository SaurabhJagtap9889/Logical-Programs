import java.util.*;

class Program542
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        for(int i = iNo;i > 0;i--)
        {
            System.out.print(i+"\n");
        }
    }
}