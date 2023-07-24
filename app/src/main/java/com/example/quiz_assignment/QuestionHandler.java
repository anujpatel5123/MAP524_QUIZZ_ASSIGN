package com.example.quiz_assignment;

import java.util.ArrayList;

public class QuestionHandler {
    private ArrayList<QuestionItem> questionList;
    private ArrayList<Integer> colorList;

    public QuestionHandler(ArrayList<QuestionItem> questionList, ArrayList<Integer> colorList) {
        this.questionList = questionList;
        this.colorList = colorList;
    }

    public ArrayList<QuestionItem> getQuestionList() {
        return questionList;
    }

    public ArrayList<Integer> getColorList() {
        return colorList;
    }
}
