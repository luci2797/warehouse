import models.*;
import operations.DatabaseOps;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> myProducts = new ArrayList<Product>();
        DatabaseOps databaseOps = new DatabaseOps();

        String file = "C:\\Users\\lucianseican\\IdeaProjects\\warehouse\\products.csv";
        File file2 = new File("C:\\Users\\lucianseican\\IdeaProjects\\warehouse\\products.csv");


        try {
            if (file2.createNewFile()) {

                System.out.println("File has been created.");
            } else {

                System.out.println("File already exists.");
            }
        }
        catch (IOException e){
            System.out.println("file doesn't exist");
        }

        Random random = new Random();
        int minDay = (int) LocalDate.of(2019, 8, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2019, 12, 30).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);


        Kg kg = new Kg(7);

        Product x = new Fruit("something");
        x.setName("apple");
        x.setM(kg);
        x.setPrice(3.0);
        x.setEntryDate(LocalDate.now());
        x.setExpirationDate(randomDate);

        //databaseOps.create(file, x);

        Box box = new Box(5);

        Product y = new Vegetable("salamander man", "healthy??");
        y.setName("tomatoes");
        y.setM(box);
        y.setPrice(5.5);
        y.setEntryDate(LocalDate.now());
        y.setExpirationDate(randomDate);

        //databaseOps.create(file, y);

        Pack pack = new Pack();
        Product z = new Other();
        z.setName("crackers");
        z.setM(pack);
        z.setPrice(4.0);
        z.setEntryDate(LocalDate.now());
        z.setExpirationDate(randomDate);

        databaseOps.create(file, z);

    }

}
