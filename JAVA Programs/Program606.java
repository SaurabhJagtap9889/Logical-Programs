import java.util.*;

class Program606
{
    public static void Display(int iValue)
    {

        for(int i = 1;i <= iValue;i++)
        {
            System.out.print((i * 2) +"\t");
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        Display(iNo);
    }
}