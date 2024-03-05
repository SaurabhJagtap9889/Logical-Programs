import java.util.*;

class Program604
{
    public static void Display(int iValue)
    {
        char ch = 'A';

        for(int i = 1;i <= iValue;i++)
        {
            System.out.print(ch+"\t");
            ch++;
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