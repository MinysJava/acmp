package onehundred_ohTen;

import java.io.*;

public class task_108 {
    public static void main(String[] args) {
        File input = new File("INPUT.TXT");
        File output = new File("OUTPUT.TXT");

        try {
            FileReader in = new FileReader(input);
            FileWriter out = new FileWriter(output);
            BufferedReader buffIn = new BufferedReader(in);
            String number = buffIn.readLine();
            out.write(number);
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
