import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
      Scanner reader = new Scanner(System.in);
      Console teclado = System.console();

      
      System.out.println("Application to store N people names!");
      System.out.println("=========================================================");
      
      System.out.println("how many people do you want inform ?");
      
      int peopleNumber = reader.nextInt();

      String[] peopleNames = new String[peopleNumber - 1];

      for (int x = 0; x < peopleNumber; x++) {
        System.out.println("inform the name of people " + (x + 1));
          String peopleName = teclado.readLine();
          if (peopleName.matches("^[0-9]*$")){
            throw new Exception ("numbers are present in the name");
          }
          peopleNames[x] = peopleName;
      }
    }
}
