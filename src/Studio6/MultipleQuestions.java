package Studio6;

import java.util.ArrayList;

public class MultipleQuestions extends Question {
    private String answer;
    ArrayList<String> choices;

    public MultipleQuestions(String question, int value, ArrayList<String> choices ,String answer) {
        super(question, value);
        this.choices = choices;
        this.answer = answer;
    }
}
