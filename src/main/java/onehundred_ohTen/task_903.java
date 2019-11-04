package onehundred_ohTen;

import java.io.*;

public class task_903 {
    public static void main(String[] args) {
        File input = new File("INPUT.TXT");
        File output = new File("OUTPUT.TXT");
        int res = 1;

        try {
            FileReader in = new FileReader(input);
            FileWriter out = new FileWriter(output);
            BufferedReader buffIn = new BufferedReader(in);
            String number = buffIn.readLine();
            res += Integer.valueOf(number);
            out.write("" + res);
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
