package cs.ubc.ca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Constrains {
    private List<Constrain> constrains;

    public Constrains() {
        constrains = new ArrayList<>();
    }

    public void addConstrain(Constrain constrain) {
        constrains.add(constrain);
    }

    public boolean satisfyAll(Map<String, Integer> mp) {

        for(Constrain cons : constrains) {
            if(!cons.Satisfy(mp))
                return false;
        }

        return true;
    }
}
