package ClientServerApp;
import java.io.*;
import java.net.Socket;
public class Client implements Runnable{
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    int id;
    public Client(Socket socket, int id) {
        try {
            this.socket = socket;
            this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            this.id = id;
        } catch (IOException ex) {
        }
    }
    @Override
    public void run() {
        try {
            String mes;
            while ((mes = in.readLine()) != null) {   //Если получаем сообщение от пользователя, то вызываем метод сервера
                Server.getMessage(mes, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                in.close();
            } catch (IOException ex) {
            }
        }
    }
}
