package lesson38.interseptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler)
            throws Exception {

        System.out.println("\n-------- AdminInterceptor.preHandle --- ");
        return true;
    }

    @Override
    public void postHandle(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("\n-------- AdminInterceptor.postHandle --- ");
    }

    @Override
    public void afterCompletion(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        System.out.println("\n-------- AdminInterceptor.afterCompletion --- ");
    }

}
