package com.example.quiz_assignment;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    private static final String PREF_FILE_NAME = "MyPreferences";
    private static final String KEY_TOTAL_QUESTIONS = "totalQuestions";
    private static final String KEY_TOTAL_CORRECT_ANSWERS = "totalCorrectAnswers";

    private static final String KEY_LANGUAGE = "language";


    public static void saveTotalQuestions(Context context, int totalQuestions) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_TOTAL_QUESTIONS, totalQuestions);
        editor.apply();
    }


    public static int getTotalQuestions(Context context, int defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_TOTAL_QUESTIONS, defaultValue);
    }


    public static void saveTotalCorrectAnswers(Context context, int totalCorrectAnswers) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(KEY_TOTAL_CORRECT_ANSWERS, totalCorrectAnswers);
        editor.apply();
    }


    public static int getTotalCorrectAnswers(Context context, int defaultValue) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(KEY_TOTAL_CORRECT_ANSWERS, defaultValue);
    }

    public static void deleteTotalQuestions(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY_TOTAL_QUESTIONS);
        editor.apply();
    }

    public static void deleteTotalCorrectAnswers(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(KEY_TOTAL_CORRECT_ANSWERS);
        editor.apply();
    }

    public static void saveLanguage(MainActivity mainActivity, String selectedLanguage) {
        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences(PREF_FILE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_LANGUAGE, selectedLanguage);
        editor.apply();
    }

}
