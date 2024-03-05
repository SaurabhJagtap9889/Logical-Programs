import java.util.*;

class Program607
{
    public static void Display(int iValue)
    {

        for(int i = iValue;i >= 1;i--)
        {
            System.out.print("#\t"+i+"\t*\t");
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