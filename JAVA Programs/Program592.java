import java.util.*;

class Program592
{
    public static boolean Frequency(int Arr[])
    {

        for(int i = 0; i < Arr.length;i++)
        {
            if(Arr[i]  == 11)
            {
                return true;
            }
        }   
        return false;
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter the number of elements : ");
        iNo = sobj.nextInt();

        int number[] = new int[iNo];

        System.out.println("Enter the elements : ");
        for(int i = 0;i < iNo;i++)
        {
            number[i] = sobj.nextInt();
        }

        bRet = Frequency(number);
        if(bRet == true)
        {
            System.out.println("Array contains 11 in it");
        }
        else
        {
            System.out.println("Array does not contain 11 in it");
        }
         
    }
}