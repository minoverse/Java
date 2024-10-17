import java.util.Scanner;
import javax.swing.JOptionPane;//GUI
import java.util.Random;
import java.util.*; //2D ArrayList

public class Main{
    public static void main(String[] args){
        System.out.println(" Pizza");
        System.out.println("/"Pizza"/"); //when i want to put ""
        long x = 123213213123L; // for long variable i should write L;
        boolean z = true // or false only;
        char sym = '%';//possible
        String str = " asdsad"; // capital letter

        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your name? ");
        String name = scanner.nextLine();
        System.out.println("hELLO" + name);

        Random random = new Random();
        int x = random.nextInt(6); //0 ~5
        double y = random.nextDouble();
        system.out.println(x);
        String[] cars = { "teslar", "bmw", "venz"};

        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        System.out.println(bakeryList.get(1));

        String[] animals = {"cat", "dog", "horse", "bird"};
        for (String i : animals) {
            System.out.println(i);
        }
    }

}

public class main {
    public  static void main(string[] args) {
        int friends = 10;
    }
}
