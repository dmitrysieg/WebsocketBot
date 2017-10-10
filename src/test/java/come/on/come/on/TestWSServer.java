package come.on.come.on;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class TestWSServer {

    public static void main(String[] args) {

        try {
            Server server = new Server();

            ServerConnector http = new ServerConnector(server);
            http.setHost("localhost");
            http.setPort(8080);
            http.setIdleTimeout(30000);

            // Set the connector
            server.addConnector(http);

            // Set a handler
            server.setHandler(new TestHandler());

            server.start();
            server.dumpStdErr();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
