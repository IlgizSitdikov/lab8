package lab8;

import java.io.*;
import java.util.Scanner;

public class InputOnEndOfTheFile {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String line = console.nextLine();

        try(FileWriter writer = new FileWriter("MyFile.txt", true))
        {
            // запись всей строки в конец файла
            writer.write(line);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
