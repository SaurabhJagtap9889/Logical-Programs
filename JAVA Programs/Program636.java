import java.util.Scanner;

class Program636
{
    public static int CountSmall(String str)
    {
        int iCnt = 0;

        for(int i = 0;i < str.length();i++)
        { 
            char ch = str.charAt(i);
            if((ch >= 'a') && (ch <= 'z'))
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
        iRet = CountSmall(Arr);
        System.out.println("Small count in the string is : "+iRet);

    }
}