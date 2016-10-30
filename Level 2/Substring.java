import java.util.Scanner;
public class Substring {
    public static void main (String[] Args){
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a Saying:");
      String Saying = input.nextLine();
      
      int WCount = 1;
    
      for(int i=0; i<Saying.length() ;++i)
      {
          if(Saying.charAt(i)==' ')
          WCount++;
        }
      
      System.out.println("The Number of words in your saying is "+ WCount); 
      int length = Saying.length();
      
      for (int x = 0; x < Saying.length(); ++x)
      {
       System.out.print(Saying.charAt(length-1));
       length = length - 1;
       
       }
       
       System.out.println(" ");
       System.out.println("Enter a Word:");
       String Word = input.nextLine();
       
       int Vowelnumber = 0;
       Word = (Word.toLowerCase());
       
      for (int i = 0; i < Word.length(); ++i)
      {
          char Vowels = Word.charAt(i);
          if (Vowels == 'a' || Vowels == 'e' || Vowels == 'i' || Vowels == 'o' || Vowels == 'u')
          Vowelnumber = Vowelnumber + 1;
      }
    
      System.out.println("Number of vowels in word = "+ Vowelnumber);
      int Constenant = (Word.length()) - Vowelnumber;
      System.out.println("Number of constenants in word = "+ Constenant);
    } 
}
        