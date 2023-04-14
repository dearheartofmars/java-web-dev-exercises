package Studio6;

import java.util.ArrayList;

    public class CheckboxQuestion extends Question{
        private ArrayList<String> answer;
        private ArrayList<String> choices;

        public CheckboxQuestion(String question, int value, ArrayList<String> choices, ArrayList<String> answer) {
            super(question, value);
            this.choices = choices;
            this.answer = answer;
        }
}
