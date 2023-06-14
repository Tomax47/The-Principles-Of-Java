package Socket_Server;

import java.io.*;
import java.net.Socket;

public class Client {
    /**

     #What's a socket ?
        it's an end point of communications between 2 devices!

     -> Let's say we have two pc's that r communicating with each other, each pc A & B has a socket or behave like a one!
        In Java, a socket is an object!

     #Server socket :
        It's located at the server side, and it makes the server wait for the requests from clients, so then after accepting it, a socket will be created at the server!

     */

    public static void main(String[] args) {

        System.out.println("Client is up, waiting to be connected!");

        try {
            Socket clientSocket = new Socket("127.0.0.1",8880);

            /** As the InputStreamReader is able to read one byte at a time, we use the BufferedReader as it's capable to read an entire sting at a time! */
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader clientInputReader = new BufferedReader(inputStreamReader);
            BufferedReader socketStreamReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);

            System.out.print("What's you name ? ");
            String name = clientInputReader.readLine();
            writer.println(name);

            String serverResponse = socketStreamReader.readLine();
            System.out.println("Server : "+serverResponse);


        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
