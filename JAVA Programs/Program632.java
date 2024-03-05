import java.util.Scanner;

class Program632
{
    public static boolean Check(char cValue)
    {
        if((cValue >= 'A') && (cValue <= 'Z'))
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

        char ch = '\0';
        boolean bRet = false;

        System.out.println("Enter the character : ");
        ch = sobj.next().charAt(0);

        bRet = Check(ch);
        if(bRet == true)
        {
            System.out.println("It is capital letter");
        }
        else
        {
            System.out.println("It is not capital letter");
        }

    }
}