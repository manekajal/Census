package com.bl;


import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class StateCensusAnalyser {
    private static String file_name="CsvStateCensus.csv";

      public static void main(String[] args) throws IOException {

          System.out.println("Hello Indian state :");
                    try {
                        Reader reader = Files.newBufferedReader(Paths.get(file_name));
                        int count = 0;

                        CsvToBean<IndianCensus> csvToBean = new CsvToBeanBuilder(reader).withIgnoreLeadingWhiteSpace(true).withType(IndianCensus.class).build();
                        Iterator<IndianCensus> stateIterator = csvToBean.iterator();
                        while (stateIterator.hasNext()) {
                            IndianCensus csvStates = stateIterator.next();
                            count++;
                        }

                    }catch (IOException e){
                        e.printStackTrace();
                    }
      }
}
