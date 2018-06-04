package cs.ubc.ca;

public enum Operator {
    greaterEqual {
        @Override public boolean apply(int left, int right) {
            return left >= right;
        }
    },

    lessEqual {
        @Override public boolean apply(int left, int right) {
            return left <= right;
        }
    },

    greater {
        @Override public boolean apply(int left, int right) {
            return left > right;
        }
    },

    less {
        @Override public boolean apply(int left, int right) {
            return left < right;
        }
    },

    equal {
        @Override public boolean apply(int left, int right) {
            return left == right;
        }
    },

    isDivisible {
        @Override public boolean apply(int left, int right) {
            return left % 2 == right;
        }
    },

    notEqual {
        @Override public boolean apply(int left, int right) {
            return left != right;
        }
    };

    public abstract boolean apply(int left, int right);

}
