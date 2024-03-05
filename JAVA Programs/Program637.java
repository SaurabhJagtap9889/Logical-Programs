import java.util.Scanner;

class Program637
{
    public static int Difference(String str)
    {
        int iCapitalCnt = 0;
        int iSmallCnt = 0;

        for(int i = 0; i < str.length();i++)
        {
            char ch = str.charAt(i);
            if((ch >= 'A') && (ch <= 'Z'))
            {
                iCapitalCnt++;
            }
            if((ch >= 'a') && (ch <= 'z'))
            {
                iSmallCnt++;
            }
        }
        return iCapitalCnt - iSmallCnt;
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();

        int iRet = 0;
        iRet = Difference(Arr);
        System.out.println("Difference of Capital letter and small letter in the string is : "+iRet);

    }
}