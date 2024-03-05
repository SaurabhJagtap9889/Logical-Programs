import java.util.Scanner;

class Program649
{
    public static String Reverse(String str)
    {
        StringBuilder ReverseX = new StringBuilder(); 
         
        for(int i = str.length()-1;i >= 0;i--)
        {
            char ch = str.charAt(i);
            ReverseX = ReverseX.append(ch);

        }
        return ReverseX.toString();
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String Arr = sobj.nextLine();

       
        String sRet = Reverse(Arr);
        System.out.println(sRet);

         
    }
}


 