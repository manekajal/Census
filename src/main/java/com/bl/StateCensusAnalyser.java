package com.bl;


import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StateCensusAnalyser {


      public static void main(String[] args) throws IOException {
         final String file_name="/c/Users/KAJAL/IdeaProjects/Day29 DesignPrinciple/CsvStateCensus.csv";

                    try{
                          Reader reader = Files.newBufferedReader(Paths.get(file_name));
                          CSVReader csvReader= new CSVReader(reader);

                          String nextLine[];

                          while ((nextLine=csvReader.readNext())!=null) {
                                System.out.println("id :" +nextLine[0]);
                                System.out.println("State Name :" +nextLine[1]);
                                System.out.println("TIN :" +nextLine[2]);

                                System.out.println("State Code:" +nextLine[3]);
                          }
                    }catch (IOException e){
                          e.printStackTrace();
                    }

      }
}
