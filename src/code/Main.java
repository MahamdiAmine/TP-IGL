package code;import java.util.Scanner;
/**
 * <b> Main est la classe qui genere l'affichage en mode console pour tester toute les operations  implimentees sur les vecteurs</b>
 * @see VectorHelper
 * @author Mahamdi Mohammed
 * @version 1.0.4
 */
public class Main {

    public static String codename = "IGL TP2017/2018";
    public static String codeby = "MAHAMDI MOHAMMED && KHALDI ABDERRAOUF";
    public static String version = "1.0.4";
    static int v1[];
    static int v2[];
    static int v3[];


    public static void main(String[] args) {
        try {
            mainmenu();
        } catch (DifferentSize differentSize) {
            System.out.println("Les tailles sont defferents");

        }
    }

    private static void mainmenu() throws DifferentSize {

        Scanner scanner = new Scanner(System.in);
        int choix=0;
        while (choix!=6){
            System.out.printf("\n\n\n\t||======================================================||\n");
            System.out.printf("\t||   |=| Codename: %s  		            ||\n", codename);
            System.out.printf("\t||   |=| Version : %s          		                ||\n", version);
            System.out.printf("\t||   |=| Code by : %s ||\n", codeby);
            System.out.printf("\t||======================================================||\n");
            System.out.println("__________________________________________________________________________________\n");

            System.out.println("\t[0x1]  Trier les éléments d’un vecteur");
            System.out.println("\t[0x2]  Sommer deux vecteurs");
            System.out.println("\t[0x3]  Inverser les éléments d’un vecteur");
            System.out.println("\t[0x4]  Obtenir simultanément le minimum et le maximum d’un vecteur");
            System.out.println("\t[0x5]  Appliquer une formule");
            System.out.println("\t[0x6]  Quiter");
            System.out.println("\t====>>>  Votre choix :");
            choix = scanner.nextInt();
            int taille;
            int taille2;
            switch (choix) {
                case 1://Trier les éléments d’un vecteur
                    System.out.println("La taille de votre vecteur");
                    taille = scanner.nextInt();
                    v1 = new int[taille];
                    System.out.println("Les elements de votre vecteur");
                    for (int i = 0; i < taille; i++) {
                        v1[i] = scanner.nextInt();
                    }
                    VectorHelper.afficher(v1);
                    System.out.println("Apres le tri :");
                    VectorHelper.tri(v1);
                    VectorHelper.afficher(v1);
                    break;
                case 2://Sommer deux vecteurs
                    System.out.println("La taille de le premier  vecteur");
                    taille = scanner.nextInt();

                    System.out.println("La taille de le deusieme   vecteur");
                    taille2 = scanner.nextInt();
                    if (taille != taille2) throw new DifferentSize();
                    v1 = new int[taille];
                    v2 = new int[taille2];
                    System.out.println("Les elements de vec1");
                    for (int i = 0; i < taille; i++) {
                        v1[i] = scanner.nextInt();
                    }
                    VectorHelper.afficher(v1);
                    System.out.println("Les elements de vec2");
                    for (int i = 0; i < taille; i++) {
                        v2[i] = scanner.nextInt();
                    }
                    VectorHelper.afficher(v2);
                    v3 = VectorHelper.sommeVec(v1, v2);
                    System.out.println(" le somme :");
                    VectorHelper.afficher(v1);
                    break;
                case 3://Inverser les éléments d’un vecteur
                    System.out.println("La taille de votre vecteur");
                    taille = scanner.nextInt();
                    v1 = new int[taille];
                    System.out.println("Les elements de votre vecteur");
                    for (int i = 0; i < taille; i++) {
                        v1[i] = scanner.nextInt();
                    }
                    VectorHelper.afficher(v1);
                    System.out.println("Apres l'inversion :");
                    VectorHelper.reverse(v1);
                    VectorHelper.afficher(v1);
                    break;
                case 4://Obtenir simultanément le minimum et le maximum d’un vecteur
                    System.out.println("La taille de votre vecteur");
                    taille = scanner.nextInt();
                    v1 = new int[taille];
                    System.out.println("Les elements de votre vecteur");
                    for (int i = 0; i < taille; i++) {
                        v1[i] = scanner.nextInt();
                    }
                    VectorHelper.afficher(v1);
                    MinMax minMax = VectorHelper.minMax(v1);
                    System.out.printf("Le min : %d le Max : %d", minMax.getMin(), minMax.getMax());
                    break;
                case 5://Appliquer une formule
                    System.out.println("La taille de votre vecteur");
                    taille = scanner.nextInt();
                    v1 = new int[taille];
                    System.out.println("Les elements de votre vecteur");
                    for (int i = 0; i < taille; i++) {
                        v1[i] = scanner.nextInt();
                    }
                    System.out.println("la puissance ");
                    int p = scanner.nextInt();
                    VectorHelper.afficher(v1);
                    VectorHelper.puissance(v1,p);
                    VectorHelper.afficher(v1);
                case 6:break;//Quitter
                default://Le numero n'est pas valide
                    System.out.println("entrer un numero valide!!!");

            }


        }
    }

}