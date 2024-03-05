import java.util.Scanner;

class Program644
{
    public static int CountSpaces(String str)
    {
        int icnt = 0;
        for(int i = 0;i < str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
                icnt++;
            }
        }
        return icnt;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        int iRet = 0;
        iRet = CountSpaces(Arr);
        System.out.println("White spaces in the string is : "+iRet);

    }
}