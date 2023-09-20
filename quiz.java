import java.util.Scanner;
 public class quiz {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] questions = {
                    "A.Who is the first programmer in the world?",
                    "B.Who developed the first automatic digital computer?",
                    "C. Which programming language is known for its 'write once, run anywhere' slogan?",
                    "D. Who developed python?",
                    "E.When was Java developed ?"
            };

            String[][] choices = {
                    {"1.Charles Babbage","2.Ada Lovelace","3.James gosling","4.Dennis Ritchie"},
                    {"1.Dennis Ritchie","2.Guido Van Rossum","3.Charles babage","4.John Vincent Atanasoff"},
                    {"1. C++", "2. Python", "3. Java", "4. Ruby"},
                    {"1. Charles Dickens", "2.Guido Van Rossum", "3. Yukihiro Matsumoto", "4.Dennis Ritchie"},
                    {"1. 1995", "2. 1985", "3. 1990", "4. 1996"}
            };

            int [] answers = {2,3,3,2,1};

            int score = 0;

            System.out.println("\nMultiple Choice Quiz\n");

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (int j = 0; j < choices[i].length; j++) {
                    System.out.println(choices[i][j]);
                }

                System.out.print("Enter your answer : ");
                int userAnswer= sc.nextInt();

                if (userAnswer == answers[i]) {
                    System.out.println("Correct!\n");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + answers[i] + "\n");
                }
            }

            System.out.println("Quiz completed!");
            System.out.println("Your score: " + score + " out of " + questions.length);


        }
}
