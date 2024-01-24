package lesson38.config;

import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringWebAppInitializer implements WebApplicationInitializer {


    @Override
    public void onStartup(jakarta.servlet.ServletContext servletContext) throws jakarta.servlet.ServletException {
        AnnotationConfigWebApplicationContext appContext = new AnnotationConfigWebApplicationContext();
        appContext.register(ApplicationContextConfig.class);

        ServletRegistration.Dynamic dispatcher = (ServletRegistration.Dynamic) servletContext.addServlet("SpringDispatcher",
                new DispatcherServlet(appContext)); // crutch?
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}