package com.company;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Payments {
    private int paymentId;
    private double sum;
    private int recipientId;
    private int senderId;

    private String pathPeople = String.valueOf(getPath());

    public Path getPath() {
        Path relativePath = Paths.get("src\\com\\company\\people.txt");
        Path absoluteFilePath = relativePath.toAbsolutePath();
        return absoluteFilePath;
    }

    public void fileRead() throws IOException {
        FileReader fr = new FileReader(pathPeople);
        BufferedReader br = new BufferedReader(fr);
        String word;
        while ((word = br.readLine()) != null) {
        }
    }
}


