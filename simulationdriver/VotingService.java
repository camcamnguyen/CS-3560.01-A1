package simulationdriver;
import java.util.ArrayList;
import java.util.Random;


//configured with question type and answers
//voting service should accept/check submissions from students and
//checks for answer changes
public class VotingService extends Student{
    
    //keep track of how many students chose which answer
    private int choiceA = 0;
    private int choiceB = 0;
    private int choiceC = 0;
    private int choiceD = 0;
    private int choiceE = 0;
    
    private int isTrue = 0;
    private int isFalse = 0;
    
    private int correct = 0;
    private int incorrect = 0;
    
    
    //assume all students answered in order for them to change their answer
    public void changeAnswer(String name, int question){
        Random rand = new Random();
        boolean doYouWantToChange;
        doYouWantToChange = rand.nextBoolean();
        if(doYouWantToChange == true){
            System.out.println(name + " has changed their answer.");
            //call method to change student answer
            if(question == 1)
                settrueFalse();
            else if(question == 2)
                setOneAnswer();
            else if(question == 3 || question == 4){
                setMultipleChoices();
            }
        }
    }
    
    public void trueFalse(boolean answer){
        //check the true/false answer of the student
        if(answer == true){
            System.out.println("Their answer is right");
            isTrue++;
        }
        else{
            System.out.println("Their answer is wrong. Better luck next time!");
            isFalse++;
        }
    }
    
    public void mcSocialDistance(String answer){
        //check the multiple choice answer for the student
        //there can only be ONE right answer
        //does NOT allow for more than one selection
        if(answer.equals("A")){
            System.out.println("Their answer is wrong. Better luck next time!");
            choiceA++;
        }
        else if(answer.equals("C")){
            System.out.println("Their answer is wrong. Better luck next time!");
            choiceC++;
        }
        else if(answer.equals("D")){
            System.out.println("Their answer is wrong. Better luck next time!");
            choiceD++;
        }
        else if(answer.equals("E")){
            System.out.print("Their answer is wrong. Better luck next time!");
            choiceE++;
        }
        else{
            System.out.println("Their answer is correct!");
            choiceB++;
        }
    }
    
    
    public void mcSymptoms(ArrayList answer){
        //check the multiple choice answer for the student
        //the student can choose MULTIPLE answers
        //but there is only ONE correct answer
        if(answer.contains("B") || answer.contains("C") || answer.contains("D") || answer.contains("E")){
            System.out.println("Their answer is wrong. Better luck next time!");
            incorrect++;
        }
        else{
            System.out.println("Their answer is correct!");
            correct++;
        }
    }
    
    public void mcReduceTheSpread(ArrayList answer){
        //check the multiple choice answer for the student
        //the student can choose multiple answers
        //there are MULTIPLE CORRECT answers
        
        // makes sure that if the student chooses all 5 options
        //that they are not correct (b/c they would have A,C,D)
        if (answer.contains("B") || answer.contains("E")){
            System.out.println("Their answer is incorrect. Better luck next time!");
            incorrect++;
        }
        else if(answer.contains("A") && answer.contains("C") && answer.contains("D")){
            System.out.println("Their answer is correct!");
            correct++;
        }
        
        //makes sure that if a single option is choosen,
        //that it is not considered correct
        else{
            System.out.println("Their answer is incorrect. Better luck next time!");
            incorrect++;
        }
    }
    
    public void maskStats(){
        //output the final statistics
        //how many people chose true or false
        //print mask question
        System.out.println("The correct answer is true.");
        System.out.println(isTrue + " students chose correctly.");
        System.out.println(isFalse + " students chose incorrectly");
        System.out.println("\n");
    }
    
    public void mcSocialDistanceStats(){
        //output the final statistics
        //who chose which multiple choice answer
        //print social distance question
        System.out.println("The correct answer is B. 6ft");
        System.out.println(choiceA + " students chose A. 12ft.");
        System.out.println(choiceB + " students chose B. 6ft.");
        System.out.println(choiceC + " students chose C. 10ft.");
        System.out.println(choiceD + " students chose D. 8ft.");
        System.out.println(choiceE + " students chose E. 4ft");
        System.out.println("\n");
    }
    
    public void mcSymptomsStats(){
        //output who chose the correct multiple choice answer
        //allowed for MULTIPLE selections
        //but only ONE is correct
        //print symptoms question
        System.out.println("The correct answer is only A. Coughing");
        System.out.println(correct + " students got the question correct.");
        System.out.println(incorrect + " students got the question incorrect.");
        System.out.println("\n");
        correct = 0;
        incorrect = 0;
    }
    
    public void reduceTheSpreadStats(){
        //allowed for MULTIPLE selections
        //MORE THAN ONE correct answer
        //print reduce the spread question
        System.out.println("The correcct answer is A, C, D");
        System.out.println(correct + " students got the question correct.");
        System.out.println(incorrect + " students got the question wrong.");
        System.out.print("\n");
    }
    
}
