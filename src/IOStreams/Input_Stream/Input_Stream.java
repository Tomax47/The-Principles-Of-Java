package IOStreams.Input_Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Input_Stream {
    private static InputStream input;

    public static void main(String[] args) throws IOException {

        //We us e the System.in for the inputStream
        try {
            //Reading one byte of data
            int data = System.in.read();
            System.out.write(data);
            System.out.flush();

            /**
             So here whe nwe used the System.in method, we told Java that we will input thing in the terminal
             and then, we sued the "System.out.write(data);" to print the first byte "first char" of what we have inputted!
             Thus, we got that output on the terminal!
             */

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }


        System.out.println("\nSecond part : ");
        try {
            //it will print 20 bytes here, neither more, nor less!
            int[] arrayOfData = new int[20];

            for (int i = 0; i < arrayOfData.length; i++) {
                arrayOfData[i] = System.in.read();
            }
            System.out.println("Input collected!");
            for (int i = 0; i < arrayOfData.length; i++) {
                System.out.write(arrayOfData[i]);
            }
            System.out.flush();

        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }

        //the (-1) value means the end of index
        System.out.println("\n\nThird part : ");
        try {
            InputStream input = new FileInputStream("D:\\Java Projects\\JavaThemes\\src\\IOStreams\\Input_Stream\\inputFile.txt");

            while (true) {
                int data = input.read();
                if (data == -1) {
                    break;
                } else {
                    System.out.write(data);
                }
                System.out.flush();
            }
        } catch (IOException e){
            System.out.println("Something went wrong!");
        }

        /**

         #HOW TO GATHER CHUNKS OF DATA :
            For large data, it's gonna be inefficient to use a forLoop to retrieve the data from a file or so , thus we will need
            to use a different way to retrieve that data ->

         -> It's faster for the system to use this optimized way than calling upon the read method over and over!
         */

        System.out.println("\n\nFourth part : ");
        try {
            byte[] input = new byte[50];

            //Start reading from the 10th byte all the way up to the 50th
            System.in.read(input);
            for (int i = 0; i < input.length; i++) {
                System.out.write(input[i]);
            }
            System.out.flush();
        } catch (IOException | IndexOutOfBoundsException e){
            System.out.println("Something went wrong!");
        }

        System.out.println("\n\nFifth part : ");
        InputStream fileInput = new FileInputStream("D:\\Java Projects\\JavaThemes\\src\\IOStreams\\Input_Stream\\inputFile.txt");
        try {

            //The .available() method let us know the estimated data existing in a file!
            byte[] dataInBytes = new byte[fileInput.available()];
            fileInput.read(dataInBytes);

            for (int i = 0; i < dataInBytes.length; i++) {
                System.out.write(dataInBytes[i]);
            }
            System.out.flush();
        } catch (IOException e) {
            System.out.println("An error occurred!");
        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            System.out.close();
            System.in.close();
        }
    }
}
