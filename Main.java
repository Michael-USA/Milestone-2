import Code.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

      Scanner scnr = new Scanner(System.in);
      WalshTable table = new WalshTable();
      Station[] stations = new Station[4];
      
      for (int i = 0; i < 4; i++) {
          System.out.println("Enter the bit value for Station " + (i + 1) + ":");
          stations[i] = new Station(table, scnr.nextInt());
      }

      System.out.println("\n" + table.toString(stations));
      table.printDataArray(stations);
    }
}

