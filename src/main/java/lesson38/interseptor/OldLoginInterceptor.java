package lesson38.interseptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class OldLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("\n-------- OldLoginInterceptor.preHandle --- ");
        System.out.println("Request URL: " + request.getRequestURL());
        System.out.println("Sorry! This URL is no longer used, Redirect to /admin/login");

        response.sendRedirect(request.getContextPath()+"/admin/login");
        return false;
    }

    @Override
    public void postHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

        // This code will never be run.
        System.out.println("\n-------- OldLoginInterceptor.postHandle --- ");
    }

    @Override
    public void afterCompletion(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // This code will never be run.
        System.out.println("\n-------- QueryStringInterceptor.afterCompletion --- ");
    }

}
