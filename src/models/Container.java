package models;

public class Container extends MeasureUnit{
    private Kg weight;

    public int getWeight() {
        return weight.getWeight();
    }

    public void setWeight(int w) {
        weight = new Kg();
        weight.setWeight(w);
    }
}
