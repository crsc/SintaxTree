package tree;

public class Operator {
    public static final Operator add = new Operator("add",'+',OperatorType.BINARY);
    public static final Operator substract = new Operator("substract",'-',OperatorType.BINARY);
    public static final Operator product = new Operator("product",'*',OperatorType.BINARY);
    
    private String name;
    private final char operator;
    private final OperatorType operatorType;

    private Operator(String name) {
        this(name, ' ',OperatorType.BINARY);
    }
    
    private Operator(String name, char operator, OperatorType operatorType) {
        this.name = name;
        this.operator = operator;
        this.operatorType = operatorType;
    }

    public String getName() {
        return name;
    }
    
    public String getOperator() {
        if (operator == ' ') return name;
        return Character.toString(operator);
    }
    
}
