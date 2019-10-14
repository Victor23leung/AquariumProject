import java.util.Arrays;
class Benign 
{   public static String[] days;
    public static void main(String[] args)
    {
       String[] days = {"Monday", "Tuesday",
           "Wednesday", "Thursday", "Friday", "Saturday",
           "Sunday"};
        
        System.out.println(Arrays.toString(days));
        
       String[] numbers = new String[100];
       for (int i=0; i<numbers.length; i++)
       {
           numbers[i] = "" + (i+1);
        }
    } // END PSVM
} // END BENIGN