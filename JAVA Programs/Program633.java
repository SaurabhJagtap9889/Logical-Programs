import java.util.Scanner;

class Program633
{
    public static boolean Check(int iDigit)
    {
        if(iDigit >= 0  && iDigit <= 9)
        {
            {
                return true;
            }
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
        boolean bRet = false;

        System.out.println("Enter the Digit : ");
        iNo = sobj.nextInt();

        bRet = Check(iNo);
        if(bRet == true)
        {
            System.out.println("It is a digit");
        }
        else
        {
            System.out.println("It is not a digit");
        }

    }
}