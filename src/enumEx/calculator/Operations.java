package enumEx.calculator;

public enum Operations {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    }, MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    }, DIVISION("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    }, MULTI("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    };

    private final String symbol;

    Operations(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);


}
