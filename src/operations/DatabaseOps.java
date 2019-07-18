package operations;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import models.Fruit;
import models.HealthyProduct;
import models.Product;
import models.Vegetable;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DatabaseOps {

    public void create(String file, Product product){
        try {
            FileWriter mFileWriter = new FileWriter(file, true);
            CSVWriter mCsvWriter = new CSVWriter(mFileWriter);
            String prod = product.getName() + "," +  product.getM().getName() + "," + product.getPrice() + ","
                    + product.getCategory() + "," + product.getEntryDate() + "," + product.getExpirationDate();
            if(product instanceof HealthyProduct){
                prod += "," + ((HealthyProduct) product).getNutrQuality();
            }
            if (product instanceof Vegetable){
                prod += "," + product.getProducer();
            }

            String[] productToInsert = prod.split(",");
            mCsvWriter.writeNext(productToInsert);
            mCsvWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    //not finished
    public ArrayList<Product> read(String file){

        String csvFile = file;
        CSVReader reader = null;

        try{
            reader = new CSVReader(new FileReader(csvFile));
            String[] line;
            while((line = reader.readNext()) != null){
                switch (line[3]){
                    case "fruit":{
                        Fruit f = new Fruit(line[6]);
                        f.setName(line[0]);
                    }
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }


        ArrayList<Product> products = new ArrayList<Product>();
        return products;
    }
}
