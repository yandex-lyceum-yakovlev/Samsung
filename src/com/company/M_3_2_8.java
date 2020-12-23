package com.company;

import java.io.*;
import java.util.Scanner;

public class M_3_2_8 {

    public static void main(String[] args) throws IOException {

        /*
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out = new FileOutputStream("b.txt");
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }
        */
        /*
        try {
            File file = new File("testfiles.txt");
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            writer.print("hello"); //Записываем текст в файл
            writer.close(); // Закрываем файл
        } catch (IOException e) {
            e.printStackTrace();
        }

         */
        try {
            File file = new File("a.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
