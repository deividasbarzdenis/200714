package com.company.uzd1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\" +
                "Users\\Deividas\\IdeaProjects" +
                "\\200714\\src\\com\\company\\uzd1\\vardas.txt"));
        String line;
        ArrayList<String> list = new ArrayList();
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\" +
                "Users\\Deividas\\IdeaProjects" +
                "\\200714\\src\\com\\company\\uzd1\\vardas_out.txt"));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(" ");
            writer.write(String.format("%s %s",new StringBuffer(parts[0]),
                    new StringBuffer(parts[1]).reverse()));
            writer.newLine();
            writer.flush();
            //System.out.println(new StringBuffer(line).reverse());
        }
        writer.close();
        reader.close();

    }


    /*private static void readFile(File fin) throws IOException {
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }*/
}
