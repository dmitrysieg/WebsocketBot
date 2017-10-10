package come.on.come.on;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.junit.Test;

import java.net.URI;
import java.util.concurrent.Future;

public class TestClient {

    @Test
    public void tryConnect() {

        final URI uri = URI.create("ws://localhost:8080/events/");
        final WebSocketClient client = new WebSocketClient();

        try {
            try {
                client.start();
                final TestSocket socket = new TestSocket();
                final Future<Session> fut = client.connect(socket,uri);
                final Session session = fut.get();
                session.getRemote().sendString("Hello");
                session.close();
            } finally {
                client.stop();
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
