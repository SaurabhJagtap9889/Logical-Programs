import java.util.Scanner;

class Program648 
{
    public static int findLastOccurrenceIndex(String str, char target) 
    {
        int lastIndex = 0;

        for(int i = str.length()-1; i >= 0; i--) 
        {
            if (str.charAt(i) == target) 
            {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sobj.nextLine();

        System.out.println("Enter a character:");
        char target = sobj.next().charAt(0);

        int lastIndex = findLastOccurrenceIndex(input, target);

    
        System.out.println("Last occurrence index of '" + target + "' in the string: " + lastIndex);
         
    }

    
}


 