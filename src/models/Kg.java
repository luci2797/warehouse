package models;

public class Kg extends MeasureUnit{
    private int weight;

    public Kg(){
        this.setName("kg");
    }

    public Kg(int weight) {
        this.weight = weight;
        this.setName("kg");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
