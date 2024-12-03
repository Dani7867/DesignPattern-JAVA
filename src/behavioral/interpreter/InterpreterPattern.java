package behavioral.interpreter;

public class InterpreterPattern {

	public static void main(String[] args) {
		Expression leftExpression = ExpressionHandler.getOperator("+", new Number(50), new Number(3));
        Expression rightExpression = ExpressionHandler.getOperator("-", new Number(2), new Number(1));
        Expression finalExpression = ExpressionHandler.getOperator("*", leftExpression, rightExpression);
        
        System.out.println("Result: " + finalExpression.interpret());
	}
}
