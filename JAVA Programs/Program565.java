import java.util.*;

class Program565
{
    public static void Display(int iValue)
    {
        if(iValue < 50)
        {
            System.out.println("Number is Small");
        }
        else if((iValue > 50)  && (iValue < 100))
        {
            System.out.println("Number is Medium");
        }
        else
        {
            System.out.println("Number is Large");
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