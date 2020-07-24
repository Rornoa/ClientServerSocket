package RodFill;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Phone {

    private final Socket socket;
    private final BufferedReader reader;
    private final BufferedWriter writer;

    public Phone(Socket socket) {
        this.socket =socket;
        this.reader = createReader(this.socket.getInputStream());
    }
    public Phone(ServerSocket socket){
        this.socket = server.accept();
    }

    private BufferedReader createReader(InputStream input){
        return new BufferedReader(new InputStreamReader(input));
    }

    private BufferedWriter createWriter(OutputSteam output){
        return new BuffereedWriter(new OutputStreamWriter(output));
    }
}
