import java.util.Scanner;

class Program638
{
    public static boolean Check(String str)
    {
        for(int i = 0;i < str.length();i++)
        { 
            char ch = str.charAt(i);
            if((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U') || (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        boolean bRet = false;
        bRet = Check(Arr);
        if(bRet == true)
        {
            System.out.println("It contains a vowels");
        }
        else
        {
            System.out.println("It not contains vowels");
        }

    }
}