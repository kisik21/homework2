package lesson30.Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<Object> parts = new ArrayList<>();
    public void addPart(String part) {
        parts.add(part);
    }
    public String toString() {
        return "Product: " + parts;
    }
}