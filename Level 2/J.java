import java.util.Scanner;
public class J{
    public static void main (String[] Args){
        
          String word = "RANDOM";
          String Guess = null;
          char L1 = '?' ; 
          char L2 = '?' ;
          char L3 = '?' ;
          char L4 = '?' ;
          char L5 = '?' ;
          char L6 = '?' ;
          
          for (int i = 0; i < 10; ++i) {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a guess of the 6 letter word: ");
          Guess= input.nextLine();
          Guess = Guess.toUpperCase();
          if (Guess.charAt(0)== 'R'){
            System.out.print("R");
            L1 = 'R';
          }
          else {
            System.out.print("?");
          }
            
            if (Guess.charAt(1)== 'A'){
            System.out.print("A");
            L2 = 'A';
          }
          else {
            System.out.print("?");
            L2 = '?';
          }
          
            if (Guess.charAt(2)== 'N') {
            System.out.print("N");
            L3 = 'N';
          }
          else {
            System.out.print("?");
            L3 = '?';
          }
          
          if (Guess.charAt(3)== 'D') {
            System.out.print("D");
            L4 = 'D';
          }
          else{
            System.out.print("?");
            L4 = '?';
          }
        
            if (Guess.charAt(4)== 'O') {
            System.out.print("O");
            L5 = 'O';
          } else {
            System.out.print("?");
            L5 = '?';
          }
           if(Guess.charAt(5)== 'M') {
            System.out.print('M');
            L6 = 'M';
          }  else {
            System.out.print("?");
            L6 = '?';
          }
          
          if ((L1 == '?') || (L2 == '?')|| (L3 == '?')|| (L4 == '?')|| (L5 == '?')|| (L6 == '?')){
           System.out.println(" ");
           System.out.println("Try again: ");
          }
          else { 
              System.out.println(" ");
              System.out.println("Well done you guessed correctly");
              System.exit(5);
          }
}
}
}