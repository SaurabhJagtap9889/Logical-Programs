import java.util.Scanner;

class Program646
{
    public static int CountChar(String str,char ch1)
    {
        int iCnt = 0;
        for(int i = 0;i < str.length();i++)
        {
            char ch2 = str.charAt(i);
            if(ch2 == ch1)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        int iRet = 0;;
        iRet = CountChar(Arr, ch);

        System.out.println("Frequency of character is : "+iRet);
    }
}