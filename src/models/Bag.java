package models;

public class Bag extends Container {
    public Bag(int w){
        this.setWeight(w);
        this.setName("Bag ( " + this.getWeight() + "kg)");
    }

    /*public Bag() {
        this.setName("Bag ( " + this.getWeight() + ")");
    }*/
}
