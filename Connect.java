package com.group14.SMTS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.stream.Stream;

public class Connect {

    String serverUrl;
    int port;
    Socket client;
    PrintWriter out;
    BufferedReader socketInput;
    BufferedReader userInput;

    public Connect(String serverUrl, int port){
        this.serverUrl = serverUrl;
        this.port = port;
    }

    public boolean connectToSocket() {
        try {
            this.client = new Socket(this.serverUrl, this.port);
            this.out = new PrintWriter(this.client.getOutputStream(), true);
            this.socketInput = new BufferedReader(new InputStreamReader(this.client.getInputStream()));
            this.userInput = new BufferedReader(new InputStreamReader(System.in));
            return true;
        } catch (IOException err) {
            System.out.println(err.getLocalizedMessage());
            return false;
        }
    }

    public Stream<String> sendMessage(String msg){
        if(this.out != null){
            this.out.println(msg);
            return this.socketInput.lines(); //Return the server response as a string
        }
        return null;
    }

}
