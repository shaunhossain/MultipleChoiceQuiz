package com.sample.multiplechoicequiz;



public class QuestionBank {


    private String textQuestions [] = {

            "1. When did Google acquired Android?",
            "2. What is the name of build toolkit for Android Studio?",
            "3. What widget can replace any use of radio buttons?",
            "4. Android application implements principle of _____.",
            "5. What are the indirect Direct subclasses of Services?",
            "6. Layouts in Android?",
            "7. Once installed on a device, each Android app lives in____?",
            "8. Which programming language use in Android?",
            "9. You can shut down an activity by calling its ____ method.",
            "10.Which of the following is not a Java keyword?"

    };


    private String multipleChoice [][] = {
            {"2003", "2004", "2005", "2006"},
            {"JVM", "Gradle", "Dalvik", "HAXM"},
            {"Toggle Button", "Spinner", "Switch Button", "ImageButton"},
            {"least privileges", "most privileges", "unique privileges", "none of the above"},
            {"recognitionService", "remoteViewsService", "spellCheckerService", "inputMethodService"},
            {"Frame Layout", "Linear Layout", "Relative Layout", "All of the above"},
            {"Device Memory","External Memory","Security Sandbox","None"},
            {"C++","C#","Java","Python"},
            {"finish()","finishActivity()","onDestroy()","None"},
            {"static","try","new","goto"}
    };


    private String mCorrectAnswers[] = {"2005", "Gradle", "Spinner", "least privileges","inputMethodService","All of the above",
            "Security Sandbox","Java","finish()","goto"};


    public int getLength(){
        return textQuestions.length;
    }


    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }



    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }


    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}