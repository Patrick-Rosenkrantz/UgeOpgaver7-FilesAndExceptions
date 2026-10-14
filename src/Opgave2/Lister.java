package Opgave2;

import java.util.ArrayList;

public class Lister {

    public String getItem(ArrayList<String> items, int index) {
        if (index > items.size())
            throw new ArrayIndexOutOfBoundsException("Choose between 0 and "+ (items.size() - 1));
        return items.get(index);
    }
}
