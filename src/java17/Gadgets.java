package src.java17;

import java.util.ArrayList;

public record Gadgets(ArrayList<String> products) {

    public Gadgets{
        if(products==null)
        {
            throw  new IllegalArgumentException("list cannot be empty");
        }
    }
}
