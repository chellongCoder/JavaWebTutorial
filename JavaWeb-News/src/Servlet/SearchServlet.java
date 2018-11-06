package Servlet;

import BEAN.New;
import Model.NewManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            this.processRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            this.processRequest(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void processRequest (HttpServletRequest request, HttpServletResponse response) throws  Exception {
        String param = request.getParameter("search");
        List<New> news = NewManager.searchNew(param);
        request.setAttribute("news", news);
        request.setAttribute("search", param);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
