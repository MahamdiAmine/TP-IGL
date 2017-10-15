/**
 * <b>VectorHelper est la classe qui contient les defferente methodes pour manipuler les vecteurs.</b>
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
     *
     * @return vectInv ,l'inverse de vect
     */
    public static int [] reverse (int vect[]){
        int vectInv[]=new int[vect.length];
        for (int i=0;i<vect.length;i++){
            vectInv[i]=vect[vect.length -1 -i];
        }
        return vectInv;
    }

}