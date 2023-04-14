package Studio6;

import java.util.ArrayList;

public abstract class Question {
    private String questions;
    private ArrayList<String> choices = new ArrayList<>();
    private int value;
    private String answers;

    public Question(String questions, int value) {
        super();
        this.questions = questions;

        this.value = value;

    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}