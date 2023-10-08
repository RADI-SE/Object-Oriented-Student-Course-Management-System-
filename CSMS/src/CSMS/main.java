package CSMS;
import  java.util.*;
public class main {

    public static void main(String[] args) {
        List<questions> qList = new ArrayList<>();
        List<Quiz> QuizList = new ArrayList<>();
        boolean a = true;
        int i = 1;
        while (a) {
            back:
            {
                if (i == 0) {
                    break;
                } else {
                    try {
                        System.out.println("1. to Add Quiz ");
                        System.out.println("2. to Add Questions ");
                        System.out.println("3. to View Quiz ");
                        System.out.println("4. to Modify Quiz ");
                        System.out.println("5. to Delete ");
                        System.out.println("6. to Start the Quiz ");
                        Scanner co = new Scanner(System.in);
                        int ch = co.nextInt();
                        if (ch == 1) {
                            boolean c = true;
                            while (c) {

                                Quiz QuizObj = new Quiz();
                                System.out.println("Enter title of the Quiz");
                                Scanner title = new Scanner(System.in);
                                QuizObj.set_Quiz_Title(title.next());

                                System.out.println("Enter date of Quiz");
                                Scanner date = new Scanner(System.in);
                                QuizObj.set_Quiz_Date(date.next());

                                QuizList.add(QuizObj);
                                c = false;
                            }
                        }
                        if (ch == 2) {
                            boolean b = true;
                            System.out.println(" Enter the tilte of the quiz ");
                            Scanner scan = new Scanner(System.in);
                            String title = scan.next();

                            for (Quiz x : QuizList) {
                                if (x.get_Quiz_Title().equalsIgnoreCase(title)) {
                                    while (b) {
                                        questions obj2 = new questions();
                                        System.out.println("Question : ");
                                        Scanner Question = new Scanner(System.in);
                                        obj2.setQuests(Question.nextLine());

                                        System.out.println("option: " + 'b');
                                        Scanner Options = new Scanner(System.in);
                                        obj2.set_Option1(Options.nextLine());


                                        System.out.println("option: " + 'a');
                                        Scanner ob3 = new Scanner(System.in);
                                        obj2.set_Option2(ob3.nextLine());

                                        System.out.println(" Correct answer ");
                                        Scanner Correct = new Scanner(System.in);
                                        obj2.setCorrect_Option(Correct.nextLine());
                                        obj2.set_Question_Num(x.list.size() + 1);
                                        qList.add(obj2);
                                        x.set_Questions(obj2);

                                        System.out.println(" true for add more questions or any key to exit. ");
                                        Scanner bool = new Scanner(System.in);
                                        b = bool.nextBoolean();
                                    }
                                }else{
                                    System.out.println("Quiz Title not found, Check it! ");
                                }

                            }
                        }


                        if (ch == 3) {
                            System.out.println("Enter title of the Quiz to check its information");
                            Scanner tt23 = new Scanner(System.in);
                            String it32 = tt23.next();
                            for (Quiz x1 : QuizList) {
                                if (x1.get_Quiz_Title().equalsIgnoreCase(it32)) {
                                    System.out.println(x1.display());
                                    x1.get_Questions();
                                }
                            }
                        }
                        if (ch == 4) {
                            int uj;
                            for (Quiz x : QuizList) {
                                    do {
                                        System.out.println("1.Title of  the Quiz");
                                        System.out.println("2.Date of   the Quiz");
                                         System.out.println("3.Delete    Questions");
                                        System.out.println("4.Question  Modify");
                                        System.out.println("0.   for exit");
                                        Scanner s = new Scanner(System.in);
                                        uj = s.nextInt();
                                        switch (uj) {
                                            case 1:

                                                System.out.println("Enter title of the Quiz to check its information");
                                                Scanner t = new Scanner(System.in);
                                                String title = t.next();
                                                for (Quiz xx : QuizList) {
                                                    if (xx.get_Quiz_Title().equalsIgnoreCase(title)) {
                                                        xx.set_Quiz_Title(title);
                                                    }
                                                }

                                                break;
                                            case 2:

                                                System.out.println("Enter title of the Quiz to check its information");
                                                Scanner tt = new Scanner(System.in);
                                                String tit = tt.next();
                                                for (Quiz xx : QuizList) {
                                                    if (xx.get_Quiz_Title().equalsIgnoreCase(tit)) {
                                                        System.out.println("update the date ");
                                                        Scanner date = new Scanner(System.in);
                                                        String de = date.next();
                                                        if (xx.get_Quiz_Title().equalsIgnoreCase(de)) {
                                                            xx.set_Quiz_Date(de);
                                                        }
                                                    }
                                                }
                                                break;
                                                        case 4:
                                                            System.out.println("Questions ");
                                                            System.out.println("Enter title of the Quiz to check its information");
                                                            Scanner tt23 = new Scanner(System.in);
                                                            String it32 = tt23.next();
                                                            for (Quiz x1 : QuizList) {
                                                                if (x1.get_Quiz_Title().equalsIgnoreCase(it32)) {
                                                                    int nub;
                                                                    x1.get_Questions();
                                                                    System.out.println("Enter the Quiz title which you want delete");
                                                                    Scanner n = new Scanner(System.in);
                                                                    nub = n.nextInt();
                                                                    for (var x2 : qList) {
                                                                        x2.display();
                                                                        if (x2.get_Question_Num() == nub) {
                                                                               x1.list.remove(qList.indexOf(x2));
                                                                                x1.list.get(nub-1).set_Question_Num(x2.get_Question_Num());
                                                                                x2.set_Question_Num(x2.get_Question_Num());
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 5:
                                                            System.out.println("Questions :: ");
                                                            System.out.println("Enter title of the Quiz to check its information");
                                                            Scanner tt33 = new Scanner(System.in);
                                                            String it3 = tt33.next();
                                                            int z;
                                                            boolean b=true;
                                                            for (Quiz x1 : QuizList) {
                                                                if (x1.get_Quiz_Title().equalsIgnoreCase(it3)) {
                                                                    x1.get_Questions();
                                                                    System.out.println("Enter number of question which u want to modify");
                                                                    Scanner nua = new Scanner(System.in);
                                                                    z = nua.nextInt();
                                                                    for (var c : qList) {
                                                                        if (c.get_Question_Num() == z) {
                                                                            while(b) {
                                                                                    System.out.println("Question : ");
                                                                                    Scanner Question = new Scanner(System.in);
                                                                                    c.setQuests(Question.nextLine());
                                                                                    System.out.println("option: " + 'b');
                                                                                    Scanner Options = new Scanner(System.in);
                                                                                    c.set_Option1(Options.nextLine());
                                                                                    System.out.println("option: " + 'a');
                                                                                    Scanner ob3 = new Scanner(System.in);
                                                                                    c.set_Option2(ob3.nextLine());
                                                                                    System.out.println(" Correct answer ");
                                                                                    Scanner Correct = new Scanner(System.in);
                                                                                    c.setCorrect_Option(Correct.nextLine());
                                                                                    c.set_Question_Num(c.get_Question_Num());
                                                                                    qList.set(z,c); // :)
                                                                                  //x1.set_Questions(c);
                                                                                b=false;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            break;
                                                        case 0:
                                                            break back;
                                                    }
                                                }while (uj != 4) ;
                                    }
                                  }
                    if (ch == 5) {
                        String nub;
                        System.out.println("Enter the Quiz title which you want delete");
                        Scanner n = new Scanner(System.in);
                        nub = n.next();
                        int s = 0;
                        for (var x : QuizList) {
                            if (x.get_Quiz_Title().equals(nub)) {
                                QuizList.remove(s);

                            }
                            s++;
                        }
                    }

                        if (ch == 6) {
                            int o = 0,b=0 ;
                            Scanner ans = new Scanner(System.in);
                            System.out.println("Enter title of the Quiz ");
                            Scanner titlec = new Scanner(System.in);
                            String ti = titlec.next();
                            for (var x : QuizList) {
                                if (x.get_Quiz_Title().equalsIgnoreCase(ti)) {
                                    System.out.println("the quiz started ");
                                    for (var xx : qList) {
                                        System.out.println(qList.get(b).display());
                                        b++;
                                        if (xx.get_Question_Num() != 0) {
                                                 for (  int j = 0 ; j <= o ; j++){
                                                    System.out.println("Enter your ans");
                                                    String as = ans.nextLine();
                                                    if (xx.getCorrect_Option().equalsIgnoreCase(as)) {
                                                        if (xx.get_Option1().equals(xx.getCorrect_Option()) || xx.get_Option2().equals(xx.getCorrect_Option())) {
                                                            System.out.println("your ans is correct " + xx.getCorrect_Option());
                                                        } else if (!xx.get_Option1().equals(xx.getCorrect_Option()) || !xx.get_Option2().equals(xx.getCorrect_Option())) {
                                                            System.out.println("wrong ans");
                                                        }
                                                    }
                                                }
                                                // Question 1
                                                    // ANS
                                                // Question 2
                                                    // ANS
                                        }
                                    }
                                }
                            }
                        }
                                }catch(Exception e){
                                  System.out.println("");
                            }
                        }
                        }
                    }
                }

            }
