import java.util.Scanner;

class Program635
{
    public static int CountCapital(String str)
    {
        int iCnt = 0;

        for(int i = 0;i < str.length();i++)
        { 
            char ch = str.charAt(i);
            if((ch >= 'A') && (ch <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        int iRet = 0;
        iRet = CountCapital(Arr);
        System.out.println("Capital count in the string is : "+iRet);

    }
}