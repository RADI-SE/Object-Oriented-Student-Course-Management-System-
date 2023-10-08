package CSMS;


public class questions{
    private String Quests;
    private String option1;
    private String Correct_Option;
    private String option2;
    private int question_Number=1;
    public questions(String quests, String option1, String correct_Option, String option2 , int question_Num) {
        this.Quests = quests;
        this.option1 = option1;
        this.Correct_Option = correct_Option;
        this.option2 = option2;
        this.question_Number = question_Num;

    }
    public String get_Option2() {
        return option2;
    }
    public void set_Option2(String option2) {
        this.option2 = option2;

    }
    public String get_Option1() {
        return option1;
    }

    public void set_Option1(String option1) {
        this.option1 = option1;

    }

    public questions() {
    }

    public String get_Question() {
        return "Question \t" + question_Number +"\t  "+ Quests;
    }

    public void setQuests(String Questions) {

        this.Quests = Questions;


    }

    public String getCorrect_Option() {
        return Correct_Option;
    }

    public void setCorrect_Option(String Correct) {
        this.Correct_Option = Correct;

    }


    public int get_Question_Num() {
        return question_Number;
    }

    public questions set_Question_Num(int quiz_Number) {
        this.question_Number = quiz_Number;
        return null;
    }
    public String display(){
        return "Question  "+question_Number+") "+Quests +"\t1."+ option2 +"\t2."+ option1+"\n ";
    }

}
