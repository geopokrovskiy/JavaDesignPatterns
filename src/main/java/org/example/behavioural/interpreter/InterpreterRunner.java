package org.example.behavioural.interpreter;

import org.example.behavioural.interpreter.model.AndExpression;
import org.example.behavioural.interpreter.model.Expression;
import org.example.behavioural.interpreter.model.OrExpression;
import org.example.behavioural.interpreter.model.TerminalExpression;

public class InterpreterRunner {
    /**
     * returns true if 2/3 symptoms are positive
     * @return
     */
    public static Expression getPositiveCovidDiagnosis() {
        Expression smellLoss = new TerminalExpression("smell");
        Expression fever = new TerminalExpression("fever");
        Expression cough = new TerminalExpression("cough");

        Expression or1 = new OrExpression(new AndExpression(smellLoss, fever), new AndExpression(smellLoss, cough));
        Expression or2 = new OrExpression(new AndExpression(smellLoss, fever), new AndExpression(fever, cough));
        return new OrExpression(or1, or2);
    }

    public static void main(String[] args) {
        String symptoms1 = "I have lost my smell but for the rest everything it's ok.";
        System.out.println("Patient 1 is positive: " + getPositiveCovidDiagnosis().interpret(symptoms1));

        String symptoms2 = "I have troubles with smell and fever is around 38 C.";
        System.out.println("Patient 2 is positive: " + getPositiveCovidDiagnosis().interpret(symptoms2));
    }
}
