package com.company.uzd2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        uzduotis1();
        saveDrivers(Paths.get("C:\\Users\\Deividas" +
                "\\IdeaProjects\\200714\\src\\com\\company" +
                "\\uzd2\\driver_out.txt"), Driver.divers());
    }

    public static void saveDrivers(Path path, List<Driver> drivers) {
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (Driver driver : drivers) {
                writer.write(driver.toLine());
                writer.newLine();
                writer.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Information is written into file driver_out");
    }

    public static void uzduotis1() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Deividas\\IdeaProjects\\200714\\src\\com\\company\\uzd2\\driver.txt"));
             BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\Deividas\\IdeaProjects\\200714\\src\\com\\company\\uzd2\\driver_out.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                writer.write(String.format("%s %s", new StringBuffer(parts[0]).reverse(), new StringBuffer(parts[1]).reverse()));
                writer.newLine();
                System.out.println("Information is written into file driver_out");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
