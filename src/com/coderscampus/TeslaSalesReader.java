package com.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TeslaSalesReader {
    public List<TeslaSales> data (String fileName) throws IOException {
        List<TeslaSales> salesData = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-yy");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line = br.readLine();

            while ((line= br.readLine()) != null) {
                String[] parts = line.split(",");
                YearMonth date = YearMonth.parse(parts[0], formatter);
                int sales = Integer.parseInt(parts[1]);
                salesData.add(new TeslaSales(date,sales));
            }
        }
        return salesData;
    }
}
