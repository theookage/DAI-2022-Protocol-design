package ch.heigvd.api.calc;

import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Calculator client implementation
 */
public class Client {

    private static final Logger LOG = Logger.getLogger(Client.class.getName());

    /**
     * Main function to run client
     *
     * @param args no args required
     */
    public static void main(String[] args) throws IOException {
        // Log output on a single line
        System.setProperty("java.util.logging.SimpleFormatter.format", "%4$s: %5$s%6$s%n");
        final int DESTINATION_PORT = 9999;

        /* TODO: Implement the client here, according to your specification
         *   The client has to do the following:
         *   - connect to the server
         *   - initialize the dialog with the server according to your specification
         *   - In a loop:
         *     - read the command from the user on stdin (already created)
         *     - send the command to the server
         *     - read the response line from the server (using BufferedReader.readLine)
         */

        BufferedReader fromServer = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter toServer = new BufferedWriter(new OutputStreamWriter(System.out));
        Socket clientSocket = new Socket("127.0.0.1", DESTINATION_PORT);
        toServer.write("QUIT");
        toServer.flush();

        fromServer.close();
        toServer.close();
        clientSocket.close();
    }
}
