import java.util.Scanner;
public class Main {

                public static void main(String [] args) {
                Scanner sc=new Scanner(System.in);

                // creating objects of each method
                Transmission obj1 =new Transmission();
                Manual obj2 =new Manual();
                AMT obj3 =new AMT();
                Automatic obj4 =new Automatic();
                Auto_CVT obj5 =new Auto_CVT();
                Auto_DCT obj6 =new Auto_DCT();

                // loop while going on until one correct model no entered
                int count=0;
                do{
                    count=0;

                // taking input from user

                System.out.println("   Welcome to Lukxtech Transmissions   ");
                System.out.println("--------------------------------------------");
                System.out.println("Type             Model no");
                System.out.println("Manual -         MP 4, MP 5, MP 6, MD 5, MD 6");
                System.out.println("Automatic -      AMT P4, AMT D5");
                System.out.println("Auto-CVT -       CVT 6");
                System.out.println("Auto-DCT -       DCT 8");
                System.out.println("--------------------------------------------");
                System.out.println("Enter model number for specifications -");
                String input=sc.nextLine();

                //Initializing variables & value

                 if (input.equalsIgnoreCase("MP 4")) {
                     obj2.showSpecs("Manual Transmission", "MP 4", 4, 2.540, 1.920, 1.510, 1.000);
                 } else if (input.equalsIgnoreCase("MP 5")) {
                     obj2.showSpecs("Manual Transmission", "MP 5", 5, 3.545, 1.904, 1.280, 0.914, 0.757);
                 } else if (input.equalsIgnoreCase("MP 6")) {
                     obj2.showSpecs("Manual Transmission", "MP 6", 6, 3.010, 2.070, 1.430, 1.000, 0.710, 0.570);
                 } else if (input.equalsIgnoreCase("MD 5")) {
                     obj2.showSpecs("Manual Transmission", "MD 5", 5, 3.545, 1.904, 1.233, 0.911, 0.725);
                 } else if (input.equalsIgnoreCase("MD 6")) {
                     obj2.showSpecs("Manual Transmission", "MD 6", 6, 3.640, 2.150, 1.360, 1.000, 0.750, 0.630);
                 } else if (input.equalsIgnoreCase("AMT P4")) {
                     obj3.showSpecs("Automatic Transmission", "AMT P4", 4, 2.540, 1.920, 1.510, 1.000);
                 } else if (input.equalsIgnoreCase("AMT D5")) {
                     obj3.showSpecs("Automatic Transmission", "AMT D5", 5, 2.950, 1.940, 1.340, 1.000, 0.630);
                 } else if (input.equalsIgnoreCase("CVT 6")) {
                     obj5.showSpecs("Automatic-CVT", "CVT 6", "6 (Simulated)", 2.631, 1.440, 1.165, 0.906, 0.680, 0.499);
                 } else if (input.equalsIgnoreCase("DCT 8")) {
                     obj6.showSpecs("Automatic-DCT", "DCT 8", "8 (Simulated)", 4.714, 3.143, 2.106, 1.667, 1.285, 1.000, 0.839, 0.667);
                 } else {
                     count=1;
                     System.out.println("The model number is invalid");
                 }
             }
             while (count==1);
        }
}