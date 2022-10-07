
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Trycatch_Act {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> Motorcycle = new ArrayList<String>();


        
        System.out.println("#======================================");
        System.out.println("#          Choose an index            #");
        System.out.println("#                                     #");
        System.out.println("#            [0,1,2,3,4]              #");
        System.out.println("#                                     #");
        System.out.println("#======================================");
        System.out.print("\nEnter your choosen index:");
        int input = sc.nextInt();
    //String motorcycleName;
    //String motorcycleBrand;
    //VariableType motorcycleColor;

        Motorcycle<String> p1 = new Motorcycle<String>();
        p1.setMotorcycleName("KLX 150"); 
        p1.setMotorcycleColor("Green");
        p1.setMotorcycleBrand("Kawasaki");
        Motorcycle.add("\"" + p1.getMotorcycleName() + "\"" + " It is a" + p1.getMotorcycleColor() + " colored "+ p1.getMotorcycleBrand());
    
        Motorcycle<String> p2 = new Motorcycle<String>();
        p2.setMotorcycleName("Raider 150 Fi"); 
        p2.setMotorcycleColor("Dark Blue");
        p2.setMotorcycleBrand("Suzuki");
        Motorcycle.add("\"" + p2.getMotorcycleName() + "\"" + " It is a" + p2.getMotorcycleColor() + " colored "+ p2.getMotorcycleBrand());

        Motorcycle<String> p3 = new Motorcycle<String>();
        p3.setMotorcycleName("XRM 125"); 
        p3.setMotorcycleColor("Blue");
        p3.setMotorcycleBrand("Honda");
        Motorcycle.add("\"" + p3.getMotorcycleName() + "\"" + " It is a" + p3.getMotorcycleColor() + " colored "+ p3.getMotorcycleBrand());
   
        Motorcycle<String> p4 = new Motorcycle<String>();
        p4.setMotorcycleName("XR 150l"); 
        p4.setMotorcycleColor("Black");
        p4.setMotorcycleBrand("Honda");
        Motorcycle.add("\"" + p4.getMotorcycleName() + "\"" + " It is a" + p4.getMotorcycleColor() + " colored "+ p4.getMotorcycleBrand());

        Motorcycle<String> p5 = new Motorcycle<String>();
        p5.setMotorcycleName("CRF 150L"); 
        p5.setMotorcycleColor("Black");
        p5.setMotorcycleBrand("Honda");
        Motorcycle.add("\"" + p5.getMotorcycleName() + "\"" + " It is a" + p5.getMotorcycleColor() + " colored "+ p5.getMotorcycleBrand()); 


        try {
            if (input < 0) {
                sc.close();
                throw new MotorcycleException("Invalid input!! TRY ENTERING A POSITIVE NUMBER");
            }
            if (input > 5) {
                sc.close();
                throw new MotorcycleException("Invalid input!! TRY ENTERING A NUMBER NOT EXCEEDS FIVE");
            }

            System.out.println("Index number: " + input);
            System.out.println(Motorcycle.get(input));

        } catch (MotorcycleException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }
}