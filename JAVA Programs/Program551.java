import java.util.*;

class Program551
{
    public static int MultFact(int ivalue)
    {
        int iMult = 1;

        for(int i = 1;i < ivalue;i++)
        {
            if((ivalue % i) == 0)
            {
                iMult = iMult * i;
            }
        }
        return iMult;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iRet = 0; 

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = MultFact(iNo);
        System.out.println("Multiplication is : "+iRet);
    }
}