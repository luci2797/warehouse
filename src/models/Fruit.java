package models;

public class Fruit extends HealthyProduct {

    public Fruit() {
        this.setCategory("fruit");
        this.setProducer("unknown");
    }
    public Fruit(String nutr){
        this.setCategory("fruit");
        this.setProducer("unknown");
        this.setNutrQuality(nutr);
    }

   /* public void setNutrQuality(String nutr){
        super.setNutrQuality(nutr);
    }

    public String getNutrQuality(){
        return super.getNutrQuality();
    }*/


}
