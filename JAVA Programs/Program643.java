import java.util.*;

class Program643
{
    public static String DisplayDigit(String str)
    {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9')
            {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        String sRet = DisplayDigit(Arr);
        System.out.println("Digit in the string is : "+sRet);
    }
}