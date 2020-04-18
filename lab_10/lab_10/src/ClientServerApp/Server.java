package ClientServerApp;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
public class Server {
    static LinkedList<Client> users = new LinkedList<>(); //список всех пользователей
    public static void main(String[] args) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(32000); //создание серверного сокета
            while (true) {
                Socket socket = server.accept(); //получение сокет после подключения другого пользователя
                users.add(new Client(socket, users.size() + 1)); //добавление потока для пользователя в массив, запуск нового потока
                new Thread(users.getLast()).start();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                server.close();
            } catch (IOException ex) {
            }
        }
    }
    public static synchronized void getMessage(String message, Client fromUser) { //рассылка сообщения пользователя всем остальным
        fromUser.out.println("Me:\n" + message);
        for (Client user : users) {
            if (user != fromUser) {
                user.out.println("Other #" + fromUser.id + ": " + message);
            }
        }
    }
}
