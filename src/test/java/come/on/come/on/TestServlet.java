package come.on.come.on;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

public class TestServlet extends WebSocketServlet {

    public void configure(WebSocketServletFactory factory) {
        factory.register(TestSocket.class);
    }
}
