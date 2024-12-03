package behavioral.interpreter;


import java.util.Stack;

abstract class Expressionn {
    public abstract boolean interpret(String context);
}

class BracketExpression extends Expressionn {
    @Override
    public boolean interpret(String context) {
        Stack<Character> stack = new Stack<>();

        for (char ch : context.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}' || ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Closing bracket with no opening bracket
                }
                char opening = stack.pop();
                if (!isMatchingPair(opening, ch)) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // Return true if all opening brackets have closing ones
    }

    private boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}

public class Parser {
    private Expressionn expression;

    public Parser() {
        this.expression = new BracketExpression();
    }

    public boolean parse(String codeSnippet) {
        return expression.interpret(codeSnippet);
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        
        String codeSnippet = "for(i=0;i<3;i++){ temp = i*2; }"; // Sample input
        boolean isBalanced = parser.parse(codeSnippet);
        
        System.out.println("Are the brackets balanced? " + isBalanced);
    }
}

