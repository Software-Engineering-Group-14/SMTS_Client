import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.stream.Stream;

public class Connect {

    String serverUrl;
    int port;
    Socket client;
    PrintWriter out;
    BufferedReader userInput;

    public Connect(String serverUrl, int port){
        this.serverUrl = serverUrl;
        this.port = port;
    }

    public boolean connectToSocket() {
        try {
            this.client = new Socket(this.serverUrl, this.port);
            this.out = new PrintWriter(this.client.getOutputStream(), true);
            this.userInput = new BufferedReader(new InputStreamReader(System.in));
            return true;
        } catch (IOException err) {
            System.out.println(err.getLocalizedMessage());
            return false;
        }
    }

    public void sendMessage(String msg){
        if(this.out != null){
            this.out.println(msg);
        }
    }

    public Stream<String> recieveMessage(){
        try {
            BufferedReader socketInput = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            return socketInput.lines(); //Return the server response as a Stream

        } catch (IOException err){
            System.out.println(err.getLocalizedMessage());
        }
        return null;
    }

}
