import java.util.Scanner;

class Program639
{
    public static void Reverse(String str)
    {
        String ReversedStr = "";

        for(int i = str.length()-1;i >= 0;i--)
        {
            ReversedStr = ReversedStr + str.charAt(i);
        }
        System.out.println(ReversedStr);
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();
        
        Reverse(Arr);
         

    }
}