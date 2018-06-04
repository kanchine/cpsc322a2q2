package cs.ubc.ca;


import java.util.Map;

public class Constrain {
    private boolean abs;
    private String num1;
    private String num2;
    private Operator op;
    private int right;

    public Constrain(Operator op, String num1, String num2, int right, boolean abs) {
        this.op = op;
        this.num1 = num1;
        this.num2 = num2;
        this.abs = abs;
        this.right = right;
    }

    public boolean Satisfy(Map<String, Integer> mp) {

        if(mp.containsKey(num1) && mp.containsKey(num2)) {
            int opRes = mp.get(num1) - mp.get(num2);
            if(abs)
                opRes = Math.abs(opRes);

            return op.apply(opRes, right);

        }

        return true;
    }

}
