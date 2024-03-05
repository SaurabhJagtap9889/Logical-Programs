import java.util.*;

class Program580
{
    public static boolean CheckZero(int iValue)
    {
        if(iValue < 0)
        iValue = -iValue;
            
        while(iValue > 0)
        {
           if(iValue % 10 == 0)
           {
            return true;
           }
           iValue = iValue / 10;     
        }    
        return false;      
    }
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        bRet = CheckZero(iNo);

        
        if(bRet == true)
        {
            System.out.println("It contains zero");
        }
        else
        {
            System.out.println("It not contain zero");
        }
    }
}

 