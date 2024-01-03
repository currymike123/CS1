import java.util.Scanner;
class TestException5
{
     public static void main(String[] args)
     {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number");
        int x = kb.nextInt();
        try
        {
           if (x < 100)
              throw new TooSmallException();
           if (x > 200)
              throw new TooLargeException(x + " is too large");
        }
        catch (TooSmallException e)
        {
           System.out.println(e.getMessage());
           System.out.println("Next time enter larger number");
        }
        catch (TooLargeException e)
        {
           System.out.println(e.getMessage());
           System.out.println("Next time enter smaller number");
        }
     }
}
//================================================
class TooSmallException extends Exception
{
   public TooSmallException()
   {
      super("Number too small");
   }
   //----------------------------------
   public TooSmallException(String msg)
   {
      super(msg);
   }
}
//================================================
class TooLargeException extends Exception
{
   public TooLargeException()
   {
      super("Number too large");
   }
   //----------------------------------
   public TooLargeException(String msg)
   {
      super(msg);
   }
}

