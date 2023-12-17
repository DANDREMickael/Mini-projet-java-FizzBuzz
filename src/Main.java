import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Veuillez entrer un nombre entier : ");
        Scanner entreeUtilisateur = new Scanner(System.in);
        String entreeNombre = entreeUtilisateur.nextLine();

        String fizz = "Fizz";
        String buzz = "Buzz";
        int somme = 0;

        //Pour être divisible par 5 -> le nombre doit se terminer par 0 ou 5.
        boolean estDivisiblePar5 = entreeNombre.endsWith("0") || entreeNombre.endsWith("5");

        for (int i = 0; i < entreeNombre.length(); i++) {

            //Contient le caractère selectionné tel qu'il est affiché (et non sa valeur ASCII)
            int valeurAffichage = Integer.parseInt(String.valueOf(entreeNombre.charAt(i)));
            somme += valeurAffichage;
        }

        //Pour être divisible par 3 -> La somme de tous les chiffres doit être divisible par 3.
        //Exemple : 432 est divisible par 3 car 4 + 3 + 2 = 9 et 9 est divisible par 3.
        boolean estDivisiblePar3 = somme % 3 ==0;

        if (estDivisiblePar5)
            if (estDivisiblePar3)
                System.out.println(fizz + buzz);
            else
                System.out.println(fizz);

        else if (estDivisiblePar3)
            System.out.println(buzz);
        else
            System.out.println(somme + " n'est divisible ni par 5, ni par 3.");
    }
}