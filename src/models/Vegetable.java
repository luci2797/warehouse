package models;

public class Vegetable extends HealthyProduct {


    public Vegetable() {
        this.setCategory("vegetable");
    }

    public Vegetable(String producer, String nutr) {
        this.setCategory("vegetable");
        this.setProducer(producer);
        this.setNutrQuality(nutr);
    }


    /*public void setNutrQuality(String nutr){
        super.setNutrQuality(nutr);
    }

    public String getNutrQuality(){
        return super.getNutrQuality();
    }*/

}
