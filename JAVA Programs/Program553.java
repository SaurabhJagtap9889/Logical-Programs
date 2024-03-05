import java.util.*;

class Program553
{
    public static void Display(int ivalue)
    {

        for(int i = 1;i <= ivalue;i++)
        {
            if((ivalue % i) != 0)
            {
                System.out.print(i+"\n");
            }
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