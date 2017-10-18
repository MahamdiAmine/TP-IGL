package code;

/**
 * <b> code.MinMax: cette classe est utilisee  pour sauvgarder le min et le max d'un vecteur
 *
 * @author Mahamdi Mohammed
 * @version 1.0.4
 */
public class MinMax {
    private int min;
    private int max;

    public MinMax(int min, int max) {
        this.max = max;
        this.min = min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max)

    {
        this.max = max;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
}