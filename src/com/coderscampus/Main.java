package com.coderscampus;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        TeslaSalesReader reader = new TeslaSalesReader();
        List<TeslaSales> model3Sales = reader.data("src/com/coderscampus/model3.csv");
        List<TeslaSales> modelsSales = reader.data("src/com/coderscampus/modelS.csv");
        List<TeslaSales> modelxSales = reader.data("src/com/coderscampus/modelx.csv");

        AnalyzeTeslaSalesData analyzer = new AnalyzeTeslaSalesData();
        System.out.println("Model 3 Sales Report: ");
        analyzer.analyzeSales(model3Sales);

        System.out.println("\n--------------");

        System.out.println("\nModel S Sales Report: ");
        analyzer.analyzeSales(modelsSales);

        System.out.println("\n--------------");

        System.out.println("\n Model x Sales Report: ");
        analyzer.analyzeSales(modelxSales);

        }
    }
