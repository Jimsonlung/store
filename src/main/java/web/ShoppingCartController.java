package main.java.web;

import main.java.entity.ShoppingCart;
import main.java.entity.User;
import main.java.service.ShoppingCartService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name="shoppingCartServlet", urlPatterns = {"/shoppingCart.do"})
public class ShoppingCartController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("loginUser");
        if (user!=null) {
            ShoppingCartService shoppingCartService = new ShoppingCartService();
            ShoppingCart cart = shoppingCartService.getCartContext(user.getId());
            request.setAttribute("cart", cart);
            request.getRequestDispatcher(request.getContextPath() + "/shoppingCartLanded.jsp").forward(request, response);
        }
        request.getRequestDispatcher(request.getContextPath() + "/shoppingCart.jsp").forward(request,response);
    }
}
