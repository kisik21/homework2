package lesson22;

import java.time.ZoneId;

public class Practice {
    public static void main(String[] args) {
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }
    }
}
