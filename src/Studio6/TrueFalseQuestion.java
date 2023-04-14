package Studio6;

import java.util.ArrayList;

public class TrueFalseQuestion extends Question{
    boolean answer;
    boolean choice;
    public TrueFalseQuestion(String question, int value,boolean choice, boolean answer) {
        super(question, value);
        this.choice = choice;
        this.answer = answer;
    }
}

