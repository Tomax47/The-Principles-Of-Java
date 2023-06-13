package IOStreams.Filter_Stream;

import java.io.*;

/**
 This is the stream filter that is going to filter the output for us!
 */
public class CustomOutputFilter extends FilterOutputStream {


    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field {@code this.out} for later use, or
     *            {@code null} if this instance is to be
     *            created without an underlying stream.
     */
    public CustomOutputFilter(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {

        if (b >= 48 && b <= 57) {
            super.write(b);
        } else {
            super.write('?');
        }

        /**
         Here it's going to apply the .write() method from the FilterOutputStream class if we leave the last super.write() call
         Though, before calling the default write method in the parent class, above we want to manipulate the data "Filter the data"
         -> We want the filter to do filter numbers and input them to a file, else to input a question mark!
         */

//        super.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException{
        for (int i = off; i < off + len; i++) {
            this.write(b[i]); //it's gonna call the previous write method in this class
        }
    }
}
