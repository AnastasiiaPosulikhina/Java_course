package ClientServerApp;
import java.io.*;
import java.net.Socket;
public class ClientServerAppCheck {
    static String host = "0.0.0.0";
    static int port = 32000;
    public static void main(String[] args) {
        Socket fromServer = null;
        BufferedReader in = null;
        PrintWriter out = null;
        BufferedReader inputBuf = null;
        try {
            String client, server;
            System.out.println("Connecting to " + host + ":" + port);
            fromServer = new Socket(host, port); //создание сокета
            in = new BufferedReader(new InputStreamReader(fromServer.getInputStream()));
            out = new PrintWriter(fromServer.getOutputStream(), true);
            inputBuf = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                if (in.ready()) { //чтение того, что пришло с сервера
                    server = in.readLine();
                    System.out.println(server);
                }
                if (inputBuf.ready()) { //отправка строки серверу после ввода сообщения с клавиатуры
                    client = inputBuf.readLine();
                    out.println(client);
                    if (client.contains("exit")) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
                inputBuf.close();
                fromServer.close();
            } catch (IOException ex) {
            }
        }
    }
}