import java.util.Scanner;
public class hello {
    public static void main (String[] args){ 
        Scanner scanner = new Scanner(System.in);
        System.out.println(" veuillez ecrire ton nom : ");
        String nom = scanner.nextLine(); 
        System.out.println("veuillez ecrire une distance en km : ");
        Double distance = scanner.nextDouble();
        System.out.println(" votre distance en milles est : "  + distance*0.621371 );
        scanner.close();
    }
}
