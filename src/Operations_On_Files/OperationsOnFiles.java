package Operations_On_Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 There are tons of ways to perform operations on files, though this is I believe to be the simplest way
 of doing it.
 */
public class OperationsOnFiles {
    public static void main(String[] args) {

        /**
         For writing data we sue BufferedWriter!
         It can write data to many-different things, thus we need to specify to what we want to write by giving it a variable
         */

        String filePath = "D:\\Java Projects\\JavaThemes\\src\\Operations_On_Files\\output.txt";

        try {
            writeToFile(filePath,"Hello! My name is SpongeBob SquarePants)\n");
            writeToFile(filePath,"Welcome to Bikini Bottom!\n");

            System.out.println("File has been created successfully!");
        } catch (IOException e) {
            System.out.println("An IOException has occurred! please fix the provided data and try again");
        }

        //Second part {ArrayList reading/writing}
        try {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(0); numbers.add(2);numbers.add(1); numbers.add(9);
            writeArraysElementsToFile("D:\\Java Projects\\JavaThemes\\src\\Operations_On_Files\\output.txt",numbers);
        } catch (IOException e) {
            System.out.println("An IOException occurred!");
        }

        //Reading from a file
        try {
            System.out.println("File data :");
            readFile(filePath);
        } catch (IOException e) {
            System.out.println("An IOException occurred!");
        }

    }

    private static void writeToFile(String path, String input) throws IOException {
        /**
         To make the method function properly, we need to open the file in the append mode by passing the value "true" to the second argument
         as the FileWriter by default opens the file in the "truncate" mode, which truncates the file first, and then writes to it
         Thus if we ain't pass the value "true" there, the program will ignore all the method's calls, except for the last one!

         Fe. in the above written code, the program will write only "Welcome to Bikini Bottom" message to the file and ignores completely
         the "Hello! My name is SpongeBob SquarePants" message!
         */
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        writer.write(input);
        /**
         After done with the writing blocks we ALWAYS need to close the writer!
         Otherwise, the file will be created but, it's going to be blank!

         -> If we write again to the same path, it won't create another file but override the file
            which already has been created!
         */
        writer.close();
    }

    private static <T> void writeArraysElementsToFile(String path, List<T> arrayList) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
        for (T element : arrayList) {
            /**
             Without adding the | +" " | part to the method's argument, the argument won't be determined a str, and in that case we will need to cast the element into a string cuz the writer.write()
             method ain't take a generic argument!
             */
            writer.write(element+" ");
        }
        writer.close();
    }

    private static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
