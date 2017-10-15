package code;

/**
 * <b>code.VectorHelper est la classe qui contient les defferente methodes pour manipuler les vecteurs.</b>
 * @author Mahamdi&&Khaldi
 * @version 3.0
 */
public class VectorHelper {

    /**
     * Trier les elements d’un vecteur
     * @author Mahamdi Mohammed
     * @version 1.0.4
     * @param vect :vecteur d'entier
     *
     */
    public static void tri(int vect[]) {
        int longueur = vect.length;
        int tampon = 0;
        boolean permut;
        do {
            permut = false;
            for (int i = 0; i < longueur - 1; i++) {
                // Teste si 2 éléments successifs sont dans le bon ordre ou non
                if (vect[i] > vect[i + 1]) {
                    // s'ils ne le sont pas, on échange leurs positions
                    tampon = vect[i];
                    vect[i] = vect[i + 1];
                    vect[i + 1] = tampon;
                    permut = true;
                }
            }
        } while (permut);
    }
    /**
     * Sommer deux vecteurs
     * @author Mahamdi Mohammed
     * @version 1.0.4
     * @param vect1,vect2:deux vecteurs
     * @throws DifferentSize :cette exception est declanchée lorsque les tailles de vect1 et vect2 sont defferentes
     * @return somme ,le somme de vect1 et vect2
     */
    public static int[] sommeVec(int[]vect1,int[]vect2)throws DifferentSize
    {
        int t1=vect1.length;
        int t2=vect2.length;
        if(t1!=t2)throw new DifferentSize();
        int somme[] = new int[t1];

        for(int i=0;i<t1;i++)
        {
            somme[i]=vect1[i]+vect2[i];
        }
        return somme;
    }
    /**
     * Afficher les elements d'un vecteur
     * @author Mahamdi Mohammed
     * @version 1.0.4
     * @param vect:un vecteur d'entier
     *
     */
    public static void afficher(int[]vect){

        for (int i=0; i<vect.length; i++) {
            System.out.print(vect[i]+" ");
        }
        System.out.println();
    }
    /**
     * Inverser les elements d’un vecteur
     * @author Mahamdi Mohammed
     * @version 1.0.4
     * @param vect:un vecteur d’entier
     * @return vectInv ,l'inverse de vect
     */
    public static int [] reverse (int vect[]){
        int vectInv[]=new int[vect.length];
        for (int i=0;i<vect.length;i++){
            vectInv[i]=vect[vect.length -1 -i];
        }
        return vectInv;
    }

    /**
     * une fonction qui retourne le min et le max d'un tableau
     *@author Khaldi abderraouf
     * @param tab : le tableau des entier du quel nous voulons savoir son min et son max
     * @return minmax un objet code.MinMax qui contient le minimum et le maximum du tableu tab
     */
    public static MinMax minMax(int tab[]){
        int min=tab[0];
        int max=tab[0];
        for (int i=0;i<tab.length;i++){
            if (max<tab[i]) max=tab[i];
            if (tab[i]<min ) min=tab[i];
        }
        MinMax minmax=new MinMax(min,max);
        return minmax;
    }

    /**
     * une fonction qui fait la puissance p de chaque element du tableau tab
     * @author Khaldi abderraouf
     * @param tab un tableau d'entier auquel nous voulons lui faire une puissance p achaque element de ce meme tableau
     * @param p l'ordre de la puissance du tableau souhaiter
     * @return tab1 est le tableau au quel chaque element t1 est egale a l'element t du tableau tab elever a la puissance p
     */
    public static int [] puissance (int tab[],int p){
        int tab1[]= new int[tab.length];
        for (int i=0;i<tab.length;i++){
            tab1[i]=1;
            for(int j=1;j<=p;j++)
            {
                tab1[i]=tab1[i]*tab[i];
            }
        }
        return tab1;
    }

}
