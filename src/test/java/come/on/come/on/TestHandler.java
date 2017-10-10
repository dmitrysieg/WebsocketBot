package come.on.come.on;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestHandler extends AbstractHandler {

    public void handle(String s,
                       Request request,
                       HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse
    ) throws IOException, ServletException {

        httpServletResponse.getWriter().print("Hello!");
        httpServletResponse.getWriter().flush();
    }
}
