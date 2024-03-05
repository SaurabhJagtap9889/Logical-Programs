import java.util.Scanner;

class Program642
{
    
    public static String Toggle(String str)
    { 
        StringBuilder strX = new StringBuilder();
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch >= 'A') && (ch <= 'Z'))
            {
                strX.append(Character.toLowerCase(ch));
            }
            else if((ch >= 'a') && (ch <= 'z'))
            {
                strX.append(Character.toUpperCase(ch));
            }
            else
            {
                strX.append(ch);
            }
        }
        return strX.toString();
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();
        
        String sRet = Toggle(Arr);
        System.out.println(sRet);
    }
}
