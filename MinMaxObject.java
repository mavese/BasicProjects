/**
 * Created by Matthew Mantese on 2/1/17.
 */
public class MinMaxObject {
    private double max;
    private double min;
    private int maxPos;
    private int minPos;

    public MinMaxObject(){
    }

    public MinMaxObject(double mx, double mn, int mxPs, int mnPs){
        max = mx;
        min = mn;
        maxPos = mxPs;
        minPos = mnPs;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double maximum, int position) {
        max = maximum;
        maxPos = position;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double minimum, int position) {
        min = minimum;
        minPos = position;
    }

    public int getMaxPos() {
        return maxPos;
    }

    public int getMinPos() {
        return minPos;
    }
}
