import java.util.Scanner;

class Program647
{
    public static int FirstChar(String str,char ch1)
    {
        int FirstOcc = 0; 
         
        for(int i = 0;i < str.length();i++)
        {
            char ch2 = str.charAt(i);
            if(ch2 == ch1)
            {
                FirstOcc = i;
            }
        }
        return FirstOcc;
        
        
         
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        int iRet = 0;;
        iRet = FirstChar(Arr, ch);

        System.out.println("Frequency of character is : "+iRet);
    }
}