package models;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String name;
    private String category;
    private Double price;
    private MeasureUnit m ;
    private LocalDate expirationDate;
    private LocalDate entryDate;
    private String producer;

    public Product() {
    }

    public Product(String name, Double price, MeasureUnit m) {
        this.name = name;
        this.price = price;
        this.m = m;
    }

    public Product(String name, Double price, MeasureUnit m, LocalDate expirationDate, LocalDate entryDate) {
        this.name = name;
        this.price = price;
        this.m = m;
        this.expirationDate = expirationDate;
        this.entryDate = entryDate;
        this.producer = "unknown";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MeasureUnit getM() {
        return m;
    }

    public void setM(MeasureUnit m) {
        this.m = m;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }


}
