//mengimport scanner
import java.util.Scanner;

public class Main 
{
    private static Scanner scanner;

    public static void main(String[] args) 
    {
        //Implementasi Strategy pattern 
        System.out.println("Pilih karakter Among Us : \n1. Merah\n2. Kuning\n3. Pink \n*note : hanya masukkan input berupa angka");
        scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        StrategyPattern amongUs = new StrategyPattern();

        if (input == 1) 
        {
            amongUs.setAmongusCrew(new AmongusMerah());
        } 
        else if (input == 2) 
        {
            amongUs.setAmongusCrew(new AmongusKuning());
        } 
        else if (input == 3) 
        {
            amongUs.setAmongusCrew(new AmongusPink());
        }
        System.out.println("\nKarakter Among Us anda adalah " + amongUs.getAmongusCrew());

        //Implementasi Adapter Pattern
        AmongusImpostor impostor = new Impostor();

        System.out.print("Status " + amongUs.getAmongusCrew() + " adalah ");
        amongUs.crew();

        AmongusCrew amongusAdapter = new AdapterPattern(impostor);
        System.out.print("Status " + amongUs.getAmongusCrew() + " sekarang adalah ");
        amongusAdapter.crew();
    }
}
