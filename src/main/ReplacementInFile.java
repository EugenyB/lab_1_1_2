package main;

import java.io.*;

public class ReplacementInFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("User.java"));
             PrintWriter writer = new PrintWriter("User.txt")) {
            reader.lines().map(s -> s.replace("public", "private")).forEach(writer::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
