import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    public void init(){

    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();

        String firstName = req.getParameter("first_name");
        String lastName = req.getParameter("last_name");
        int age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");


        out.println(
                "<html>" +
                        "<head><title>Example</title></head>" +
                        "<body>" +
                        "<h1>Parameters</h1>" +
                        "<ul>" +
                        "<li><b>First Name</b>: " +
                        firstName +
                        "<li><b>Last Name</b>: " +
                        lastName +
                        "<li><b>Age</b>: " +
                        age +
                        "<li><b>Email</b>: " +
                        email +
                        "</ul>" +
                        "</body>" +
                        "</html>"


        );

    }
        class Person {
            String firstName;
            String lastName;
            int age;
            String email;

        }

}
