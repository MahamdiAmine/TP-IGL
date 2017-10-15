
public class VectorHelper {


    /**
     * une fonction qui retourne le min et le max d'un tableau
     *@author Khaldi abderraouf
     * @param tab : le tableau des entier du quel nous voulons savoir son min et son max
     * @return minmax un objet MinMax qui contient le minimum et le maximum du tableu tab
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
