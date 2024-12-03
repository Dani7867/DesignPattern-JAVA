package behavioral.interpreter;

public class Substract implements Expression {
	private final Expression leftExpression;
	private final Expression rightExpression;
	
	public Substract(Expression leftExpression , Expression rightExpression) {
		this.rightExpression = rightExpression;
		this.leftExpression = leftExpression;
	}
	@Override
	public int interpret() {
		
		return leftExpression.interpret() - rightExpression.interpret();
	}

}
