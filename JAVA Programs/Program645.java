import java.util.Scanner;

class Program645
{
    public static boolean ChkChar(String str,char ch1)
    {
        for(int i = 0;i < str.length();i++)
        {
            char ch2 = str.charAt(i);
            if(ch2 == ch1)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        boolean bRet = false;
        bRet = ChkChar(Arr, ch);

        if(bRet == true)
        {
            System.out.println("Character is present");
        }
        else
        {
            System.out.println("Character is not present");
        }
    }
}