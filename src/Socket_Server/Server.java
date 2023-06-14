package Socket_Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.stream.Stream;

public class Server {
    public static void main(String[] args) {

        System.out.println("Server is up, waiting for clients!");
        try {
            ServerSocket serverSocket = new ServerSocket(8880);

            /** The .accept() method establishes the connection between the server and the client, and then create a socket for the server to be used in communications! */
            Socket socket = serverSocket.accept();
            System.out.println("Connection has been established! waiting for messages from the client...");

            /** We sued " scoket.getInputStream() " to read the data from the socket stream, unlike the System.in which reads the input from the keyboard! */
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);

            String name = reader.readLine();
            System.out.println("Client : "+name);
            writer.println("Hello "+name);


        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
