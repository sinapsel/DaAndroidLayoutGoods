import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static String income;
    static String outcome;
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Waiting...");
            Socket s = ss.accept();
            PrintStream out = new PrintStream(s.getOutputStream());
            Scanner in = new Scanner(s.getInputStream());
            Scanner cin = new Scanner(System.in);
            out.println("Hello from server with hell");
            System.out.println(s.getInetAddress());
            try {
                    new Thread(){
                        @Override
                        public void run(){
                            while (true) {
                                try {
                                    income = in.next();
                                } catch (Exception e) {}
                                if (income != null)
                                    System.out.println(income);
                                income = null;
                            }
                        }
                    }.start();

                            while(true) {
                                try {
                                    outcome = cin.next();
                                } catch (Exception e) {}
                                if (outcome != null)
                                    out.println(outcome);
                                outcome = null;
                            }

                }catch (Exception e){
                    out.println("bye");
                }
        } catch (IOException e) {}
    }
}
