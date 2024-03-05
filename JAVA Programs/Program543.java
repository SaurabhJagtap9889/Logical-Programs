import java.util.*;

class Program543
{
    public static boolean divisible(int iValue)
    {
        if( iValue % 5 == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bret = false;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        bret = divisible(iNo);
        
        if(bret == true)
        {
            System.out.println("Number is divisible by 5");
        }
        else
        {
            System.out.println("Number is not divisible by 5");
        }
    }
}