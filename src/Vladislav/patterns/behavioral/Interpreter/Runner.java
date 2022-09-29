package Vladislav.patterns.behavioral.Interpreter;

public class Runner {
    public static void main(String[] args) {
        Expression isPHP = getPhpExpression();
        Expression isPHPandSQL = getSQLExpression();

        System.out.println("Does developer know PHP: " + isPHP.interpret("PhpCore"));
        System.out.println("Does developer know SQL: " + isPHPandSQL.interpret("Php SQL"));
    }

    public static Expression getPhpExpression() {
        Expression php = new TerminalExpression("Php");
        Expression phpCore = new TerminalExpression("PhpCore");
        return new OrExpressin(php, phpCore);
    }

    public static Expression getSQLExpression() {
        Expression php = new TerminalExpression("Php");
        Expression sql = new TerminalExpression("SQL");
        return new AndExpression(php, sql);
    }
}
