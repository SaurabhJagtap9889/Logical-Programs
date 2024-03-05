import java.util.Scanner;

class Program641

{
    public static void Convert(String str)
    { 
        str = str.toUpperCase();
        System.out.println(str);
    }
    public static void main(String Arg[]) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String Arr = sobj.nextLine();
        
        Convert(Arr);
    }
}