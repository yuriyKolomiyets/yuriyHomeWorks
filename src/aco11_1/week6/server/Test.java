package aco11_1.week6.server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Test {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/test", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                System.out.println(httpExchange.getProtocol());
                System.out.println(httpExchange);
                System.out.println("server accepted a message");


                try (OutputStream outputStream = httpExchange.getResponseBody()) {
                    String s = "Hello from server";
                    httpExchange.sendResponseHeaders(200, s.length());
                    outputStream.write(s.getBytes());
                    outputStream.flush();
                    outputStream.close();

                }
            }
        });
        server.createContext("/hello", new HttpHandler() {
            @Override
            public void handle(HttpExchange httpExchange) throws IOException {
                System.out.println("Hello method was invoked ");
            }
        });
        server.setExecutor(null); // creates a default executor
        server.start();

        System.out.println("Server started. Connect to localhost:8000/test");
    }

    /*static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "This is the response";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }*/

}