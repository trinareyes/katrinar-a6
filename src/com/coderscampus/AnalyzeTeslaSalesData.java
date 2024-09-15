package com.coderscampus;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.min;

public class AnalyzeTeslaSalesData {

    public void analyzeSales (List<TeslaSales> dataSales){
        Map<Integer, Integer> yearlySales = dataSales.stream()
                .collect(Collectors.groupingBy(sale -> sale.getDate().getYear(),
                        Collectors.summingInt(TeslaSales::getSales)));
        System.out.println("Yearly Sales Report: ");
        yearlySales.forEach((year, sales) -> System.out.println(year + "->" + sales));

        findBestAndWorstMonths(dataSales);
    }


    public void findBestAndWorstMonths(List<TeslaSales> dataSales) {

        TeslaSales bestMonth = dataSales.stream()
                .max(Comparator.comparingInt(TeslaSales::getSales)).orElse(null);

        TeslaSales worstMonth = dataSales.stream()
                .min(Comparator.comparingInt(TeslaSales::getSales)).orElse(null);


        if (bestMonth != null) {
            System.out.println("The best month was " + bestMonth.getDate());

        }
        if (worstMonth != null) {
            System.out.println("The worst month was " + worstMonth.getDate());
        }
    }

}
