import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) req;
        HttpServletResponse httpRes = (HttpServletResponse) res;
        HttpSession sess=httpReq.getSession();
        System.out.println("Called3");
        if(sess.getAttribute("userName")!=null&&sess.getAttribute("userName").equals("Akash")){
            System.out.println("Called1");
            chain.doFilter(req, res);
        }else{
            System.out.println("Called2");
            httpRes.sendRedirect("login.jsp");
        }
    }
}
