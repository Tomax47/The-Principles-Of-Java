package IOStreams.Filter_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 The filter IOStream alter "filters" the data before it goes to the program or the hard disk
 */
public class FilterStream {
    public static void main(String[] args) {

        CustomOutputFilter outputFilter = null;
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Java Projects\\JavaThemes\\src\\IOStreams\\Filter_Stream\\output.txt");
            outputFilter = new CustomOutputFilter(fos);

            //When the user input the character x, the for loop will break!
            for (int i = System.in.read(); i != 'x' ; i = System.in.read()) {
                outputFilter.write(i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                /**
                 Closing the outputFilterStream will close both it, and the underlying stream, meaning that if we tried
                 to open another filterStream in that underlying stream we will get an error, thus we need to create another underlying stream if we wanna use it again
                 */
                outputFilter.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
