package models;

public class Box extends Container {

    public Box(int w){
        this.setWeight(w);
        this.setName("Box ( " + this.getWeight() + "kg)");
    }
    /*public Box() {
        this.setName("Box ( " + this.getWeight() + ")");
    }*/
}
