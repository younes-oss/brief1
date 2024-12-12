import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
     static int  choix,a,b;

    public static void main(String[] args) {
       while(choix!=8){
           menu();
       }
    }
    public static int addition(int a , int b){

        return a + b;
    }
    public static int soustraction(int a , int b){
        return a - b;
    }
    public static double division(double a,double b){
        if(b == 0){
            System.out.print("opération impossible");
            return Double.NaN;
        }
        return a/b;
    }
    public static double multiplication( int a,int b){
        return a*b;
    }
    public static int puissance(int a,int b){
        int result = 1;

        for(int i = b; i>0;i--){
            result *= a;
        }
        return result;
    }
    public static double racine(double a) {

        return Math.sqrt(a);
    }

    public static int factorielle(int a) {
        if (a < 0) {
            throw new IllegalArgumentException("La factorielle n'est pas définie pour les nombres négatifs.");
        }

        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }

    static void menu(){

        System.out.print("\n------------menu--------------\n " +
                "1. addition \n " +
                "2. soustraction \n " +
                "3. multiplication \n " +
                "4. division\n" +
                " 5. puissance\n"+
                " 6.racine: \n" +
                " 7.factorielle\n"+
                "choisir un nombre : ");

        choix = scanner.nextInt();
        switch (choix){
            case 0 : case 8:
                System.exit(0);
                break;
            case 1:
                inserer("Addition");
                System.out.print("la somme de "+a+"+"+b+" = "+addition(a,b));
                break;
            case 2:
                inserer("soustraction");
                System.out.print("la soustraction de "+a+"-"+b+" = "+soustraction(a,b));
                break;
            case 3:
                inserer("multiplication");
                System.out.print("la multiplication de "+a+"*"+b+" = "+multiplication(a,b));
                break;
            case 4:
                inserer("division");
                do {
                    inserer("division");

                }while(b==0);
                System.out.print("la division de " + a + "/" + b + " = " + division(a, b));
                break;

            case 5:
                inserer("puissance");
                System.out.print("la puissance de "+a+" par "+b+" = "+puissance(a,b));
                break;
            case 6:
                System.out.println("############ racine ###########");
                while(!scanner.hasNextInt()){
                    System.out.print("invalid input : "+scanner.next());
                }
                a = scanner.nextInt();
                System.out.print("la racine de "+a+" = "+racine(a));
                break;
            case 7:
                System.out.println("############ racine ###########");
                while(!scanner.hasNextInt()){
                    System.out.print("invalid input : "+scanner.next());
                }
                a = scanner.nextInt();
                System.out.print("le factorielle  de "+a+" est "+factorielle(a));
                break;


        }
    }
    static void inserer(String title){
        System.out.printf("\n############# %s ###############\n", title);
        System.out.print("saisir le premier nombre : ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid Input: " + scanner.next());
        }
        a = scanner.nextInt();
        System.out.print("saisir le deuxiéme nombre : ");
        while(!scanner.hasNextInt()){
            System.out.print("invalid input: "+scanner.next());
        }
        b = scanner.nextInt();
    }
}
