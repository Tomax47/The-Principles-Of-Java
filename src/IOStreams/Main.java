package IOStreams;

import java.io.IOException;

/**
 Usage of the IO streams :
    1- Write to files & read from them
    2- Communicating over a network "Sockets"
    3- Filtering data
    4- Compress & decompress data
    5- Writing objects to streams etc etc etc...

 #What's a stream ?
    I/OStream, is an ordered sequence of bytes of an indeterminate length!

 #Streams transfer data in bytes "1 byte = 8 bits" where each bit is a binary number of 1 or 0!

 #Max size limit for bits is 2^8 = 256, though Java likes to sue signed values, thus the in Java its -128 to 127
    -> An actual byte variable in JAVA is gonna be in the range [-128,127] Min/Max values of a byte in Java in the memory!
    -> Int (4 bytes) -> 4 * 8 = 32 bits -> 2^32 = [-2147483648, 2147483647] Min/Max values of int in Java in the memory!
    -> Long (8 bytes) -> 8 * 8 = 64 bits -> 2^64 = [..... , ....] the range for long numbers, and so on...

 #Any data we get from the stream is basically a signed or unsigned data!

 #To check the encoding of any character, you can give unicode-table.com a visit!

 #Readers & Writers :
    -> Readers will turn the bytes from the underlying stream to characters, so we can read the data
    -> While on the other hand, the Writer will convert the provided character to bytes and them input it int o the underlying stream

 #OutputStream & InputStream are abstract classes!

 */
public class Main {
    public static void main(String[] args) {
        /**
         The printStream class is a subclass of the InputStream

         The number 75 represents the letter K, to know about other characters, check the "ASCII table"!
         */

        /** This will get the char and save it to a buffer in the memory,
        as it accepts a byte as an argument and translate it into a char */
        System.out.write(75);
        //To print the char on the terminal, we need to flush
        System.out.flush();

        System.out.println();
        //We started from the value of 33, cuz the first 32 values in the ASCII table aint chars
        for (int i = 33; i < 127; i++) {
            System.out.write(i);
            System.out.print(" ");
        }
        System.out.flush(); //We can use the System.out.println() method, as it will also flush the stream for us

        System.out.println();
        String text = "Hello! I'm SpongeBob SquarePants)";
        byte[] data = text.getBytes();

        try {
            System.out.write(data);
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        } finally {
            System.out.close();
        }

        /**
         The PrintStream won't throw an exception for the .write() method cuz it's an abstract method, and it overrides it
         thus that's y we needed to surround the statement with try-catch!

         #Note! it's always crucial to close the stream!
            -> We ain't insert the close method in the try section, cuz an exception might occur and in that case the close method
               won't be reached, and the stream is gonna keep opened! thus we throw it in a finally-block
         */

    }
}
