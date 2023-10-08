package CSMS;
import java.util.ArrayList;
import java.util.List;


class Quiz {
    private String quiz_Title;
    private String quiz_Date;
    List<questions> list = new ArrayList<>();
    questions obj;
    public Quiz(String quiz_Title, String date, List<questions> list) {
        this.quiz_Title = quiz_Title;
        this.quiz_Date = date;
        this.list = list;
    }
    Quiz() {
    }
    public void set_Quiz_Title(String quiz_Title) {
        this.quiz_Title = quiz_Title;
    }
    public void set_Quiz_Date(String quiz_Date) {
        this.quiz_Date = quiz_Date;
    }
    public String get_Questions() {
        System.out.println("Total Questions "+ list.size());
        int i = 0;
        for (var x : list) {
            System.out.println(list.get(i).get_Question()+"\n\t"+ x.get_Option1()+"\t\t"+x.get_Option2()+x.getCorrect_Option());
        i++;
        }
        return "";
    }
    public String display() {
        return "Quiz " + " title   " + quiz_Title + "\t  date  " + quiz_Date;
    }

    public void set_Questions(questions  quest) {
          //this.obj=quest;
        list.add(quest);
    }
    public String get_Quiz_Title() {
        return quiz_Title;
    }
    public String get_Quiz_Date() {
        return quiz_Date;
    }

}


