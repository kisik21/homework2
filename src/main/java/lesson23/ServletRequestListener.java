package lesson23;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.annotation.WebListener;

import java.time.LocalDateTime;
@WebListener
public class ServletRequestListener implements jakarta.servlet.ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent rEvent) {
        System.out.println("Time is: " + LocalDateTime.now());
    }
}