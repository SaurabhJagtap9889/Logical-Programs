import java.util.*;

class Program555
{
    public static int diffFact(int ivalue)
    {
        int isumfact = 0,isumnonfact = 0;
        for(int i = 1;i < ivalue;i++)
        {
            if((ivalue % i) == 0)
            {
                isumfact = isumfact + i;
            }

            if((ivalue % i) != 0)
            {
                isumnonfact = isumnonfact + i;
            }
        }
        return isumfact - isumnonfact;
    }

    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0,iRet = 0;

        System.out.println("Enter the number : ");
        iNo = sobj.nextInt();

        iRet = diffFact(iNo);
        System.out.println("Difference betwwen sumfact and nonsumfac is : "+iRet);
    }
}