package cs.ubc.ca;

public class Main {

    public static void main(String[] args) {
    	// write your code here
        // (Operator op, String num1, String num2, int right, boolean abs)
        Constrains cons = new Constrains();

        // A > G
        Constrain c1 = new Constrain(Operator.greater, "A", "G", 0, false);
        cons.addConstrain(c1);

        // A <= H
        Constrain c2 = new Constrain(Operator.lessEqual, "A", "H", 0, false);
        cons.addConstrain(c2);

        // |F - B| = 1
        Constrain c3 = new Constrain(Operator.equal, "F", "B", 1, true);
        cons.addConstrain(c3);

        // G < H
        Constrain c4 = new Constrain(Operator.less, "G", "H", 0, false);
        cons.addConstrain(c4);

        // |G - C| = 1
        Constrain c5 = new Constrain(Operator.equal, "G", "C", 1, true);
        cons.addConstrain(c5);

        // |H - C| is even
        Constrain c6 = new Constrain(Operator.isDivisible, "H", "C", 0, true);
        cons.addConstrain(c6);

        // H != D
        Constrain c7 = new Constrain(Operator.notEqual, "H", "D", 0, false);
        cons.addConstrain(c7);

        // D > G
        Constrain c8 = new Constrain(Operator.greater, "D", "G", 0, false);
        cons.addConstrain(c8);

        // D != C
        Constrain c9 = new Constrain(Operator.notEqual, "D", "C", 0, false);
        cons.addConstrain(c9);

        // E != C
        Constrain c10 = new Constrain(Operator.notEqual, "E", "C", 0, false);
        cons.addConstrain(c10);

        // E < D - 1
        Constrain c11 = new Constrain(Operator.less, "E", "D", -1, false);
        cons.addConstrain(c11);

        // E != H - 2
        Constrain c12 = new Constrain(Operator.notEqual, "E", "H", -2, false);
        cons.addConstrain(c12);

        // G != F
        Constrain c13 = new Constrain(Operator.notEqual, "G", "F", 0, false);
        cons.addConstrain(c13);

        // H != F
        Constrain c14 = new Constrain(Operator.notEqual, "H", "F", 0, false);
        cons.addConstrain(c14);

        // C != F
        Constrain c15 = new Constrain(Operator.notEqual, "C", "F", 0, false);
        cons.addConstrain(c15);

        // D != F
        Constrain c16 = new Constrain(Operator.notEqual, "D", "F", 0, false);
        cons.addConstrain(c16);

        // |E - F| is odd
        Constrain c17 = new Constrain(Operator.isDivisible, "E", "F", 1, true);
        cons.addConstrain(c17);

//        String[] variables = {"A", "B", "C", "D", "E", "F", "G", "H"};
        String[] variables = {"F", "H", "C", "D", "G", "E", "A", "B"};
        int[] domain = {1, 2, 3, 4};

        Tree t = new Tree(variables, domain, cons);

        PrintVisitor.printTree(t, variables);
    }
}
